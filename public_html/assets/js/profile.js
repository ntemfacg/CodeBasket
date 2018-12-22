var rootURL = "http://privatefirmpharmacy.com/assets/api/public/register";


$(document).ready(function(){
      	//initialize the javascript
    App.init();

	console.log('Get Patients ');
    patient = localStorage.getItem("patientID");
    dob = localStorage.getItem("phone");
    /*alert(pt);*/
    
    $.ajax({

		type: 'POST',

		url: rootURL + '/getcustomer',

		dataType: "json", // data type of response
		
		data: {value: patient},
		
		success: function(r) {
		    /*var profile_details = JSON.parse(r);*/
		    /*alert(r);*/
		    document.getElementById("pt-name").innerHTML= r.fname +" "+ r.lname;
            document.getElementById("phone-num").innerHTML = r.phone;
            document.getElementById("medi-aller-his").innerHTML = "History: "+r.MedicalHistory +" Allergies: "+ r.Allergies;
            document.getElementById("post-code").innerHTML = r.postCode;
            document.getElementById("address-loc").innerHTML = r.houseNo +" "+ r.road;
            document.getElementById("d-o-b").innerHTML = r.dob;
            
		    

		},
		error: function(r2) {
		    /*$("#changeling").html(r2.responseText);*/
		    alert("ajax error: ",r2.responseText);
		    
		}

	});
    

	$.ajax({

		type: 'POST',

		url: rootURL + '/getconsultations',

		dataType: "json", // data type of response
		
		data: {value: patient},
		
		success: function(r) {
		    /*var profile_details = JSON.parse(r);*/
		    /*alert(r);*/
		    
		    jQuery.each(r, function(index, value){
		        var markup = "<tr><td class='user-avatar'><img src='assets/img/icon-01.png' alt='Avatar'></td><td>"+value.presentingComplaint+"</td><td>"+value.date+"</td><td class='actions'><a href='#' class='icon'><i class='mdi mdi-delete'></i></a></td></tr>";
		        /*alert(r.presentingComplaint);*/
            
                
		        $('#table-complaints tbody').append(markup);
		        
		        
		    });
		    

		},
		error: function(r2) {
		    /*$("#changeling").html(r2.responseText);*/
		    alert("ajax error: ",r2.responseText);
		    
		}

	});
	    
});