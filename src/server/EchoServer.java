package server;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class EchoServer {
    public static void main(String[] args) throws IOException{
        try(ServerSocket s = new ServerSocket(8189)){
            try(Socket incoming = s.accept()){
                InputStream inputStream = incoming.getInputStream();
                OutputStream outputStream = incoming.getOutputStream();
                System.out.println("waiting connection");
                try(Scanner in = new Scanner(inputStream)){
                    PrintWriter out = new PrintWriter(outputStream, true);
                    out.println("Hello, Entry Bye to exit");

                    boolean done=false;
                    while(!done && in.hasNextLine()){
                        String line = in.nextLine();
                        out.println("Echo: "+line);
                        if(line.trim().equals("Bye"))
                            done=true;
                    }
                }
            }
        }
    }
}
