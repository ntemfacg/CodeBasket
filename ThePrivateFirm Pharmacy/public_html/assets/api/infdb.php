<?php
class DB {
        private static function connect() {
                $pdo = new PDO('mysql:host=localhost;dbname=qa1rpgce_privateFirmDB;charset=utf8', 'qa1rpgce_dbuser', 'dW^~v)G^*_J45vL8');
                $pdo->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
                return $pdo;
        }
        public static function query($query, $params = array()) {
                $statement = self::connect()->prepare($query);
                $statement->execute($params);
                if (explode(' ', $query)[0] == 'SELECT') {
                $data = $statement->fetchAll();
                return $data;
                }
        }
}