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

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModelProperty;

import java.io.IOException;
import java.util.Objects;

/**
 * FinancialActivityData
 */

public class FinancialActivityData {
    @SerializedName("id")
    private Integer id = null;

    @SerializedName("name")
    private String name = null;
    @SerializedName("mappedGLAccountType")
    private MappedGLAccountTypeEnum mappedGLAccountType = null;

    public FinancialActivityData id(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     *
     * @return id
     **/
    @ApiModelProperty(value = "")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public FinancialActivityData name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     *
     * @return name
     **/
    @ApiModelProperty(value = "")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FinancialActivityData mappedGLAccountType(MappedGLAccountTypeEnum mappedGLAccountType) {
        this.mappedGLAccountType = mappedGLAccountType;
        return this;
    }

    /**
     * Get mappedGLAccountType
     *
     * @return mappedGLAccountType
     **/
    @ApiModelProperty(value = "")
    public MappedGLAccountTypeEnum getMappedGLAccountType() {
        return mappedGLAccountType;
    }

    public void setMappedGLAccountType(MappedGLAccountTypeEnum mappedGLAccountType) {
        this.mappedGLAccountType = mappedGLAccountType;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FinancialActivityData financialActivityData = (FinancialActivityData) o;
        return Objects.equals(this.id, financialActivityData.id) &&
                Objects.equals(this.name, financialActivityData.name) &&
                Objects.equals(this.mappedGLAccountType, financialActivityData.mappedGLAccountType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, mappedGLAccountType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FinancialActivityData {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    mappedGLAccountType: ").append(toIndentedString(mappedGLAccountType)).append("\n");
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

    /**
     * Gets or Sets mappedGLAccountType
     */
    @JsonAdapter(MappedGLAccountTypeEnum.Adapter.class)
    public enum MappedGLAccountTypeEnum {
        ASSET("ASSET"),

        LIABILITY("LIABILITY"),

        EQUITY("EQUITY"),

        INCOME("INCOME"),

        EXPENSE("EXPENSE");

        private String value;

        MappedGLAccountTypeEnum(String value) {
            this.value = value;
        }

        public static MappedGLAccountTypeEnum fromValue(String text) {
            for (MappedGLAccountTypeEnum b : MappedGLAccountTypeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static class Adapter extends TypeAdapter<MappedGLAccountTypeEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final MappedGLAccountTypeEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public MappedGLAccountTypeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return MappedGLAccountTypeEnum.fromValue(String.valueOf(value));
            }
        }
    }

}

