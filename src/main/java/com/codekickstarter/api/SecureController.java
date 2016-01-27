package com.codekickstarter.api;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api/secure")
public class SecureController {

    @RequestMapping(value = "/any", method = RequestMethod.GET)
    @ResponseBody
    public String anyAuthenticated() {
        return "'any' Request Successful";
    }

    @PreAuthorize("#oauth2.hasScope('write')")
    @RequestMapping(value = "/write", method = RequestMethod.GET)
    @ResponseBody
    public String clientWriteAuthenticated() {
        return "'client needs write scope' Request Successful";
    }

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    @ResponseBody
    public String clientNeedsRoleAdmin() {
        return "'user needs admin' Request Successful";
    }

}
