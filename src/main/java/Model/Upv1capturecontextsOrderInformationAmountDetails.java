/*
 * CyberSource Merged Spec
 * All CyberSource API specs merged together. These are available at https://developer.cybersource.com/api/reference/api-reference.html
 *
 * OpenAPI spec version: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package Model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Upv1capturecontextsOrderInformationAmountDetails
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-11-30T13:38:58.602+05:30")
public class Upv1capturecontextsOrderInformationAmountDetails {
  @SerializedName("totalAmount")
  private String totalAmount = null;

  @SerializedName("currency")
  private String currency = null;

  public Upv1capturecontextsOrderInformationAmountDetails totalAmount(String totalAmount) {
    this.totalAmount = totalAmount;
    return this;
  }

   /**
   * Get totalAmount
   * @return totalAmount
  **/
  @ApiModelProperty(example = "21", value = "")
  public String getTotalAmount() {
    return totalAmount;
  }

  public void setTotalAmount(String totalAmount) {
    this.totalAmount = totalAmount;
  }

  public Upv1capturecontextsOrderInformationAmountDetails currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @ApiModelProperty(example = "USD", value = "")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Upv1capturecontextsOrderInformationAmountDetails upv1capturecontextsOrderInformationAmountDetails = (Upv1capturecontextsOrderInformationAmountDetails) o;
    return Objects.equals(this.totalAmount, upv1capturecontextsOrderInformationAmountDetails.totalAmount) &&
        Objects.equals(this.currency, upv1capturecontextsOrderInformationAmountDetails.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalAmount, currency);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Upv1capturecontextsOrderInformationAmountDetails {\n");
    
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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

