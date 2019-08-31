package Servidor;

import java.io.IOException;
/*
 * @author Alejandro Alvis
 */
public class MainServidor 
{
    public static void main(String[] args) throws IOException
    {
        Servidor serv = new Servidor(); //Se crea el servidor

        System.out.println("- Iniciando Servidor\n");
        serv.startServer(); //Se inicia el servidor
    }
}
