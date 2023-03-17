import java.util.ArrayDeque;
import java.util.Deque;

class Paciente {
    String nombre;
    int años;
    String affiliacion;
    String especialCondicion;
    int turn;
    
    public Paciente(String nombre, int años, String affiliacion, String especialCondicion) {
        this.nombre = nombre;
        this.años = años;
        this.affiliacion = affiliacion;
        this.especialCondicion = especialCondicion;
        this.turn = -1;
    }
}

class EPS {
    Deque<Paciente> queue;
    int currentTurn;
    
    public EPS() {
        queue = new ArrayDeque<>();
        currentTurn = 0;
    }
    
    public void addPaciente(Paciente paciente) {
        if (paciente.especialCondicion.equals("tercera edad") || paciente.años < 12) {
            queue.offerFirst(paciente);
        } else if (paciente.especialCondicion.equals("embarazo")) {
            boolean inserted = false;
            for (int i = 0; i < queue.size(); i++) {
                Paciente p = queue.peek();
                if (!p.especialCondicion.equals("tercera edad") && p.años >= 12) {
                    queue.add(i, paciente);
                    inserted = true;
                    break;
                }
                queue.offerLast(queue.poll());
            }
            if (!inserted) {
                queue.offerLast(paciente);
            }
        } else if (paciente.especialCondicion.equals("limitación motriz")) {
            boolean inserted = false;
            for (int i = 0; i < queue.size(); i++) {
                Paciente p = queue.peek();
                if (!p.especialCondicion.equals("tercera edad") && p.años >= 12 && !p.especialCondicion.equals("embarazo")) {
                    queue.add(i, paciente);
                    inserted = true;
                    break;
                }
                queue.offerLast(queue.poll());
            }
            if (!inserted) {
                queue.offerLast(paciente);
            }
        } else if (paciente.affiliacion.equals("PC")) {
            boolean inserted = false;
            for (int i = 0; i < queue.size(); i++) {
                Paciente p = queue.peek();
                if (!p.especialCondicion.equals("tercera edad") && p.años >= 12 && !p.especialCondicion.equals("embarazo") && !p.especialCondicion.equals("limitación motriz") && !p.affiliacion.equals("PC")) {
                    queue.add(i,paciente);
                    inserted = true;
                    break;
                }
                queue.offerLast(queue.poll());
            }
            if (!inserted) {
                queue.offerLast(paciente);
            }
        } else {
            queue.offerLast(paciente);
        }
    }
    
    public void nextTurn() {
        if (queue.isEmpty()) {
            System.out.println("No hay pacientes en espera.");
            return;
        }
        
        currentTurn++;
        Paciente paciente = queue.poll();
        paciente.turn = currentTurn;
        System.out.println("Turno " + paciente.turn + ": " + paciente.nombre);
    }
    
   