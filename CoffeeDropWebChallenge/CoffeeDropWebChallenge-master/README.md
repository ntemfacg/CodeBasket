# Coffee Drop Web Challenge
This task requires you to build a responsive website which will be tested on a variety of devices with different screen sizes, and a variety of browsers. The site should be built from the designs included in this github repository
 
## Brief
A brand new start up, CoffeeDrop, have spotted a gap in the market to build an Android and IOS mobile app which shows their existing 16 national coffee shops, listing them as "locations" for recycling Nespresso coffee pods, for which the client will recieve "cashback" - money for each pod.

In addition to the app, they have commissioned a responsive single page website to advertise the service. This has been designed, and now needs building. The client has specified a specific stack of technologies that they would like to see on their site, which are described in the specification below.


### Specification 
0.1 The specification shall be used as follows - Shall requirements are core functionality, Should are desired functionality and Could is optional functionality.

1.1 The website shall be a single page site

1.1.1 The design files should be converted as accurately as possible

1.2 The website shall incorporate the content on the designs or in the repository

1.2.1 The developer should use any images he/she likes found on any sites on the internet - as this is a programming challenge only there is no need to worry about copywrite (as the site will never be published)

1.3 The developer shall take as little or as long time as the applicant desires to develop the site

1.3.1 The developer shall not be expected to spend any more than 4 hours on the project.

1.3.2 The developer could spend as long as he/she liked however.

1.4 The developer should use Bootstrap 4, Sass and either jQuery or Vue.js.

1.5 The developer could use Wordpress to allow content to be updated.


2.1 The website will be fully responsive

2.2 The website shall allow users to view a map with the CoffeeDrop locations marked upon it

2.2.1 These locations should be marked on the map using co-ordinates found in the following API call: http://coffeedrop.staging2.image-plus.co.uk/api/locations

2.2.2 The map should update if a new location is added.

2.2.3 The map could take into account any additional information returned by the API call (but this is optional)
 
## What we are looking for
 - Completion of an website that fulfills the specification
 - Use of best practices for the appropriate programming language (Html, Sass, Wordpress, JQuery, Vue)
 - Appropriate consumption and error handling of provided API
 - Attractive styling matching the designs provided accurately
 - Clean, well-commented code 

 
## Technical Details
- The simple API can be consumed by using the url http://coffeedrop.staging2.image-plus.co.uk
- There is no authentication for the API
- There is rate limiting of no more than 90 requests per 10s on the API
- There is inherited rate limiting of one request per second on the "postcode" request as this will call the free postcode.io API behind 

 
 ## Submission Instructions
  - Please email your contact at Image+ with a link to a github repository containing your submission, as well as be prepared to discuss the technical apsects of the challenge at your interview.
  - Uploading the site for us to view on some hosting would be appreciated but not required as long as all the assets required for us to test the site locally are required

