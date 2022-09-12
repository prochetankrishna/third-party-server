
package com.hertzbit.thirdpartyserver.model;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "original",
    "cleansing"
})
@Generated("jsonschema2pojo")
public class Numbering {

    @JsonProperty("original")
    private Original original;
    @JsonProperty("cleansing")
    private Cleansing cleansing;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Numbering() {
    }

    /**
     * 
     * @param original
     * @param cleansing
     */
    public Numbering(Original original, Cleansing cleansing) {
        super();
        this.original = original;
        this.cleansing = cleansing;
    }

    @JsonProperty("original")
    public Original getOriginal() {
        return original;
    }

    @JsonProperty("original")
    public void setOriginal(Original original) {
        this.original = original;
    }

    @JsonProperty("cleansing")
    public Cleansing getCleansing() {
        return cleansing;
    }

    @JsonProperty("cleansing")
    public void setCleansing(Cleansing cleansing) {
        this.cleansing = cleansing;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Numbering.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("original");
        sb.append('=');
        sb.append(((this.original == null)?"<null>":this.original));
        sb.append(',');
        sb.append("cleansing");
        sb.append('=');
        sb.append(((this.cleansing == null)?"<null>":this.cleansing));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
