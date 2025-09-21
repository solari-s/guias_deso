package Guia2;

import java.util.HashMap;
import java.util.Map;

public class ValidadorLogin extends Exception{

    private final Map<String, String> usuarios = new HashMap<>();

    public ValidadorLogin(){
        usuarios.put("admin","12345");
        usuarios.put("barto","pass");
        usuarios.put("juan","qwerty");
    }

    public boolean validar(String usr, String pass){
        return usuarios.containsKey(usr) && usuarios.get(usr).equals(pass);
    }

}