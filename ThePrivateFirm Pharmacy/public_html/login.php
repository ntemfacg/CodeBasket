<?php
include('assets/api/dbinf.php');
if (isset($_POST['login'])) {
        $username = $_POST['username'];
        $password = $_POST['password'];
        if (DB::query('SELECT RegNumber FROM Register WHERE RegNumber=:username', array(':username'=>$username))) {
                if ($password == (DB::query('SELECT password FROM Register WHERE RegNumber=:username', array(':username'=>$username))[0][password])) {
                        /*echo 'Logged in!';*/
                        $cstrong = True;
                        $token = bin2hex(openssl_random_pseudo_bytes(64, $cstrong));
                        $user_id = DB::query('SELECT RegNumber FROM Register WHERE RegNumber=:username', array(':username'=>$username))[0]['RegNumber'];
                        DB::query('INSERT INTO tokens VALUES (:user_id, :token)', array(':token'=>sha1($token), ':user_id'=>$user_id));
                        setcookie("PFPID", $token, time() + 60 * 60 * 24 * 7, '/', NULL, NULL, TRUE);
                        setcookie("PFPID_", '1', time() + 60 * 60 * 24 * 3, '/', NULL, NULL, TRUE);
                } else {
                        echo 'Incorrect Password!';
                        /*echo $password;*/
                }
        } else {
                echo 'User not registered!';
        }
}
