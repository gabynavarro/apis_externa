package com.externas.apis.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter  @Setter
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description = "Detalles de un Usuario")
public class User {
     private long id;
     @ApiModelProperty(notes = "Nombre del Usuario")
     private String name;
     @Schema(description = "aposdo del usuario", example = "apodo")
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
