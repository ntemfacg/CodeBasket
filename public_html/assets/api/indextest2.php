<?php
require("conn.php");

/*$db = new mysqli("localhost", "qa1rpgce_dbuser", "dW^~v)G^*_J45vL8", "qa1rpgce_privateFirmDB");*/

if ($_SERVER['REQUEST_METHOD'] == "GET") {
        if ($_GET['url'] == "auth") {
            echo "GET";
        } else if ($_GET['url'] == "patients") {
        }
} else if ($_SERVER['REQUEST_METHOD'] == "POST") {
        if ($_GET['url'] == "auth") {
        	$query="select * from Register where RegNumber= '". $_GET['RegNumber'] ."' and password= '". $_GET['password']."'";
        	$result=  mysqli_query($connect, $query);

if(! $result)

{ die("Error in query");}
 //get data from database

 $output=array();
while($row=  mysqli_fetch_assoc($result))

{
 $output[]=$row;  //$row['id']
 break;
}

 if ($output) {
print( "{'msg':'Pass Login'". ",'info':'". json_encode($output) ."'}");// this will print the output in json
 }

 else{
 	print("{'msg':'cannot login'}");
 }

// 4 clear
mysqli_free_result($result);
//5- close connection
mysqli_close($connect);
            
   /*     	{
        	if ($query->num_rows > 0){
        		$_SESSION['loggedin'] = $dets;
        		exit('Logged In' + $row);
        	
        	}else
        		echo $query + "5";
}*/
}
}
        