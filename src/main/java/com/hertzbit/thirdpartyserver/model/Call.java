
package com.hertzbit.thirdpartyserver.model;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "cleansed_code",
    "country_code",
    "max_length",
    "min_length",
    "phone_number"
})
@Generated("jsonschema2pojo")
public class Call {

    @JsonProperty("cleansed_code")
    private Integer cleansedCode;
    @JsonProperty("country_code")
    private String countryCode;
    @JsonProperty("max_length")
    private Integer maxLength;
    @JsonProperty("min_length")
    private Integer minLength;
    @JsonProperty("phone_number")
    private String phoneNumber;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Call() {
    }

    /**
     * 
     * @param phoneNumber
     * @param countryCode
     * @param minLength
     * @param cleansedCode
     * @param maxLength
     */
    public Call(Integer cleansedCode, String countryCode, Integer maxLength, Integer minLength, String phoneNumber) {
        super();
        this.cleansedCode = cleansedCode;
        this.countryCode = countryCode;
        this.maxLength = maxLength;
        this.minLength = minLength;
        this.phoneNumber = phoneNumber;
    }

    @JsonProperty("cleansed_code")
    public Integer getCleansedCode() {
        return cleansedCode;
    }

    @JsonProperty("cleansed_code")
    public void setCleansedCode(Integer cleansedCode) {
        this.cleansedCode = cleansedCode;
    }

    @JsonProperty("country_code")
    public String getCountryCode() {
        return countryCode;
    }

    @JsonProperty("country_code")
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @JsonProperty("max_length")
    public Integer getMaxLength() {
        return maxLength;
    }

    @JsonProperty("max_length")
    public void setMaxLength(Integer maxLength) {
        this.maxLength = maxLength;
    }

    @JsonProperty("min_length")
    public Integer getMinLength() {
        return minLength;
    }

    @JsonProperty("min_length")
    public void setMinLength(Integer minLength) {
        this.minLength = minLength;
    }

    @JsonProperty("phone_number")
    public String getPhoneNumber() {
        return phoneNumber;
    }

    @JsonProperty("phone_number")
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Call.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("cleansedCode");
        sb.append('=');
        sb.append(((this.cleansedCode == null)?"<null>":this.cleansedCode));
        sb.append(',');
        sb.append("countryCode");
        sb.append('=');
        sb.append(((this.countryCode == null)?"<null>":this.countryCode));
        sb.append(',');
        sb.append("maxLength");
        sb.append('=');
        sb.append(((this.maxLength == null)?"<null>":this.maxLength));
        sb.append(',');
        sb.append("minLength");
        sb.append('=');
        sb.append(((this.minLength == null)?"<null>":this.minLength));
        sb.append(',');
        sb.append("phoneNumber");
        sb.append('=');
        sb.append(((this.phoneNumber == null)?"<null>":this.phoneNumber));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
