package com.purplemagma.qbosimplepayroll.entities;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

@DynamoDBTable(tableName="qbo_simple_payroll_user")
public class User
{
  private String userId;
  private String firstName;
  private String lastName;
  private String email;

  @DynamoDBHashKey(attributeName="userId")
  public String getUserId() {
     return userId;
  }
  public void setUserId(String userId) {
     this.userId = userId;
  }
  
  @DynamoDBAttribute(attributeName="firstName")
  public String getFirstName() {
     return firstName;
  }
  public void setFirstName(String firstName) {
     this.firstName = firstName;
  }
  
  @DynamoDBAttribute(attributeName="lastName")
  public String getLastName() {
     return lastName;
  }
  public void setLastName(String lastName) {
     this.lastName = lastName;
  }

  @DynamoDBAttribute(attributeName="email")
  public String getEmail() {
   return email;
  }
  public void setEmail(String email) {
   this.email = email;
  }

}