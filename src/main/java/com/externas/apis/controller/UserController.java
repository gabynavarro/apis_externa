package com.externas.apis.controller;

import com.externas.apis.model.User;
import com.externas.apis.service.UserService;

import io.swagger.annotations.Api;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/users")
@Api(tags = "Controlador de Ejemplo", description = "Operaciones relacionadas con ejemplos")
public class UserController {
    @Autowired
    private UserService userService;

    @Operation(summary = "Listar usuarios ", description = "listar todos los usuarios con formato string")
    @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<?> getUsers() {
        List<String> users = userService.getUsuarios();
        return ResponseEntity.ok(users);
    }
    @GetMapping("/{id}")
    @ApiResponses(value={
            @ApiResponse(responseCode = "200", description="Operacion con exitos"),
            @ApiResponse(responseCode = "400", description="Bad request - segui participando")
    })
    public ResponseEntity<?> getUserId(@PathVariable String id) {
        User user = userService.getUsuarioById(id);
        return ResponseEntity.ok(user);
    }


}
