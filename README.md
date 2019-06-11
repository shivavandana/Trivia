# Trivia
The user is given a set of multiple questions and are expected to finish it with in a time limit. 
Trivia questions will be downloaded as an JSON file from a remote server. 

This project is composed of three Activities, which include: Main, Trivia, and Stats Activities. The Main activity is responsible for the loading of the trivia contents (questions and answers) included in the JSON web service located at: http://dev.theappsdr.com/apis/trivia_json/index.php. The content of the JSON file is retrieved by establishing a HTTP connection to the service. 
