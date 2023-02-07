package cucumber.glue;

import io.cucumber.java.en.Given;

public class getProjectFromUserSteps {
    @Given("^the following userId 'id'$")
    public void givenTheFollowingId(int id){
        if(id<0){
            throw new IllegalArgumentException("id can't be negative");
        }
    }
}
