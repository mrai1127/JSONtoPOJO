package com.chamling.rai;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Location {
	public static void main(String[] args) {
		// ("https://api.ip2location.io/?key=701d09fe9f5aebb1807d006be235dad4&ip=8.8.8.8&format=json&lang=en")
		try {
			String ip = "8.8.8.8";
			String key = "701d09fe9f5aebb1807d006be235dad4";
			String url = "https://api.ip2location.io/?key=" + key + "&ip=" + ip +"&format=json&lang=en";
			URL obj = new URL(url);
			HttpURLConnection con = (HttpURLConnection) obj.openConnection();
			con.setRequestMethod("GET");
			con.setRequestProperty("User-Agent", "Mozilla/5.0");
			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String inputLine;
			StringBuffer response = new StringBuffer();
			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			in.close();
			System.out.println(response.toString());
		} catch (Exception e) {
		}
	}
}
