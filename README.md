# compatabilitypredictor
Used this jar file: http://www.java2s.com/Code/Jar/j/Downloadjsonsimple111jar.htm to work with JSON in Java along with org.json &  com.google.code.gson libraries in Maven.

The files to look at are: output.java and compatabilityPredictor.java. I have an input.json file (imported) and an output.json file (created from a file).
You can ignore all the other files, I was using them to get familiar with JSON.

The way my program takes input is: 
  It looks into the JSON file and grabs the object, grabs the array in the object, and then grabs the information from the object within the array. Although not finished, I would have parsed through the object and return the name and corresponding integer attribute values. 
The way my program takes outputs is: 
  Although I wasn't able to finish the project, the process I was working on was to average all the values of the team members, with different weight for different attributes. I would then average individually for each applicant, and then divide the applicant by the team member to gauge how close the applicants average was to the whole team average. Since the max seems to be 10, the individual averages would be out of 40. Afterwards 
