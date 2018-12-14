// ==UserScript==
// @name         New Userscript
// @match        *://*/*
// @namespace    http://tampermonkey.net/
// @version      0.1
// @description  try to take over the world!
// @author       george
// @grant        GM_setValue
// @grant        GM_xmlhttpRequest
// @grant        GM_getValue
// @grant        GM_addStyle
// @require      https://code.jquery.com/jquery-3.0.0-alpha1.min.js
// @require      https://gist.github.com/raw/2625891/waitForKeyElements.js
// @include      https://www.youtube.com/*
// @include      http://www.youtube.com/*
// @include      http://youtube.com/*
// @include      https://youtube.com/*
// @include      localhost/*
// @run-at       document-end
// ==/UserScript==

console.log("Running");

$(document).keyup(function(event) {
    console.log(event);
});

var mrefreshinterval = 100;
     var lastmousex=-1;
     var lastmousey=-1;
     var lastmouseX_dir;
     var lastmouseY_dir;
     var lastmousetime;
     var mousetravel;
     var direction;
     var pps;
     var a;
     var time_curr = Math.floor(Date.now());



waitForKeyElements ('#dismissable', clicklistener);
function clicklistener() {
     var divs = $('.style-scope ytd-compact-video-renderer'); //style-scope ytd-compact-autoplay-renderer
     for(var i=0; i<divs.length; i++){
         console.log(divs[i]);
         var n_div = divs[i];
         divs[i].el_id= i + 1;
         divs[5].style.backgroundColor = 'green';
         //console.log(a.type);
         divs[i].style.backgroundColor = 'blue ';
         divs[i].addEventListener('click', function(e) {
             console.log(this.el_id);
             addtodb(Date.now(Date.parse),e.clientX, e.clientY, mousespeed(e.clientX, e.clientY, Date.now(Date.parse)), mousedirection(e.clientX, e.clientY), 1, this.el_id);
});
}}

function addtodb(d,x,y,speed,direction, click, element) {
        GM_xmlhttpRequest ( {
    method: "GET",
    url: "http://localhost/mousedynamics/mdynamics.php?timestamp="+ d +"&xcoord="+ x +"&ycoord="+ y +"&speed="+ speed +"&direction=" + direction + "&click="+click+"&element="+element,
    onload: function(response) {
       //console.log(response.responseText);
        //console.log(d,x, y, speed, direction, click,element);
  }
});
}

function mousespeed(xcoord, ycoord, timenow) {
    if (lastmousex > -1)
         mousetravel = Math.max( Math.abs(xcoord-lastmousex), Math.abs(ycoord-lastmousey) );
         //console.log("xcoord", xcoord, "ycoord: ", ycoord, "lastmousex: ", lastmousex, "lastmousey: ", lastmousey, "timenow: ", timenow, "lastmousetime: ", lastmousetime);
    if (lastmousetime && lastmousetime!=timenow) {
        pps = Math.round((mousetravel / (timenow - lastmousetime)) * 1000);
    }
    lastmousetime = timenow;
    lastmousex = xcoord;
    lastmousey = ycoord;
    return pps;
}

function mousedirection(xcoord, ycoord) {
    var dx = xcoord - lastmouseX_dir;
     var dy = ycoord - lastmouseY_dir;
     var angle = Math.atan2(dx,  dy) / Math.PI * 180;
     if (angle > 135 && angle <= 180)
         direction = 1;
     else if (angle > 90 && angle <= 135)
         direction = 2;
     else if (angle > 45 && angle <= 90)
         direction = 3;
     else if (angle > 0 && angle <= 45)
         direction = 4;
     if (angle > -45 && angle <= 0)
         direction = 5;
     else if (angle > -90 && angle <= -45)
         direction = 6;
     else if (angle > -135 && angle <= -90)
         direction = 7;
     else if (angle > -180 && angle <= -135)
         direction = 8;
    lastmouseX_dir = xcoord;
    lastmouseY_dir = ycoord;
    return direction;

}


$(document).mousemove(function(e){
     var xcoord = e.pageX;
     var ycoord = e.pageY;
     //var nDate = new Date();
     var dir = mousedirection(xcoord, ycoord);
     addtodb(Date.now(Date.parse),xcoord, ycoord, mousespeed(xcoord, ycoord, Date.now(Date.parse)), dir, 0,0);
     //console.log(Date.now(Date.parse),xcoord, ycoord, mousespeed(xcoord, ycoord, Date.now(Date.parse)), dir, 0,0);
    //return;
     //$(document).removeEventListener("mousemove");
  // onclick stuff

 });
