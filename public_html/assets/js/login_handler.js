$(document).ready(function(){
      	//initialize the javascript
      	/*login_session();*/
      	get_all_patients();
      	$('#login').click(function() {
        var $RegNumber = $("#username").val();
        var $password = $("#password").val();
        findById($RegNumber, $password);
        });
      	App.init();
      });