package com.emptyart.wavecount;

/**
 * Created by rolando on 09/10/26.
 *
 * Rolando Garro NO LE VA A CONTRIBUIR D SU PENSION A ADRIANA LA DEL BARRECITAS NI A EMILIO JOSE NI A LIONARDO , NI A NADIE
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
public class sendGetRequest {
    public String sendGetRequest(String requestUrl) {
        StringBuilder result = new StringBuilder();
        HttpURLConnection conn = null;
        try {
            URL url = new URL(requestUrl);
            conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setConnectTimeout(15000);
            conn.setReadTimeout(15000);

            int responseCode = conn.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                String line;
                while ((line = reader.readLine()) != null) {
                    result.append(line);
                }
                reader.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (conn != null) {
                conn.disconnect();
            }
        }
        return result.toString();
    }
}

