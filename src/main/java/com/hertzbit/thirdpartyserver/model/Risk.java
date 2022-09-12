
package com.hertzbit.thirdpartyserver.model;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "level",
    "recommendation",
    "score"
})
@Generated("jsonschema2pojo")
public class Risk {

    @JsonProperty("level")
    private String level;
    @JsonProperty("recommendation")
    private String recommendation;
    @JsonProperty("score")
    private Integer score;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Risk() {
    }

    /**
     * 
     * @param score
     * @param level
     * @param recommendation
     */
    public Risk(String level, String recommendation, Integer score) {
        super();
        this.level = level;
        this.recommendation = recommendation;
        this.score = score;
    }

    @JsonProperty("level")
    public String getLevel() {
        return level;
    }

    @JsonProperty("level")
    public void setLevel(String level) {
        this.level = level;
    }

    @JsonProperty("recommendation")
    public String getRecommendation() {
        return recommendation;
    }

    @JsonProperty("recommendation")
    public void setRecommendation(String recommendation) {
        this.recommendation = recommendation;
    }

    @JsonProperty("score")
    public Integer getScore() {
        return score;
    }

    @JsonProperty("score")
    public void setScore(Integer score) {
        this.score = score;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Risk.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("level");
        sb.append('=');
        sb.append(((this.level == null)?"<null>":this.level));
        sb.append(',');
        sb.append("recommendation");
        sb.append('=');
        sb.append(((this.recommendation == null)?"<null>":this.recommendation));
        sb.append(',');
        sb.append("score");
        sb.append('=');
        sb.append(((this.score == null)?"<null>":this.score));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
