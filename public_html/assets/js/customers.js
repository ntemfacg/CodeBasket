var rootURL = "http://privatefirmpharmacy.com/assets/api/public/register";

function consultations(patient) {
    /*alert(patient.id);*/
    var getInput = patient;
    localStorage.setItem("patientID",patient.id);/*
    localStorage.setItem("first_name",patient.first_name);
    localStorage.setItem("last_name",patient.last_name);
    localStorage.setItem("phone",patient.phone);*/
    window.location='profile.html';

}

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
		        var id = value.patientID;
		        var first_name = value.fname;
		        var last_name = value.lname;
		        var post_code = value.postCode;
		        var dob = value.dob;
		        var medicalHistory = value.MedicalHistory;
		        var houseNo = value.houseNo;
		        var road = value.road;
		        var phone = value.patientID;
		        var allergies = value.Allergies;
		        var markup = "<tr><td class='user-avatar'> <img src='assets/img/avatar6.png' alt='Avatar'>"+value.fname+"</td><td>"+value.lname+"</td><td>"+value.phone+"</td><td class='center'>"+value.postCode+"</td><td id="+id+" first_name="+first_name+" last_name="+last_name+" post_code="+post_code+" dob="+dob+" medicalHistory="+medicalHistory+" houseNo="+houseNo+" road="+road+" phone="+phone+" allergies="+allergies+" onclick='consultations(this);' class='actions'><a class='icon'><i class='mdi mdi-settings'></i></a></td></tr>";
		        $('#table1 tbody').append(markup);
		        /*console.log(value);*/
		    });
		    App.dataTables();

		},
		error: function(r2) {
		    console.log(r2)
		    
		}

	});

});