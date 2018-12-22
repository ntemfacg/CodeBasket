<?php

require_once 'include/db_connect.php';
        // connecting to database
        $db = new db_connect();
        $conn = $db->connect();

if ($_SERVER['REQUEST_METHOD'] == "GET") {
        $stmt = $conn->prepare("SELECT * FROM Register");
        $stmt->execute();
        $stmt->store_result();
        $num_rows = $stmt->num_rows;
        $stmt->close();
} else if ($_SERVER['REQUEST_METHOD'] == "POST") {
        echo "POST";
} else {
        http_response_code(405);
}


?>