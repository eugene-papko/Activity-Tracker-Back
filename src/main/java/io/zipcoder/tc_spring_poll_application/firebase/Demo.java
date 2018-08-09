package io.zipcoder.tc_spring_poll_application.firebase;

import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo {
	@GetMapping("/timestamps")
	@CrossOrigin
	public FirebaseResponse getAllTimestamps () throws FirebaseException, JsonParseException, JsonMappingException, IOException, JacksonUtilityException {

		String firebase_baseUrl = "https://schedule-app-zcw.firebaseio.com";
		Firebase firebase = new Firebase( firebase_baseUrl );

		// "PUT" (test-map into the fb4jDemo-root)
//		Map<String, Object> dataMap = new LinkedHashMap<String, Object>();
//		dataMap.put( "PUT-root", "This was PUT into the fb4jDemo-root" );
//		response = firebase.patch( dataMap );
//		System.out.println( "\n\nResult of PUT (for the test-PUT to fb4jDemo-root):\n" + response );
//		System.out.println("\n");
		return firebase.get("datapoints");


//		// "PUT" (test-map into a sub-node off of the fb4jDemo-root)
//		dataMap = new LinkedHashMap<String, Object>();
//		dataMap.put( "Key_4", "This is the first value" );
//		dataMap.put( "Key_5", "This is value #2" );
//		Map<String, Object> dataMap2 = new LinkedHashMap<String, Object>();
//		dataMap2.put( "Sub-Key1", "This is the first sub-value" );
//		dataMap.put( "Key_6", dataMap2 );
//		response = firebase.patch( "test-PUT", dataMap );
//		System.out.println( "\n\nResult of PUT (for the test-PUT):\n" + response );
//		System.out.println("\n");
//
//
//		// "GET" (the test-PUT)
//		response = firebase.get( "test-PUT" );
//		System.out.println( "\n\nResult of GET (for the test-PUT):\n" + response.getBody() );
//		System.out.println("\n");
////
////
////		// "POST" (test-map into a sub-node off of the fb4jDemo-root)
//		response = firebase.post( "test-POST", dataMap );
//		response = firebase.post( "test-POST", dataMap );
//		response = firebase.post( "test-POST", dataMap );
//		response = firebase.post( "test-POST", dataMap );
//		System.out.println( "\n\nResult of POST (for the test-POST):\n" + response );
//		System.out.println("\n");
		
		
		// "DELETE" (it's own test-node)
//		dataMap = new LinkedHashMap<String, Object>();
//		dataMap.put( "DELETE", "This should not appear; should have been DELETED" );
//		response = firebase.put( "test-DELETE", dataMap );
//		System.out.println( "\n\nResult of PUT (for the test-DELETE):\n" + response );
//		response = firebase.delete( "test-DELETE");
//		System.out.println( "\n\nResult of DELETE (for the test-DELETE):\n" + response );
//		response = firebase.get( "test-DELETE" );
//		System.out.println( "\n\nResult of GET (for the test-DELETE):\n" + response );
		
	}
}