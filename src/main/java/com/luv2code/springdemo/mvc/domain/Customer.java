package com.luv2code.springdemo.mvc.domain;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import org.springframework.web.bind.annotation.InitBinder;

public class Customer {

    private String firstName;

    @NotNull(message = "필수항목")
    @Size(min = 1, message = "필수항목")
    private String lastName;

    @NotNull(message = "필수항목")
    @Max(value = 10, message = "10 이하 입니다")
    @Min(value = 0, message = "0 이상 입니다")
    private Integer freePasses;

    @Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "only 5 chars/digits")
    private String postalCode; // 문자5 abcde or 12345 , not abc12

    public Customer() {
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(Integer freePasses) {
        this.freePasses = freePasses;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
}
