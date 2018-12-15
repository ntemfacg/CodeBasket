<?php
require("dbinf.php");

$db = new DB("localhost", "qa1rpgce_privateFirmDB", "qa1rpgce_dbuser", "dW^~v)G^*_J45vL8");

if ($_SERVER['REQUEST_METHOD'] == "GET") {
        if ($_GET['url'] == "auth") {
            /*echo ('Get');*/
        } else if ($_GET['url'] == "users") {
        }
    
} else if ($_SERVER['REQUEST_METHOD'] == "POST") {
        if ($_GET['url'] == "auth") {
                $postBody = file_get_contents("php://input");
                $postBody = json_decode($postBody);
                /*$RegNumber = $postBody->RegNumber;*/
                $RegNumber = $_POST[$RegNumber];
                /*$password = $postBody->password;*/
                $password = $_POST['password'];
                echo ($RegNumber);
                console.log (2);
                if ($db->query('SELECT RegNumber FROM Register WHERE RegNumber=:username', array(':username'=>$RegNumber))) {
                        if ($password == ($db->query('SELECT password FROM Register WHERE RegNumber=:username', array(':username'=>$username))[0][password])){
                                $cstrong = True;
                                $token = bin2hex(openssl_random_pseudo_bytes(64, $cstrong));
                                $user_id = $db->query('SELECT RegNumber FROM Register WHERE RegNumber=:RegNummber', array(':RegNumber'=>$RegNumber))[0]['RegNumber'];
                                $db->query('INSERT INTO tokens VALUES (:user_id, :token)', array(':user_id'=>$user_id,':token'=>sha1($token)));
                                echo '{ "token": "'.$token.'" }';
                        } else {
                                http_response_code(401);
                        }
                } else {
                        echo '{ "token": "'.$_GET['RegNumber'].'" }';
                }
        }
}  else if ($_SERVER['REQUEST_METHOD'] == "DELETE") {
        if ($_GET['url'] == "auth") {
                if (isset($_GET['token'])) {
                        if ($db->query("SELECT token FROM login_tokens WHERE token=:token", array(':token'=>sha1($_GET['token'])))) {
                                $db->query('DELETE FROM login_tokens WHERE token=:token', array(':token'=>sha1($_GET['token'])));
                                echo '{ "Status": "Success" }';
                                http_response_code(200);
                        } else {
                                echo '{ "Error": "Invalid token" }';
                                http_response_code(400);
                        }
                } else {
                        echo '{ "Error": "Malformed request" }';
                        http_response_code(400);
                }
        }
} else {
        http_response_code(405);
}
?>