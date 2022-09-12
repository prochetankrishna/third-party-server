
package com.hertzbit.thirdpartyserver.model;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "call",
    "sms"
})
@Generated("jsonschema2pojo")
public class Cleansing {

    @JsonProperty("call")
    private Call call;
    @JsonProperty("sms")
    private Sms sms;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Cleansing() {
    }

    /**
     * 
     * @param call
     * @param sms
     */
    public Cleansing(Call call, Sms sms) {
        super();
        this.call = call;
        this.sms = sms;
    }

    @JsonProperty("call")
    public Call getCall() {
        return call;
    }

    @JsonProperty("call")
    public void setCall(Call call) {
        this.call = call;
    }

    @JsonProperty("sms")
    public Sms getSms() {
        return sms;
    }

    @JsonProperty("sms")
    public void setSms(Sms sms) {
        this.sms = sms;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Cleansing.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("call");
        sb.append('=');
        sb.append(((this.call == null)?"<null>":this.call));
        sb.append(',');
        sb.append("sms");
        sb.append('=');
        sb.append(((this.sms == null)?"<null>":this.sms));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
