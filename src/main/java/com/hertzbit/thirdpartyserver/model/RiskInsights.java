
package com.hertzbit.thirdpartyserver.model;

import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "status",
    "category",
    "a2p",
    "p2p",
    "number_type",
    "ip",
    "email"
})
@Generated("jsonschema2pojo")
public class RiskInsights {

    @JsonProperty("status")
    private Integer status;
    @JsonProperty("category")
    private List<Integer> category = null;
    @JsonProperty("a2p")
    private List<Integer> a2p = null;
    @JsonProperty("p2p")
    private List<Integer> p2p = null;
    @JsonProperty("number_type")
    private List<Integer> numberType = null;
    @JsonProperty("ip")
    private List<Integer> ip = null;
    @JsonProperty("email")
    private List<Integer> email = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public RiskInsights() {
    }

    /**
     * 
     * @param numberType
     * @param ip
     * @param category
     * @param a2p
     * @param email
     * @param status
     * @param p2p
     */
    public RiskInsights(Integer status, List<Integer> category, List<Integer> a2p, List<Integer> p2p, List<Integer> numberType, List<Integer> ip, List<Integer> email) {
        super();
        this.status = status;
        this.category = category;
        this.a2p = a2p;
        this.p2p = p2p;
        this.numberType = numberType;
        this.ip = ip;
        this.email = email;
    }

    @JsonProperty("status")
    public Integer getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(Integer status) {
        this.status = status;
    }

    @JsonProperty("category")
    public List<Integer> getCategory() {
        return category;
    }

    @JsonProperty("category")
    public void setCategory(List<Integer> category) {
        this.category = category;
    }

    @JsonProperty("a2p")
    public List<Integer> getA2p() {
        return a2p;
    }

    @JsonProperty("a2p")
    public void setA2p(List<Integer> a2p) {
        this.a2p = a2p;
    }

    @JsonProperty("p2p")
    public List<Integer> getP2p() {
        return p2p;
    }

    @JsonProperty("p2p")
    public void setP2p(List<Integer> p2p) {
        this.p2p = p2p;
    }

    @JsonProperty("number_type")
    public List<Integer> getNumberType() {
        return numberType;
    }

    @JsonProperty("number_type")
    public void setNumberType(List<Integer> numberType) {
        this.numberType = numberType;
    }

    @JsonProperty("ip")
    public List<Integer> getIp() {
        return ip;
    }

    @JsonProperty("ip")
    public void setIp(List<Integer> ip) {
        this.ip = ip;
    }

    @JsonProperty("email")
    public List<Integer> getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(List<Integer> email) {
        this.email = email;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RiskInsights.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("category");
        sb.append('=');
        sb.append(((this.category == null)?"<null>":this.category));
        sb.append(',');
        sb.append("a2p");
        sb.append('=');
        sb.append(((this.a2p == null)?"<null>":this.a2p));
        sb.append(',');
        sb.append("p2p");
        sb.append('=');
        sb.append(((this.p2p == null)?"<null>":this.p2p));
        sb.append(',');
        sb.append("numberType");
        sb.append('=');
        sb.append(((this.numberType == null)?"<null>":this.numberType));
        sb.append(',');
        sb.append("ip");
        sb.append('=');
        sb.append(((this.ip == null)?"<null>":this.ip));
        sb.append(',');
        sb.append("email");
        sb.append('=');
        sb.append(((this.email == null)?"<null>":this.email));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
