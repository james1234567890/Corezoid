/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example;
import com.corezoid.gitcall.runner.api.UsercodeHandler;
import java.util.UUID;

/**
 *
 * @author James
 */
public class Usercode implements UsercodeHandler<String>  {
     public static String generateGUID() {
        UUID uuid = UUID.randomUUID();
        return uuid.toString();
    }

}
