package com.company;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        try {
            Scanner lukija = new Scanner(System.in);
            System.out.println("Name: ");
            String name = lukija.nextLine();
            String message = "";
            String ip = "http://34.241.196.106:8080";


            while(true) {
                System.out.println("Message: ");
                message = lukija.nextLine();
                String header = "Content-Type:application/json";
                String data = "{\"name\":\"" + name + "\",\"message\":\"" + message + "\"}";
                String[] toimijat = {"post", ip, data, header};
                post(toimijat);

            }
        }catch (Exception e) {
            System.out.println("Virhe.");
    }
    }



    public static void post(String[] toiminnot) {
        try {
            URL url = new URL(toiminnot[1]);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();

            con.setRequestMethod("POST");
            int i = 3;
            while (i < toiminnot.length) {
                String[] headeri = toiminnot[i].split(":");
                con.setRequestProperty(headeri[0], headeri[1]);
                i++;
            }

            String data = toiminnot[2];

            con.setDoOutput(true);
            DataOutputStream wr = new DataOutputStream(con.getOutputStream());
            wr.writeBytes(data);
            wr.flush();
            wr.close();

            int responseCode = con.getResponseCode();
            System.out.println("\nSending 'POST' request to URL : " + toiminnot[1]);
            System.out.println("URL: " + toiminnot[1]);
            System.out.println("Response Code : " + responseCode);
            System.out.println("Data: " + data);

            BufferedReader in = new BufferedReader(
                    new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();

        } catch (Exception e) {
            System.out.println("Virhe metodin puolella.");

        }
    }
}
