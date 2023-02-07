package cucumber.glue;

import entity.ProfilEntity;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import static org.junit.jupiter.api.Assertions.assertEquals;


@CucumberContextConfiguration
@SpringBootTest
public class ProfileSteps {

    private ResponseEntity<ProfilEntity> response;

    //SCENARIO User wants to get an Profile from an id
    @When("^the user calls /api/... with profileId is (-?\\\\d+)$")
    public void getProfileWithIdWhen(int id) {
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost:8001/api/";
        this.response = restTemplate.getForEntity(url,ProfilEntity.class);
    }
    @Then("^the user receives profile status code of (-?\\\\d+)$")
    public void getProfileWithIdThenStatusCode(int status) {
        HttpStatus currentStatusCode = response.getStatusCode();
        assertEquals(status, currentStatusCode.value());
    }
        //SCENARIO User wants to get an Profile from an id
    @When("^the user calls /api/... with profileId is (-?\\\\d+)$")
    public void getProfileWithIdWhen(int id) {

    }
    @Then("^the user receives profile status code of (-?\\\\d+)$")
    public void getProfileWithIdThen(int id) {
    }
    @Then("^the user receives profile status code of (-?\\\\d+)$")
    public void getProfileWithIdThenStatusCode(int status) {
        HttpStatus currentStatusCode = response.getStatusCode();
        assertEquals(status,currentStatusCode.value());
    }
    @And("^the user receives profile from server with the id (-?\\\\d+)$")
    public void getProfileWithIdAnd(int id) {

    }
    //SCENARIO User wants to create a new Profile

    @When("^the user calls /api/... with userId (-?\\\\d+)$")
    public void createProfileWithIdWhen(int id) {

    }

    @Then("^the user receives create status code of (-?\\\\d+)$")
    public void createProfileWithIdThen(int id) {

    }
    @And("^the user receives profile from server with userId (-?\\\\d+)$")
    public void createProfileWithIdAnd(int id) {

    }
    //SCENARIO Client wants to remove an Profile

    @When("^the user calls /api/... with a profileId (-?\\\\d+)$")
    public void removeProfileWithIdWhen(int id) {

    }

    @Then("^the user receives remove status code of (-?\\\\d+)$")
    public void removeProfileWithIdThen(int id) {

    }
//    @And("^the user receives the boolean {boolean}$")
//    public void removeProfileWithIdAnd(boolean id) {
//
//    }
}
