package com.externas.apis.model.request;

import com.externas.apis.model.Address;
import com.externas.apis.model.Company;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class UserRequest {
    private long id;
    private String name;
    private String username;
    private String enail;
    private String phone;
    private String website;
    // ***** relaciones ******
    private Address address;
    private Company company;
}
