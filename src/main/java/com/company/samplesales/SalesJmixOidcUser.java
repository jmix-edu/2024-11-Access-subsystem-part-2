package com.company.samplesales;

import io.jmix.oidc.user.DefaultJmixOidcUser;

public class SalesJmixOidcUser extends DefaultJmixOidcUser {

    private String formattedName;

    public String getFormattedName() {
        return formattedName;
    }

    public void setFormattedName(String formattedName) {
        this.formattedName = formattedName;
    }
}
