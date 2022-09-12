
package com.hertzbit.thirdpartyserver.model;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "reference_id",
    "external_id",
    "status",
    "numbering",
    "phone_type",
    "carrier",
    "risk",
    "risk_insights"
})
@Generated("jsonschema2pojo")
public class LookUpResponse {

    @JsonProperty("reference_id")
    private String referenceId;
    @JsonProperty("external_id")
    private String externalId;
    @JsonProperty("status")
    private Status status;
    @JsonProperty("numbering")
    private Numbering numbering;
    @JsonProperty("phone_type")
    private PhoneType phoneType;
    @JsonProperty("carrier")
    private Carrier carrier;
    @JsonProperty("risk")
    private Risk risk;
    @JsonProperty("risk_insights")
    private RiskInsights riskInsights;

    /**
     * No args constructor for use in serialization
     * 
     */
    public LookUpResponse() {
    }

    /**
     * 
     * @param numbering
     * @param phoneType
     * @param carrier
     * @param riskInsights
     * @param externalId
     * @param risk
     * @param referenceId
     * @param status
     */
    public LookUpResponse(String referenceId, String externalId, Status status, Numbering numbering, PhoneType phoneType, Carrier carrier, Risk risk, RiskInsights riskInsights) {
        super();
        this.referenceId = referenceId;
        this.externalId = externalId;
        this.status = status;
        this.numbering = numbering;
        this.phoneType = phoneType;
        this.carrier = carrier;
        this.risk = risk;
        this.riskInsights = riskInsights;
    }

    @JsonProperty("reference_id")
    public String getReferenceId() {
        return referenceId;
    }

    @JsonProperty("reference_id")
    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }

    @JsonProperty("external_id")
    public String getExternalId() {
        return externalId;
    }

    @JsonProperty("external_id")
    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    @JsonProperty("status")
    public Status getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(Status status) {
        this.status = status;
    }

    @JsonProperty("numbering")
    public Numbering getNumbering() {
        return numbering;
    }

    @JsonProperty("numbering")
    public void setNumbering(Numbering numbering) {
        this.numbering = numbering;
    }

    @JsonProperty("phone_type")
    public PhoneType getPhoneType() {
        return phoneType;
    }

    @JsonProperty("phone_type")
    public void setPhoneType(PhoneType phoneType) {
        this.phoneType = phoneType;
    }

    @JsonProperty("carrier")
    public Carrier getCarrier() {
        return carrier;
    }

    @JsonProperty("carrier")
    public void setCarrier(Carrier carrier) {
        this.carrier = carrier;
    }

    @JsonProperty("risk")
    public Risk getRisk() {
        return risk;
    }

    @JsonProperty("risk")
    public void setRisk(Risk risk) {
        this.risk = risk;
    }

    @JsonProperty("risk_insights")
    public RiskInsights getRiskInsights() {
        return riskInsights;
    }

    @JsonProperty("risk_insights")
    public void setRiskInsights(RiskInsights riskInsights) {
        this.riskInsights = riskInsights;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(LookUpResponse.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("referenceId");
        sb.append('=');
        sb.append(((this.referenceId == null)?"<null>":this.referenceId));
        sb.append(',');
        sb.append("externalId");
        sb.append('=');
        sb.append(((this.externalId == null)?"<null>":this.externalId));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("numbering");
        sb.append('=');
        sb.append(((this.numbering == null)?"<null>":this.numbering));
        sb.append(',');
        sb.append("phoneType");
        sb.append('=');
        sb.append(((this.phoneType == null)?"<null>":this.phoneType));
        sb.append(',');
        sb.append("carrier");
        sb.append('=');
        sb.append(((this.carrier == null)?"<null>":this.carrier));
        sb.append(',');
        sb.append("risk");
        sb.append('=');
        sb.append(((this.risk == null)?"<null>":this.risk));
        sb.append(',');
        sb.append("riskInsights");
        sb.append('=');
        sb.append(((this.riskInsights == null)?"<null>":this.riskInsights));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
