package stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Map;

public class WeatherStepDefs {
    @Given("citi id: {long}")
    public void set_city_id(long cityId) {

    }

    @When("we are requesting weather data")
    public void request_weather() {

    }

    @Then("coords are:")
    public void check_coords(Map<String, Double> params) {
        params.get("lon");
    }

    @Then("weather is:")
    public void check_weather(Map<String, String> weatherParams) {
        Long.parseLong(weatherParams.get("id"));
        Double.parseDouble(weatherParams.get("id"));
        Integer.parseInt(weatherParams.get("id"));

    }

    @Then("base is {string}")
    public void check_base(String base){
        
    }

//    @Then("main is")
//    public void check_temp(Map<>)
//
//   @Then("")
}
