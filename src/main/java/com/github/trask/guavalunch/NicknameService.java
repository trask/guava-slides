package com.github.trask.guavalunch;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.github.trask.guavalunch.Names.Name;
import com.ning.http.client.AsyncHttpClient;
import com.ning.http.client.AsyncHttpClient.BoundRequestBuilder;
import com.ning.http.client.Response;

public class NicknameService {

    public static String generateNickname(Name name) throws Exception {
        System.out.println("generating nickname for " + name);
        AsyncHttpClient asyncHttpClient = new AsyncHttpClient();
        BoundRequestBuilder request = asyncHttpClient
                .preparePost("http://rumandmonkey.com/widgets/toys/namegen/14900");
        request.addParameter("nametype", "33803");
        request.addParameter("name", "Trask Stalnaker");
        request.addParameter("submit", "What's my Pony name");
        request.addParameter("id", "14900");
        request.addParameter("page", "2");
        Response response = request.execute().get();
        String body = response.getResponseBody();
        Pattern pattern = Pattern.compile(
                "Princess Celestia smiles and officially grants you the Pony name:\t</p>\\s+"
                        + "<p align=\"center\" class=\"article-body-big\">\\s+"
                        + "<b>(.*?)</b>\\s+"
                        + "</p>");
        Matcher matcher = pattern.matcher(body);
        matcher.find();
        return matcher.group(1);
    }
}
