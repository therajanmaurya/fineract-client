/*
 * Apache Fineract API Documentation
 * Apache Fineract is a secure, multi-tenanted microfinance platform. <br />              The goal of the Apache Fineract API is to empower developers to build apps on top of the Apache Fineract Platform. The reference app [  https://demo.openmf.org  ] (username: mifos, password: password) works on the same demo tenant as the interactive links in this documentation.              <br/>The API                 is organized around REST [ https://en.wikipedia.org/wiki/Representational_state_transfer ]               <br/> Find out more about Apache Fineract on [ https://demo.openmf.org/api-docs/apiLive.htm#top ]              <br/> You can Try The API From Your Browser itself at [ https://demo.openmf.org/api-docs/apiLive.htm#interact ]              <br/> The Generic Options are available at [ https://demo.openmf.org/api-docs/apiLive.htm#genopts ]              <br/> Find out more about Updating Dates and Numbers at [ https://demo.openmf.org/api-docs/apiLive.htm#dates_and_numbers ]              <br/> For the Authentication and the Basic of HTTP and HTTPS refer [ https://demo.openmf.org/api-docs/apiLive.htm#authentication_overview ]              <br/> Check about ERROR codes at [ https://demo.openmf.org/api-docs/apiLive.htm#errors ]               <br/> <br/> Please refer to the old documentation for any documentation queries [ https://demo.openmf.org/api-docs/apiLive.htm ]              <br/>             ______________________________________________________________________________________________________________________________
 *
 * OpenAPI spec version: 1.0.0
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.mifos.fineract.models;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.LocalDate;

import java.util.Objects;

/**
 * PostLoansRepaymentSchedulePeriods
 */

public class PostLoansRepaymentSchedulePeriods {
    @SerializedName("period")
    private Integer period = null;

    @SerializedName("dueDate")
    private LocalDate dueDate = null;

    @SerializedName("principalDisbursed")
    private Long principalDisbursed = null;

    @SerializedName("principalLoanBalanceOutstanding")
    private Long principalLoanBalanceOutstanding = null;

    @SerializedName("feeChargesDue")
    private Long feeChargesDue = null;

    @SerializedName("feeChargesOutstanding")
    private Long feeChargesOutstanding = null;

    @SerializedName("totalOriginalDueForPeriod")
    private Long totalOriginalDueForPeriod = null;

    @SerializedName("totalDueForPeriod")
    private Long totalDueForPeriod = null;

    @SerializedName("totalOutstandingForPeriod")
    private Long totalOutstandingForPeriod = null;

    @SerializedName("totalOverdue")
    private Long totalOverdue = null;

    @SerializedName("totalActualCostOfLoanForPeriod")
    private Long totalActualCostOfLoanForPeriod = null;

    public PostLoansRepaymentSchedulePeriods period(Integer period) {
        this.period = period;
        return this;
    }

    /**
     * Get period
     *
     * @return period
     **/
    @ApiModelProperty(example = "0", value = "")
    public Integer getPeriod() {
        return period;
    }

    public void setPeriod(Integer period) {
        this.period = period;
    }

    public PostLoansRepaymentSchedulePeriods dueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
        return this;
    }

    /**
     * Get dueDate
     *
     * @return dueDate
     **/
    @ApiModelProperty(example = "[2011, 9, 20]", value = "")
    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public PostLoansRepaymentSchedulePeriods principalDisbursed(Long principalDisbursed) {
        this.principalDisbursed = principalDisbursed;
        return this;
    }

    /**
     * Get principalDisbursed
     *
     * @return principalDisbursed
     **/
    @ApiModelProperty(example = "100000", value = "")
    public Long getPrincipalDisbursed() {
        return principalDisbursed;
    }

    public void setPrincipalDisbursed(Long principalDisbursed) {
        this.principalDisbursed = principalDisbursed;
    }

    public PostLoansRepaymentSchedulePeriods principalLoanBalanceOutstanding(Long principalLoanBalanceOutstanding) {
        this.principalLoanBalanceOutstanding = principalLoanBalanceOutstanding;
        return this;
    }

    /**
     * Get principalLoanBalanceOutstanding
     *
     * @return principalLoanBalanceOutstanding
     **/
    @ApiModelProperty(example = "100000", value = "")
    public Long getPrincipalLoanBalanceOutstanding() {
        return principalLoanBalanceOutstanding;
    }

    public void setPrincipalLoanBalanceOutstanding(Long principalLoanBalanceOutstanding) {
        this.principalLoanBalanceOutstanding = principalLoanBalanceOutstanding;
    }

    public PostLoansRepaymentSchedulePeriods feeChargesDue(Long feeChargesDue) {
        this.feeChargesDue = feeChargesDue;
        return this;
    }

    /**
     * Get feeChargesDue
     *
     * @return feeChargesDue
     **/
    @ApiModelProperty(example = "0", value = "")
    public Long getFeeChargesDue() {
        return feeChargesDue;
    }

    public void setFeeChargesDue(Long feeChargesDue) {
        this.feeChargesDue = feeChargesDue;
    }

    public PostLoansRepaymentSchedulePeriods feeChargesOutstanding(Long feeChargesOutstanding) {
        this.feeChargesOutstanding = feeChargesOutstanding;
        return this;
    }

    /**
     * Get feeChargesOutstanding
     *
     * @return feeChargesOutstanding
     **/
    @ApiModelProperty(example = "0", value = "")
    public Long getFeeChargesOutstanding() {
        return feeChargesOutstanding;
    }

    public void setFeeChargesOutstanding(Long feeChargesOutstanding) {
        this.feeChargesOutstanding = feeChargesOutstanding;
    }

    public PostLoansRepaymentSchedulePeriods totalOriginalDueForPeriod(Long totalOriginalDueForPeriod) {
        this.totalOriginalDueForPeriod = totalOriginalDueForPeriod;
        return this;
    }

    /**
     * Get totalOriginalDueForPeriod
     *
     * @return totalOriginalDueForPeriod
     **/
    @ApiModelProperty(example = "0", value = "")
    public Long getTotalOriginalDueForPeriod() {
        return totalOriginalDueForPeriod;
    }

    public void setTotalOriginalDueForPeriod(Long totalOriginalDueForPeriod) {
        this.totalOriginalDueForPeriod = totalOriginalDueForPeriod;
    }

    public PostLoansRepaymentSchedulePeriods totalDueForPeriod(Long totalDueForPeriod) {
        this.totalDueForPeriod = totalDueForPeriod;
        return this;
    }

    /**
     * Get totalDueForPeriod
     *
     * @return totalDueForPeriod
     **/
    @ApiModelProperty(example = "0", value = "")
    public Long getTotalDueForPeriod() {
        return totalDueForPeriod;
    }

    public void setTotalDueForPeriod(Long totalDueForPeriod) {
        this.totalDueForPeriod = totalDueForPeriod;
    }

    public PostLoansRepaymentSchedulePeriods totalOutstandingForPeriod(Long totalOutstandingForPeriod) {
        this.totalOutstandingForPeriod = totalOutstandingForPeriod;
        return this;
    }

    /**
     * Get totalOutstandingForPeriod
     *
     * @return totalOutstandingForPeriod
     **/
    @ApiModelProperty(example = "0", value = "")
    public Long getTotalOutstandingForPeriod() {
        return totalOutstandingForPeriod;
    }

    public void setTotalOutstandingForPeriod(Long totalOutstandingForPeriod) {
        this.totalOutstandingForPeriod = totalOutstandingForPeriod;
    }

    public PostLoansRepaymentSchedulePeriods totalOverdue(Long totalOverdue) {
        this.totalOverdue = totalOverdue;
        return this;
    }

    /**
     * Get totalOverdue
     *
     * @return totalOverdue
     **/
    @ApiModelProperty(example = "0", value = "")
    public Long getTotalOverdue() {
        return totalOverdue;
    }

    public void setTotalOverdue(Long totalOverdue) {
        this.totalOverdue = totalOverdue;
    }

    public PostLoansRepaymentSchedulePeriods totalActualCostOfLoanForPeriod(Long totalActualCostOfLoanForPeriod) {
        this.totalActualCostOfLoanForPeriod = totalActualCostOfLoanForPeriod;
        return this;
    }

    /**
     * Get totalActualCostOfLoanForPeriod
     *
     * @return totalActualCostOfLoanForPeriod
     **/
    @ApiModelProperty(example = "0", value = "")
    public Long getTotalActualCostOfLoanForPeriod() {
        return totalActualCostOfLoanForPeriod;
    }

    public void setTotalActualCostOfLoanForPeriod(Long totalActualCostOfLoanForPeriod) {
        this.totalActualCostOfLoanForPeriod = totalActualCostOfLoanForPeriod;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PostLoansRepaymentSchedulePeriods postLoansRepaymentSchedulePeriods = (PostLoansRepaymentSchedulePeriods) o;
        return Objects.equals(this.period, postLoansRepaymentSchedulePeriods.period) &&
                Objects.equals(this.dueDate, postLoansRepaymentSchedulePeriods.dueDate) &&
                Objects.equals(this.principalDisbursed, postLoansRepaymentSchedulePeriods.principalDisbursed) &&
                Objects.equals(this.principalLoanBalanceOutstanding, postLoansRepaymentSchedulePeriods.principalLoanBalanceOutstanding) &&
                Objects.equals(this.feeChargesDue, postLoansRepaymentSchedulePeriods.feeChargesDue) &&
                Objects.equals(this.feeChargesOutstanding, postLoansRepaymentSchedulePeriods.feeChargesOutstanding) &&
                Objects.equals(this.totalOriginalDueForPeriod, postLoansRepaymentSchedulePeriods.totalOriginalDueForPeriod) &&
                Objects.equals(this.totalDueForPeriod, postLoansRepaymentSchedulePeriods.totalDueForPeriod) &&
                Objects.equals(this.totalOutstandingForPeriod, postLoansRepaymentSchedulePeriods.totalOutstandingForPeriod) &&
                Objects.equals(this.totalOverdue, postLoansRepaymentSchedulePeriods.totalOverdue) &&
                Objects.equals(this.totalActualCostOfLoanForPeriod, postLoansRepaymentSchedulePeriods.totalActualCostOfLoanForPeriod);
    }

    @Override
    public int hashCode() {
        return Objects.hash(period, dueDate, principalDisbursed, principalLoanBalanceOutstanding, feeChargesDue, feeChargesOutstanding, totalOriginalDueForPeriod, totalDueForPeriod, totalOutstandingForPeriod, totalOverdue, totalActualCostOfLoanForPeriod);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PostLoansRepaymentSchedulePeriods {\n");

        sb.append("    period: ").append(toIndentedString(period)).append("\n");
        sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
        sb.append("    principalDisbursed: ").append(toIndentedString(principalDisbursed)).append("\n");
        sb.append("    principalLoanBalanceOutstanding: ").append(toIndentedString(principalLoanBalanceOutstanding)).append("\n");
        sb.append("    feeChargesDue: ").append(toIndentedString(feeChargesDue)).append("\n");
        sb.append("    feeChargesOutstanding: ").append(toIndentedString(feeChargesOutstanding)).append("\n");
        sb.append("    totalOriginalDueForPeriod: ").append(toIndentedString(totalOriginalDueForPeriod)).append("\n");
        sb.append("    totalDueForPeriod: ").append(toIndentedString(totalDueForPeriod)).append("\n");
        sb.append("    totalOutstandingForPeriod: ").append(toIndentedString(totalOutstandingForPeriod)).append("\n");
        sb.append("    totalOverdue: ").append(toIndentedString(totalOverdue)).append("\n");
        sb.append("    totalActualCostOfLoanForPeriod: ").append(toIndentedString(totalActualCostOfLoanForPeriod)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}

