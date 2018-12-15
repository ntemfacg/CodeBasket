var rootURL = "http://privatefirmpharmacy.com/assets/api/public/register";


$(document).ready(function(){
      	//initialize the javascript
    App.init();

	console.log('Get Patients ');

	$.ajax({

		type: 'GET',

		url: rootURL + '/getpatients',

		contentType: 'application/json', // data type of response
		
		

		success: function(r) {
		    var profile_details = JSON.parse(r);
		    
		    jQuery.each(profile_details, function(index, value){
		        var markup = "<tr><td class='user-avatar'> <img src='assets/img/avatar6.png' alt='Avatar'>"+value.fname+"</td><td>"+value.lname+"</td><td>"+value.phone+"</td><td class='center'>"+value.postCode+"</td><td class='actions'><a href='#' class='icon'><i class='mdi mdi-settings'></i></a></td></tr>";
		        $("table tbody").append(markup);
		        console.log(value);
		    });
		    App.dataTables();

		},
		error: function(r2) {
		    console.log(r2)
		    
		}

	});
});