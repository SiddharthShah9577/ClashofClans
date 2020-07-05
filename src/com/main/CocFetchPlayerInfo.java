package com.main;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;


public class CocFetchPlayerInfo {
	public Map<String, Object> details(String id) {
		BufferedReader in=null;
		String inputLine,text = null;;

		Map<String, Object> retMap = new HashMap<>();
	try {
	URL url = new URL("https://api.clashofclans.com/v1/players/%23PY9LORP2");
	HttpURLConnection urlConn = (HttpURLConnection) url.openConnection();
	urlConn.setRequestMethod("GET");
	urlConn.setRequestProperty("Authorization","Bearer "+"eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzUxMiIsImtpZCI6IjI4YTMxOGY3LTAwMDAtYTFlYi03ZmExLTJjNzQzM2M2Y2NhNSJ9.eyJpc3MiOiJzdXBlcmNlbGwiLCJhdWQiOiJzdXBlcmNlbGw6Z2FtZWFwaSIsImp0aSI6ImJjNjhkOTE1LTVmYzMtNDc1YS05N2M1LTJmMDNjZWEzY2RjNCIsImlhdCI6MTU5Mzg2ODgxMywic3ViIjoiZGV2ZWxvcGVyLzY0MTRjZjQ1LTYyZjItMzZlOC1jY2IyLWY3YmQ1NjY5MTAyNSIsInNjb3BlcyI6WyJjbGFzaCJdLCJsaW1pdHMiOlt7InRpZXIiOiJkZXZlbG9wZXIvc2lsdmVyIiwidHlwZSI6InRocm90dGxpbmcifSx7ImNpZHJzIjpbIjIwNi4xODkuMTgwLjQiLCIyMDMuMTkyLjIxMy4xNjkiXSwidHlwZSI6ImNsaWVudCJ9XX0.jXd2g5hh8Ya5RvhqSQucSwypFChRYVvxZsMlPuJu0PIAIWXs2pXgzbegZM8CIJUISBItB8Zswi8f9hGeqt_tQA");
	

	urlConn.setRequestProperty("Content-Type","application/json");
	 in = new BufferedReader(new InputStreamReader(
			urlConn.getInputStream()));
			while ((inputLine = in.readLine()) != null) {
			 text=inputLine;
			System.out.println(inputLine);
			} 
			in.close();
	        retMap = new Gson().fromJson(
	        		text, new TypeToken<HashMap<String, Object>>() {}.getType()
	        	);
	        Gson gson = new Gson(); 
	        
	        // Converting json to object 
	        // first parameter should be prpreocessed json 
	        // and second should be mapping class 
	        Root root 
	            = gson.fromJson(text, 
	            		Root.class); 
	}
	catch(Exception e){
		System.out.println(e);
	}	
	return retMap;
	}
}
