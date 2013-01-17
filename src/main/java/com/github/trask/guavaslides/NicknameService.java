package com.github.trask.guavaslides;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.github.trask.guavaslides.Names.Name;
import com.ning.http.client.AsyncHttpClient;
import com.ning.http.client.AsyncHttpClient.BoundRequestBuilder;
import com.ning.http.client.Response;

public class NicknameService {

    public static enum PonyType {
        FEMALE_EARTH_PONY(33803), FEMALE_PEGASUS_PONY(33804), FEMALE_UNICORN_PONY(33805),
        MALE_EARTH_PONY(33806), MALE_PEGASUS_PONY(33807), MALE_UNICORN_PONY(33808),
        UNISEX_SILLY_PONY(33809), UNISEX_FOODIE_PONY(33810), UNISEX_DARK_EVIL_PONY(33811);
        private final int code;
        private PonyType(int code) {
            this.code = code;
        }
    }

    public static String generateNickname(Name name) throws Exception {
        AsyncHttpClient asyncHttpClient = new AsyncHttpClient();
        BoundRequestBuilder request = asyncHttpClient
                .preparePost("http://rumandmonkey.com/widgets/toys/namegen/14900");
        request.addParameter("nametype", "" + PonyType.FEMALE_UNICORN_PONY.code);
        request.addParameter("name", name.toString());
        request.addParameter("submit", "What's my Pony name");
        request.addParameter("id", "14900");
        request.addParameter("page", "2");
        Response response = request.execute().get();
        asyncHttpClient.close();
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
