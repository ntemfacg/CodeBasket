<?php
    class db{
        // Properties
        private $dbhost = 'localhost';
        private $dbuser = 'qa1rpgce_dbuser';
        private $dbpass = 'dW^~v)G^*_J45vL8';
        private $dbname = 'qa1rpgce_privateFirmDB';
        // Connect
        public function connect(){
            $mysql_connect_str = "mysql:host=$this->dbhost;dbname=$this->dbname";
            $dbConnection = new PDO($mysql_connect_str, $this->dbuser, $this->dbpass);
            $dbConnection->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
            return $dbConnection;
        }
    }