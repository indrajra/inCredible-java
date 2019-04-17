package org.incredible.pojos;

import java.util.List;

public class VerificationObject {
    /**
     * The type of verification method. Supported values for single assertion verification are HostedBadge and
     * SignedBadge (aliases in context are available: hosted and signed)
     */
    protected List<String> type;

    /**
     * The @id of the property to be used for verification that an Assertion is within the allowed scope. Only id is
     * supported. Verifiers will consider id the default value if verificationProperty is omitted or if an issuer
     * Profile has no explicit verification instructions, so it may be safely omitted.
     */
    protected String verificationProperty;

    /**
     * The URI fragment that the verification property must start with. Valid Assertions must have an id within this
     * scope. Multiple values allowed, and Assertions will be considered valid if their id starts with one of these values.
     */
    protected String startsWith;

    /**
     * The host registered name subcomponent of an allowed origin. Any given id URI will be considered valid.
     * Refer to https://tools.ietf.org/html/rfc3986#section-3.2.2
     * Example: ["example.org", "another.example.org"]
     */
    protected List<String> allowedOrigins;

    public List<String> getType() {
        return type;
    }

    public void setType(List<String> type) {
        this.type = type;
    }

    public String getVerificationProperty() {
        return verificationProperty;
    }

    public void setVerificationProperty(String verificationProperty) {
        this.verificationProperty = verificationProperty;
    }

    public String getStartsWith() {
        return startsWith;
    }

    public void setStartsWith(String startsWith) {
        this.startsWith = startsWith;
    }

    public List<String> getAllowedOrigins() {
        return allowedOrigins;
    }

    public void setAllowedOrigins(List<String> allowedOrigins) {
        this.allowedOrigins = allowedOrigins;
    }
}