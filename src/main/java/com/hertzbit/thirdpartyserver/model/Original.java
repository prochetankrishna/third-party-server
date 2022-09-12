
package com.hertzbit.thirdpartyserver.model;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "phone_number",
    "complete_phone_number",
    "country_code"
})
@Generated("jsonschema2pojo")
public class Original {

    @JsonProperty("phone_number")
    private String phoneNumber;
    @JsonProperty("complete_phone_number")
    private String completePhoneNumber;
    @JsonProperty("country_code")
    private String countryCode;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Original() {
    }

    /**
     * 
     * @param completePhoneNumber
     * @param phoneNumber
     * @param countryCode
     */
    public Original(String phoneNumber, String completePhoneNumber, String countryCode) {
        super();
        this.phoneNumber = phoneNumber;
        this.completePhoneNumber = completePhoneNumber;
        this.countryCode = countryCode;
    }

    @JsonProperty("phone_number")
    public String getPhoneNumber() {
        return phoneNumber;
    }

    @JsonProperty("phone_number")
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @JsonProperty("complete_phone_number")
    public String getCompletePhoneNumber() {
        return completePhoneNumber;
    }

    @JsonProperty("complete_phone_number")
    public void setCompletePhoneNumber(String completePhoneNumber) {
        this.completePhoneNumber = completePhoneNumber;
    }

    @JsonProperty("country_code")
    public String getCountryCode() {
        return countryCode;
    }

    @JsonProperty("country_code")
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Original.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("phoneNumber");
        sb.append('=');
        sb.append(((this.phoneNumber == null)?"<null>":this.phoneNumber));
        sb.append(',');
        sb.append("completePhoneNumber");
        sb.append('=');
        sb.append(((this.completePhoneNumber == null)?"<null>":this.completePhoneNumber));
        sb.append(',');
        sb.append("countryCode");
        sb.append('=');
        sb.append(((this.countryCode == null)?"<null>":this.countryCode));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
