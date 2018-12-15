var rootURL = "http://privatefirmpharmacy.com/assets/api/public/register";

function loadAll() {

	console.log('findAll');

	$.ajax({

		type: 'GET',

		url: rootURL,

		dataType: "json", // data type of response

		success: function(r) {
		    console.log(r)
		    
		},

	});

}

function findById(RegNumber, password) {

	console.log('findbyId: ' + RegNumber);

	$.ajax({

		type: 'POST',

		url: rootURL + '/tst',

		dataType: "json", // data type of response
		
		data: {RegNumber, password},

		success: function(r) {
		   /* console.log(r)*/
		   apitoken(r)
		    
		},
		error: function(r2) {
		    console.log("error: " + r2.responseText)
		    
		}

	});

}

function apitoken(idtoken) {

	console.log('token: ' + idtoken);

	$.ajax({

		type: 'DELETE',

		url: rootURL + '/tk',

		dataType: 'json', // data type of response
		
		data: {idtoken},

		success: function(r) {
		    console.log(r);
		    tokenadder(idtoken)
		    
		},
		error: function(r2) {
		    console.log("error: " + r2.responseText)
		    
		}

	});

}

function tokenadder(idtoken) {

	console.log('tokenadd: ' + idtoken);

	$.ajax({

		type: 'POST',

		url: rootURL + '/tkadd',

		dataType: 'json', // data type of response
		
		data: {idtoken},

		success: function(r) {
		    window.location = 'index.php';
		    console.log("Cookie added: " + r)
		    
		},
		error: function(r2) {
		    console.log("error: " + r2.responseText)
		    
		}

	});

}


function login_session() {

	console.log('login verifier ');

	$.ajax({

		type: 'GET',

		url: rootURL + '/auth',

		contentType: 'application/json', // data type of response
		

		success: function(r) {
		    console.log(r);

		},
		error: function(r2) {
		    console.log(r2)
		    
		}

	});

}

function get_all_patients() {

	console.log('Get Patients ');

	$.ajax({

		type: 'GET',

		url: rootURL + '/getpatients',

		contentType: 'application/json', // data type of response
		
		

		success: function(r) {
		    var profile_details = JSON.parse(r);
		    
		    jQuery.each(profile_details, function(index, value){
		        var markup = "<tr><td class='user-avatar'> <img src='assets/img/avatar6.png' alt='Avatar'>"+value.fname+"</td><td>"+value.lname+"</td><td>"+value.phone+"</td><td class='center'>"+value.postCode+"</td></tr>";
		        var table = $("table").dataTable()
		        table.append(markup);
		        console.log(value);
		    });
		    

		},
		error: function(r2) {
		    console.log(r2)
		    
		}

	});

}

function add(role, RegNumber, last_name, first_name, email, password) {

	console.log('signup: ' + last_name);
	var lastname = last_name;
	var firstname = first_name

	$.ajax({

		type: 'POST',

		url: rootURL + '/add',

		contentType: 'application/json', // data type of response
		
		data: {role, RegNumber, lastname, firstname, email, password},

		success: function(r) {
		    /*window.location = 'index.php';*/
		    console.log(r)
		    
		},
		error: function(r) {
		    console.log(role);
		}

	});

}

function ptadd(last_name, first_name, dob, phone, history, allergies, HouseNumber, road, postCode) {

	console.log('patientadd: ' + phone);

	$.ajax({

		type: 'POST',

		url: rootURL + '/ptadd',

		dataType: "json", // data type of response
		
		data: {last_name, first_name, dob, phone, history, allergies, HouseNumber, road, postCode},

		success: function(r) {
		    console.log(3)
		    
		},
		error: function(r) {
		    console.log(r);
		}

	});

}

function logout() {

	console.log('logout: ');

	$.ajax({

		type: 'DELETE',

		url: rootURL + '/logout',

		contentType: 'application/json', // data type of response
		
		data: {},

		success: function(r) {
		    window.location = 'index.php';
		    console.log("Logged out: " + r)
		    
		},
		error: function(r2) {
		    console.log("error: " + r2.responseText)
		    
		}

	});

}
