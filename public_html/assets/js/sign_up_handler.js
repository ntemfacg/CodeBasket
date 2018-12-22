$(document).ready(function(){
$('#signup').click(function() {
        /*console.log(2);*/
        var $role_string = $("#role").val();
        if (document.getElementById('rad6').checked) {
            var $role = 1;
        } else if (document.getElementById('rad7').checked){
            var $role = 2;
        }
        var $RegNumber = $("#regNumber").val();
        var $last_name = $("#lname").val();
        var $first_name = $("#fname").val();
        var $email = $("#email").val();
        var $password = $("#pass1").val();
        /*console.log($role)*/
        add($role, $RegNumber, $last_name, $first_name, $email, $password);
        
    });
});