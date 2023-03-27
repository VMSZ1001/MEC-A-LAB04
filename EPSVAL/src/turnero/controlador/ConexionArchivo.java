package turnero.controlador;

import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;
import turnero.modelo.Usuario;

public class ConexionArchivo {
    
    ArrayList<Usuario> listaUsuarios = new ArrayList(); 
    public static void conexionarchinorm (String[] a){
            File f = new File ("C:\\Users\\utp\\Desktop\\archivo.txt"); 
        try {
            FileWriter fw  = new FileWriter(f, true);
            BufferedWriter bw = new BufferedWriter(fw);
            
            for (int i = 0; i < a.length; i++) {
                bw.write (a[i]);
                bw.newLine();
            }
            
            bw.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    //conexFileNRead : se usa para Conexion del archivo para leerlo
    public static String[] conexFileNRead (){
            File f = new File ("C:\\Users\\utp\\Desktop\\archivo.txt"); 
            String a[] = new String[3];
        try {
            FileReader fr  = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String cadena;
            int i = 0;
            while((cadena=br.readLine()) != null){ 
                a[i] = cadena;
                i++;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return a;
    }
    
    public static void conexionarchiObj (Usuario a){
        ArrayList<Usuario> nuevalista = conexionarchiObjlectura(); 
        nuevalista.add(a);
            File f = new File ("C:\\Users\\utp\\Desktop\\archivoserializable.txt"); 
        try {
            FileOutputStream fos=new FileOutputStream(f);
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(nuevalista);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public static ArrayList<Usuario> conexionarchiObjlectura (){
            File f = new File ("C:\\Users\\utp\\Desktop\\archivoserializable.txt"); 
            ArrayList<Usuario> update = new ArrayList();
        try {
            FileInputStream fis=new FileInputStream(f);
            ObjectInputStream ois=new ObjectInputStream(fis);
            update  =(ArrayList<Usuario>)ois.readObject();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return update;
    }
}


