package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.Assert;


public class steps {

    String response;

    @Given("I have the response")
    public void i_have_the_response() {
        response="{\n" +
                "  \"name\": \"Royal Challengers Bangalore\",\n" +
                "  \"location\": \"Bangalore\",\n" +
                "  \"player\": [\n" +
                "    {\n" +
                "      \"name\": \"Faf Du Plessis\",\n" +
                "      \"country\": \"South Africa\",\n" +
                "      \"role\": \"Batsman\",\n" +
                "      \"price-in-crores\": \"7\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"name\": \"Virat Kohli\",\n" +
                "      \"country\": \"India\",\n" +
                "      \"role\": \"Batsman\",\n" +
                "      \"price-in-crores\": \"15\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"name\": \"Glenn Maxwell\",\n" +
                "      \"country\": \"Australia\",\n" +
                "      \"role\": \"Batsman\",\n" +
                "      \"price-in-crores\": \"11\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"name\": \"Mohammad Siraj\",\n" +
                "      \"country\": \"India\",\n" +
                "      \"role\": \"Bowler\",\n" +
                "      \"price-in-crores\": \"7\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"name\": \"Harshal Patel\",\n" +
                "      \"country\": \"India\",\n" +
                "      \"role\": \"Bowler\",\n" +
                "      \"price-in-crores\": \"10.75\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"name\": \"Wanindu Hasaranga\",\n" +
                "      \"country\": \"Srilanka\",\n" +
                "      \"role\": \"Bowler\",\n" +
                "      \"price-in-crores\": \"10.75\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"name\": \"Dinesh Karthik\",\n" +
                "      \"country\": \"India\",\n" +
                "      \"role\": \"Wicket-keeper\",\n" +
                "      \"price-in-crores\": \"5.5\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"name\": \"Shahbaz Ahmed\",\n" +
                "      \"country\": \"India\",\n" +
                "      \"role\": \"All-Rounder\",\n" +
                "      \"price-in-crores\": \"2.4\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"name\": \"Rajat Patidar\",\n" +
                "      \"country\": \"India\",\n" +
                "      \"role\": \"Batsman\",\n" +
                "      \"price-in-crores\": \"0.20\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"name\": \"Josh Hazlewood\",\n" +
                "      \"country\": \"Australia\",\n" +
                "      \"role\": \"Bowler\",\n" +
                "      \"price-in-crores\": \"7.75\"\n" +
                "    },\n" +
                "    {\n" +
                "      \"name\": \"Mahipal Lomror\",\n" +
                "      \"country\": \"India\",\n" +
                "      \"role\": \"Bowler\",\n" +
                "      \"price-in-crores\": \"7.75\"\n" +
                "    }\n" +
                "  ]\n" +
                "}";
    }
    @Then("Validate team has 4 foreign player")
    public void validate_team_has_foreign_player() {
        JSONObject jsonObject = new JSONObject(response);
        int count=0;
        JSONArray jsonArray = jsonObject.getJSONArray("player");
        for (int i = 0; i < jsonArray.length(); i++) {
            
            String country = jsonArray.getJSONObject(i).getString("country");
            if(!country.equalsIgnoreCase("India"))
            {
                ++count;
            }
        }
        Assert.assertEquals(count,4);
    }



    @Then("Atleast 1 wicket keeper in team")
    public void atleast_wicket_keeper_in_team() {
        JSONObject jsonObject = new JSONObject(response);
        boolean flag= false;
        JSONArray jsonArray = jsonObject.getJSONArray("player");
        for (int i = 0; i < jsonArray.length(); i++) {
            String role = jsonArray.getJSONObject(i).getString("role");
            if(role.equalsIgnoreCase("Wicket-keeper"))
            {
                flag=true;
                break;
            }
        }

        Assert.assertTrue(flag);

    }
    }


