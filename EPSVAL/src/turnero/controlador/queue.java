package turnero.controlador;

import java.util.PriorityQueue;
import turnero.modelo.Usuario;

public class queue extends Usuario
{
    public static void main (String[] arg)
    {
        Usuario jose = new Usuario("123456789","jose", "pago", 0, "cc", "mayor50");
        Usuario martha = new Usuario ("12322222","martha","QuejasReclamos",1,"tarjetaIdentidad", "Discapacitado");
        Usuario ana  = new Usuario ("18253433","ana","atencion",1,"tarjetaIdentidad", "MujerEmbarazo");
        PriorityQueue <Usuario> pQueue = new PriorityQueue<Usuario> ();
        pQueue.add(jose);
        pQueue.add(martha);
        pQueue.add(ana);
        
        int count = 1;
       
        while (!pQueue.isEmpty())
        {
            System.out.println("Dequeued" + count + " --> " + pQueue.remove() );
            count++;
        }
        
    }
}
    

