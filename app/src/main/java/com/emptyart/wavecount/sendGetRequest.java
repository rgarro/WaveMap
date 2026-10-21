package com.emptyart.wavecount;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
/**
 *            |    |    |
 *           )_)  )_)  )_)
 *          )___))___))___)\
 *         )____)____)_____)\\
 *      _____|____|____|____\\\__
 * -------\                   /---------
 *     ^^^^^ ^^^^^^^^^^^^^^^^^^^^^
 *     ^^^^      ^^^^     ^^^    ^^
 *           ^^^^      ^^^
 * Sir Henry Morgan is de Lord of Talamanca
 * Who bared record of the word of god, and of the
 * testimony of Jesus Christ and of all things that he saw
 * Mucho playo se viste de negro de jamaica
 * andar jamando es fumar cannabis de jamaica y aguantar moncha
 * Mon-Cha alias moncha en creole
 * que el governador de Jamaica me deje ir a Cardiff
 *
 * @author Rolando <rgarro@gmail.com>
 */
public class sendGetRequest {

    public String travelApiAuthHeader;
    public Integer ids_incremental_index = 1001;//castaearlo a un global para ++ mas tarde despues de la tocola ..

    public String doRequest(String requestUrl) {
        StringBuilder result = new StringBuilder();
        HttpURLConnection conn = null;
        try {
            URL url = new URL(requestUrl);
            conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            //json
            //conn.setRequestProperty("Content-Type", "application/json");
            conn.setRequestProperty("Accept", "application/vnd.exp-hotel.v3+json");
            conn.setRequestProperty("Partner-Transaction-Id", this.ids_incremental_index.toString());
            conn.setRequestProperty("Key", "la Api key del conf aqui");
            conn.setRequestProperty("Authorization","do the authorization and get token here");

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

