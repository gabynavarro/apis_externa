package com.externas.apis.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter  @Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
     private long id;
     private String name;
     private String username;
     private String enail;
     private String phone;
     private String website;
     // ***** relaciones ******
     private Address address;
     private Company company;


     /*      "name": "Leanne Graham",
             "username": "Bret",
             "email": "Sincere@april.biz",
              "phone": "1-770-736-8031 x56442",
               "website": "hildegard.org",
             */
}
