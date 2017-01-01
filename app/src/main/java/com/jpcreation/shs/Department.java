package com.jpcreation.shs;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Praveen J
 * Date: 10/12/2016
 * Project: SHS
 * Package: com.jpcreation.shs
 * Description:
 */

public class Department {

    @SerializedName("comp_id")
    @Expose
    private String compId;
    @SerializedName("stud_id")
    @Expose
    private String studId;
    @SerializedName("feedback")
    @Expose
    private String feedback;
    @SerializedName("state")
    @Expose
    private String state;
    @SerializedName("problem_type")
    @Expose
    private String problemType;
    @SerializedName("dis_prev")
    @Expose
    private String disPrev;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("date_reg")
    @Expose
    private String dateReg;
    @SerializedName("solved_date")
    @Expose
    private Object solvedDate;
    @SerializedName("solved")
    @Expose
    private String solved;
    @SerializedName("read")
    @Expose
    private String read;

    /**
     * @return The compId
     */
    public String getCompId() {
        return compId;
    }

    /**
     * @param compId The comp_id
     */
    public void setCompId(String compId) {
        this.compId = compId;
    }

    /**
     * @return The studId
     */
    public String getStudId() {
        return studId;
    }

    /**
     * @param studId The stud_id
     */
    public void setStudId(String studId) {
        this.studId = studId;
    }

    /**
     * @return The feedback
     */
    public String getFeedback() {
        return feedback;
    }

    /**
     * @param feedback The feedback
     */
    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    /**
     * @return The state
     */
    public String getState() {
        return state;
    }

    /**
     * @param state The state
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * @return The problemType
     */
    public String getProblemType() {
        return problemType;
    }

    /**
     * @param problemType The problem_type
     */
    public void setProblemType(String problemType) {
        this.problemType = problemType;
    }

    /**
     * @return The disPrev
     */
    public String getDisPrev() {
        return disPrev;
    }

    /**
     * @param disPrev The dis_prev
     */
    public void setDisPrev(String disPrev) {
        this.disPrev = disPrev;
    }

    /**
     * @return The message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message The message
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * @return The dateReg
     */
    public String getDateReg() {
        return dateReg;
    }

    /**
     * @param dateReg The date_reg
     */
    public void setDateReg(String dateReg) {
        this.dateReg = dateReg;
    }

    /**
     * @return The solvedDate
     */
    public Object getSolvedDate() {
        return solvedDate;
    }

    /**
     * @param solvedDate The solved_date
     */
    public void setSolvedDate(Object solvedDate) {
        this.solvedDate = solvedDate;
    }

    /**
     * @return The solved
     */
    public String getSolved() {
        return solved;
    }

    /**
     * @param solved The solved
     */
    public void setSolved(String solved) {
        this.solved = solved;
    }

    /**
     * @return The read
     */
    public String getRead() {
        return read;
    }

    /**
     * @param read The read
     */
    public void setRead(String read) {
        this.read = read;
    }

}
