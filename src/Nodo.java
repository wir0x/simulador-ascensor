/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GonzaloSV
 */
public class Nodo {

    //  Atributos
    private Nodo ante;
    private int obj;   // obj sera el numero de piso en que se encuentra el ascensor
    private Nodo prox;
    private int cprs; // Contador de personas
    private boolean stop; // Ascensor

    //  Constructor
    public Nodo(Nodo a, int ps, Nodo p) {
        ante = a;
        obj = ps;
        prox = p;
        cprs = 0;
        stop = false;
    }

    //  Funciones insertoras (set get)
    public void setAnte(Nodo a) {
        ante = a;
    }

    public Nodo getAnte() {
        return ante;
    }

    public void setObj(int x) {
        obj = x;
    }

    public int getObj() {
        return obj;
    }

    public void setProx(Nodo p) {
        prox = p;
    }

    public Nodo getProx() {
        return prox;
    }

    public void setPersona(int x) {
        cprs = x;
    }

    public int getPersona() {
        return cprs;
    }

    //  Métodos 
    public void vPersona(int x) { // Personas que visitan un respectivo piso
        cprs = cprs + x;
    }

    public void isPiso() { // Este metodo se encarga de que pare el ascensor
        stop = true;
    }

    public void desPiso() { // Este metodo se encarga de que el ascensor continue
        stop = false;
    }

    public boolean estadoPiso() { // Retorna este estado actual desl ascensor
        return stop;
    }
}
