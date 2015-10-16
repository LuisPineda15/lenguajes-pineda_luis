/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Colecciones;

/**
 *
 * @author T-107
 */
import java.io.*;
import java.util.ArrayList;
public class PersistenciaUsuario2 {
    ArrayList<Usuario> usuarios;
    public PersistenciaUsuario2() {
        usuarios=new ArrayList<Usuario>();
    }
public void guardar(Usuario u)throws Exception{
    //Este es el mas dificil, porque este usa el de abajo
    
    //File f=new File("Aqui va la direccion del archivo donde lo vas a guardar");
    //if(f.exists())usuarios=buscarTodos();
    
}

public ArrayList<Usuario> buscarTodos()throws Exception{
    //Aqui va toda su tarea(Este es el mas facil)
    return usuarios;
}

public Usuario buscarUno(Usuario u)throws Exception{
    //File f=new File("Aqui va la direccion del archivo donde lo vas a guardar");
    //Aqui va tu otra tarea
    return u;
    }


}

