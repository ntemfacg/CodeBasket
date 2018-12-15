<?php
use \Psr\Http\Message\ServerRequestInterface as Request;
use \Psr\Http\Message\ResponseInterface as Response;

$app = new \Slim\App;

session_start();


$app->get ('/register', function(Request $request, Response $response){
    $sql = "SELECT * FROM Register";
    if (isset($_COOKIE['pfp_login'])) {
        if (isset($_COOKIE['login'])) {
            
            
            
        }
        
    }
    
    try{
        $db = new db();
        $db = $db->connect();
        
        $stmnt = $db->query($sql);
        $pharmacists = $stmnt->fetchAll(PDO::FETCH_OBJ);
        $db = null;
        echo json_encode($pharmacists);
        console.log(23);
    } catch(PDOException $e){
        echo '{"error": {"text": '.$e->getMessage().'}';
        
    }
});


$app->get ('/register/auth',function(Request $request, Response $response){
    /*$id = $_POST['RegNumber'];*/
    if (isset($_COOKIE['pfp_login'])) {
        $cookie = $_COOKIE['pfp_login'];
        $shacookie = sha1($cookie);
        if (isset($_COOKIE['login'])) {
            $sql = "SELECT user FROM tokens WHERE token='$shacookie'";
            try{
                $db = new db();
                $db = $db->connect();
                /*$stmnt = $db->query($sql);*/
                $stmnt = $db->prepare($sql);
                /*$shacookie = sha1($cookie);
                $stmnt->bindParam(':token',    $shacookie);*/
                $stmnt->execute();
                $pharmacists = $stmnt->fetchAll(PDO::FETCH_OBJ);
                $db = null;
                if (empty($pharmacists)){
                    throw new Exception("No user for");
                }else {
                    echo json_encode($pharmacists);
                    $_SESSION['login'] = $pharmacists[0];
                }
                /*console.log($pharmacists);*/
                
            } catch(PDOException $e){
                echo '{"error": {"text": '.$e->getMessage().'}';
                
            }
            
        }
        
    }else {
        echo 'no or invalid cookie';
    }
});

$app->post ('/register/tst',function(Request $request, Response $response){
    $id = $request->getParam('RegNumber');
    $password = $request->getParam('password');
    $cstrong = True;
    $token = bin2hex(openssl_random_pseudo_bytes(64, $cstrong));
    /*console.log($id);*/
    $sql = "SELECT * FROM Register WHERE RegNumber = $id AND password= $password";
    /*$sq = "INSERT INTO login_tokens (user_id, token) VALUES (:user, :token)";*/
    try{
        $db = new db();
        $db = $db->connect();
        
        $stmnt = $db->query($sql);
        $pharmacists = $stmnt->fetchAll(PDO::FETCH_ASSOC);
        $ret = $pharmacists[0][RegNumber];
        echo ($ret);
        
        
    } catch(PDOException $e){
        echo '{"error": {"text": '.$e->getMessage().'}';
        
    }
});

$app->delete('/register/tk',function(Request $request, Response $response){
    $id = $request->getParam('idtoken');
    $rm = "DELETE FROM tokens WHERE user = $id";
    try{
        $db = new db();
        $db = $db->connect();
        
        /*$stmnt = $db->query($sql);*/
        $stmnt_tk = $db->prepare($rm);
        /*$pharmacists = $stmnt->fetchAll(PDO::FETCH_ASSOC);*/
        $stmnt_tk->execute();
        echo $id;
    
        /*$db = null;*/
        /*$ret = $pharmacists[0][RegNumber];*/
    } catch(PDOException $e){
        echo $e;
        
    }
});

$app->get ('/register/getpatients',function(Request $request, Response $response){
    $id = $request->getParam('RegNumber');
    /*console.log($id);*/
    $sql = "SELECT * FROM PatientDetails Where 1";
    /*$sq = "INSERT INTO login_tokens (user_id, token) VALUES (:user, :token)";*/
    try{
        $db = new db();
        $db = $db->connect();
        
        $stmnt = $db->query($sql);
        $patients = $stmnt->fetchAll(PDO::FETCH_ASSOC);
        $ret = $patients[0];
        echo json_encode($patients);
        
        
    } catch(PDOException $e){
        echo '{"error": {"text": '.$e->getMessage().'}';
        
    }
});

$app->post ('/register/tkadd',function(Request $request, Response $response){
    $id = $request->getParam('idtoken');
    //$id = 1;
    $cstrong = True;
    $token = bin2hex(openssl_random_pseudo_bytes(64, $cstrong));
    $shatoken= sha1($token);
    //$shatoken = 'token';
    $sq = "INSERT INTO tokens (user, token) VALUES
    ($id, '$shatoken')";
    try{
        $db = new db();
        $db = $db->connect();
        /*$stmnt = $db->query($sql);*/
        $stmnt_tk = $db->prepare($sq);
        //$stmt->bind_Param('ss',    $id, $shatoken);
        //$stmt->bindParam(':token',      $shatoken);
        $stmnt_tk->execute();
        echo json_encode("To DB");
        $_SESSION['login'] = $token;
        setcookie("pfp_login", $token, time() + 60 * 60 * 24 * 2, '/', NULL, NULL, TRUE);
        setcookie("login", '1', time() + 60 * 60 * 24 * 1, '/', NULL, NULL, TRUE);
    } catch(PDOException $e){
        echo $e->getMessage();
        
    }
});

/*function tokenizer($ret){
    $cstrong = True;
    $token = bin2hex(openssl_random_pseudo_bytes(64, $cstrong));
    $sql = "INSERT INTO login_tokens VALUES ( :user, :token)', array((':user_id'=>$ret), ':token'=>sha1($token))";
    echo (1);*/
    /*try{
            $db1 = new db();
            $db1 = $db->connect();
            $stmnt2 = $db1->query($sql);
            echo json_encode($token);
            
        } catch (PDOException $exception){
            echo $exception->getMessage();
            
        }
}*/

$app->post('/register/add', function(Request $request, Response $response){
    $firstname = $request->getParam('firstname');
    $lastname = $request->getParam('lastname');
    $RegNumber = json_decode($request->getParam('RegNumber'));
    $email = $request->getParam('email');
    $role = json_decode($request->getParam('role'));
    $password = $request->getParam('password');
    /*console.log(42);*/
    $sql = "INSERT INTO Register (ROLE,RegNumber,LastName,FirstName,Email,password) VALUES
    (:role,:RegNumber,:lastname,:firstname,:email,:password)";
    echo json_encode($firstname);
    try{
        // Get DB Object
        $db = new db();
        // Connect
        $db = $db->connect();
        $stmt = $db->prepare($sql);
        $stmt->bindParam(':role',    $role);
        $stmt->bindParam(':RegNumber',      $RegNumber);
        $stmt->bindParam(':lastname',  $lastname);
        $stmt->bindParam(':firstname', $firstname);
        $stmt->bindParam(':email',      $email);
        $stmt->bindParam(':password',       $password);
        $stmt->execute();
        echo '{"notice": {"text": "Pharmacist Signed up"}';
    } catch(PDOException $e){
        echo '{"api error": {"text": '.$e->getMessage().'}';
    }
});

$app->post('/register/ptadd', function(Request $request, Response $response){
    $firstname = $request->getParam('first_name');
    $lastname = $request->getParam('last_name');
    $RegNumber = json_decode($request->getParam('RegNumber'));
    $email = $request->getParam('email');
    $role = json_decode($request->getParam('role'));
    $password = $request->getParam('password');
    /*console.log(42);*/
    $sql = "INSERT INTO Register (ROLE,RegNumber,LastName,FirstName,Email,password) VALUES
    (:role,:RegNumber,:lastname,:firstname,:email,:password)";
    echo json_encode($firstname);
    try{
        // Get DB Object
        $db = new db();
        // Connect
        $db = $db->connect();
        $stmt = $db->prepare($sql);
        $stmt->bindParam(':role',    $role);
        $stmt->bindParam(':RegNumber',      $RegNumber);
        $stmt->bindParam(':lastname',  $lastname);
        $stmt->bindParam(':firstname', $firstname);
        $stmt->bindParam(':email',      $email);
        $stmt->bindParam(':password',       $password);
        $stmt->execute();
        echo '{"notice": {"text": "Pharmacist Signed up"}';
    } catch(PDOException $e){
        echo '{"error": {"text": '.$e->getMessage().'}';
    }
});

$app->delete('/register/logout', function(Request $request, Response $response){
    
    if (isset($_COOKIE["pfp_login"])) {
        $cookie = $_COOKIE['pfp_login'];
        $shacookie = sha1($cookie);
        $id_ses = $_SESSION['login'];
        
        $sql = "DELETE FROM tokens WHERE token= $shacookie";
        try{
            $db = new db();
            $db = $db->connect();
            /*$stmnt = $db->query($sql);*/
            $stmnt = $db->prepare($sql);
            $stmnt->execute();
            $db = null;
            unset($_SESSION['login']);
            session_destroy();
            setcookie("pfp_login", '1', time()-3600);
            /*console.log("$shacookie");*/
            
        } catch(PDOException $e){
            unset($_SESSION['login']);
            session_destroy();
            echo '{"err": {"text": '.$e->getMessage().'}';
            
        }
        
    } else {
        unset($_SESSION['login']);
        session_destroy();
        echo 'expired';
    }
        
});