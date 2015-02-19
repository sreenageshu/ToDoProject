package com.todo.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

import org.json.JSONException;
import org.json.JSONObject;

public class UserMappings {
     public static void main (String args[]) throws NumberFormatException, IOException, JSONException{
    	 HashMap<Integer, String>  user = new HashMap<Integer, String>();
    	 user.put(1, "Sam");
    	 user.put(2, "Amy");
    	 user.put(3, "Andrew");
    	 user.put(4, "Wilson");
    	 
    	 System.out.println("Enter the number of the key looking for : ");
    	 BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
    	 int key = Integer.parseInt(br.readLine());
    	 String value = user.get(key);
    	 System.out.printf( "username: %s", value );
    	 
    	 //retrieving map key/pair values as json object
    	 JSONObject json = new JSONObject().put(value, key);
    	 System.out.printf( "JSON: %s", json );
     }
}
