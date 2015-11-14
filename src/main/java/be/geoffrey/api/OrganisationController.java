package be.geoffrey.api;

import be.geoffrey.model.Organisation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class OrganisationController {
    @RequestMapping(value = "/hello")
    public Organisation test(Principal principal) {
        return new Organisation(1, "HEY");
    }

}
