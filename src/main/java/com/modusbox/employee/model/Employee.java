/*
 * Employee Management
 * This is a camel-k demo for creating and updating an employee
 *
 * OpenAPI spec version: 1.0.0
 * Contact: david.borja@modusbox.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.modusbox.employee.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.modusbox.employee.model.Amount;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * Employee
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-03-31T20:26:16.672588+02:00[Europe/Madrid]")
public class Employee {
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("lastName")
  private String lastName = null;

  @SerializedName("fullName")
  private String fullName = null;

  @SerializedName("designation")
  private String designation = null;

  @SerializedName("salaryPerYear")
  private Amount salaryPerYear = null;

  @SerializedName("salaryPerMonth")
  private Amount salaryPerMonth = null;

  @SerializedName("languagesCount")
  private Integer languagesCount = null;

  @SerializedName("languages")
  private List<String> languages = null;

  public Employee id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Employee name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Employee lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Get lastName
   * @return lastName
  **/
  @Schema(description = "")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Employee fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

   /**
   * Get fullName
   * @return fullName
  **/
  @Schema(description = "")
  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public Employee designation(String designation) {
    this.designation = designation;
    return this;
  }

   /**
   * Get designation
   * @return designation
  **/
  @Schema(description = "")
  public String getDesignation() {
    return designation;
  }

  public void setDesignation(String designation) {
    this.designation = designation;
  }

  public Employee salaryPerYear(Amount salaryPerYear) {
    this.salaryPerYear = salaryPerYear;
    return this;
  }

   /**
   * Get salaryPerYear
   * @return salaryPerYear
  **/
  @Schema(description = "")
  public Amount getSalaryPerYear() {
    return salaryPerYear;
  }

  public void setSalaryPerYear(Amount salaryPerYear) {
    this.salaryPerYear = salaryPerYear;
  }

  public Employee salaryPerMonth(Amount salaryPerMonth) {
    this.salaryPerMonth = salaryPerMonth;
    return this;
  }

   /**
   * Get salaryPerMonth
   * @return salaryPerMonth
  **/
  @Schema(description = "")
  public Amount getSalaryPerMonth() {
    return salaryPerMonth;
  }

  public void setSalaryPerMonth(Amount salaryPerMonth) {
    this.salaryPerMonth = salaryPerMonth;
  }

  public Employee languagesCount(Integer languagesCount) {
    this.languagesCount = languagesCount;
    return this;
  }

   /**
   * Get languagesCount
   * @return languagesCount
  **/
  @Schema(description = "")
  public Integer getLanguagesCount() {
    return languagesCount;
  }

  public void setLanguagesCount(Integer languagesCount) {
    this.languagesCount = languagesCount;
  }

  public Employee languages(List<String> languages) {
    this.languages = languages;
    return this;
  }

  public Employee addLanguagesItem(String languagesItem) {
    if (this.languages == null) {
      this.languages = new ArrayList<String>();
    }
    this.languages.add(languagesItem);
    return this;
  }

   /**
   * Programming languages and skills
   * @return languages
  **/
  @Schema(description = "Programming languages and skills")
  public List<String> getLanguages() {
    return languages;
  }

  public void setLanguages(List<String> languages) {
    this.languages = languages;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Employee employee = (Employee) o;
    return Objects.equals(this.id, employee.id) &&
        Objects.equals(this.name, employee.name) &&
        Objects.equals(this.lastName, employee.lastName) &&
        Objects.equals(this.fullName, employee.fullName) &&
        Objects.equals(this.designation, employee.designation) &&
        Objects.equals(this.salaryPerYear, employee.salaryPerYear) &&
        Objects.equals(this.salaryPerMonth, employee.salaryPerMonth) &&
        Objects.equals(this.languagesCount, employee.languagesCount) &&
        Objects.equals(this.languages, employee.languages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, lastName, fullName, designation, salaryPerYear, salaryPerMonth, languagesCount, languages);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Employee {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    designation: ").append(toIndentedString(designation)).append("\n");
    sb.append("    salaryPerYear: ").append(toIndentedString(salaryPerYear)).append("\n");
    sb.append("    salaryPerMonth: ").append(toIndentedString(salaryPerMonth)).append("\n");
    sb.append("    languagesCount: ").append(toIndentedString(languagesCount)).append("\n");
    sb.append("    languages: ").append(toIndentedString(languages)).append("\n");
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