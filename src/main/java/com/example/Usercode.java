/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.corezoid.usercode;
import com.corezoid.gitcall.runner.api.UsercodeHandler;
import java.util.UUID;
import java.util.Map;

/**
 *
 * @author James
 */
public class Usercode implements  UsercodeHandler<Map<String, String>, Map<String, String>> {
      @java.lang.Override
    public Map<String, String> handle(Map<String, String> data) throws Exception {
        data.put("guid", generateGUID());
        return data;
    }
     public String generateGUID() {
        UUID uuid = UUID.randomUUID();
        return uuid.toString();
    }

}
