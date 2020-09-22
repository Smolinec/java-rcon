package net.kronos.rkon.core;

import net.kronos.rkon.core.ex.AuthenticationException;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, AuthenticationException {
        // Connects to 127.0.0.1 on port 27015
        Rcon rcon = new Rcon("37.205.9.138", 32783, "Hp8d6fc6keqfTWdC".getBytes());

        // Example: On a minecraft server this will list the connected players
        String result = rcon.command("save-all");
//        String result = rcon.command("help 2");
        // Display the result in the console
        System.out.println(result);
    }
}
