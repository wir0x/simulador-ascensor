
import javax.swing.*;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author GonzaloSV
 */
public class Lista {
    // Atributos

    private Nodo actual;// Nodo que me dira cual es el piso actual
    private Nodo prim;
    private Nodo ultm;
    private int cant;
    private int cantP;  // Cantidad de personas
    private boolean sube; // verifica el estado del ascensor si esta en true quiere decir que puede sube, si esta en false baja

    //  Constructor
    public Lista() {
        prim = null;
        ultm = null;
        cant = 0;
        cantP = 0;
        sube = true;
        actual = prim;
    }

    //  Funciones insertoras 
    public void setCant(int c) {
        cant = c;
    }

    public int getCant() {
        return cant;
    }

    //  Metodos
    public boolean vacio() {
        return (prim == null && ultm == null);
    }

    public int getObj(int pos) {
        Nodo p = prim;
        for (int i = 1; i < pos; i++) {
            p = p.getProx();
        }
        return p.getObj();
    }

    public int cantPersona() {
        return cantP;
    }

    public boolean puedeSubir(int x) {
        return cantP + x <= 15;
    }

    public int pActual() {
        return actual.getObj();
    }

    public Nodo Primero() {
        return prim;
    }

    public Nodo Ultimo() {
        return ultm;
    }

    public void insertarUltimo(int x) {
        Nodo n = new Nodo(ultm, x, null);
        if (vacio()) {
            prim = ultm = n;
        } else {
            ultm.setProx(n);
            ultm = n;
        }
        cant++;
    }

    public boolean subirPers(int x) {
        if (puedeSubir(x)) {
            cantP = cantP + x;
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Capacidad no permitida. Exite capacidad para: " + Integer.toString(15 - cantP) + " personas");
            return false;
        }
    }

    public boolean bajarPers(int x) {
        if (cantP - x >= 0) {
            cantP -= x;
            actual.vPersona(x);
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "No pueden bajar: " + x + " personas. Mirar la cantida actual de personas en el tablero");
            return false;
        }
    }

    public void cantidadPisos() {
        for (int i = 0; i < 5; i++) {
            insertarUltimo(i);
        }
        actual = prim;
    }

    public void iniciar() {
        prim.isPiso();
    }

    public void nextP() {
        if (sube) {
            if (actual.getProx() != null) {
                actual = actual.getProx();
            } else {
                sube = false;
                actual = actual.getAnte();
            }
        } else {
            if (actual.getAnte() != null) {
                actual = actual.getAnte();
            } else {
                sube = true;
                actual = actual.getProx();
            }
        }
    }

    public void vfep() {// verificar entrada al piso
        if (actual.estadoPiso()) {
            int pe = Integer.parseInt(JOptionPane.showInputDialog("Alguien ingresa?", "Aquí"));
            while (!subirPers(pe)) {
                pe = Integer.parseInt(JOptionPane.showInputDialog("Alguien ingresa?", "Aqui"));
            }
            actual.desPiso();
        }
    }

    public void vfsp() { //     verificar salida del piso
        if (actual.estadoPiso()) {
            int ps = Integer.parseInt(JOptionPane.showInputDialog("Alguien sale?", "Aquí"));
            while (!bajarPers(ps)) {
                ps = Integer.parseInt(JOptionPane.showInputDialog("Alguien sale?", "Aquí"));
            }
        }
    }

    public void vfP() {//   verificar piso
        if (actual.estadoPiso()) {
            int ps = Integer.parseInt(JOptionPane.showInputDialog("Cuántas personas saldrán?", "0"));
            while (!bajarPers(ps)) {
                ps = Integer.parseInt(JOptionPane.showInputDialog("Cuántas personas saldrán?", "0"));
            }
            int pe = Integer.parseInt(JOptionPane.showInputDialog("Cuántas personas entrarán?", "0"));
            while (!subirPers(pe)) {
                pe = Integer.parseInt(JOptionPane.showInputDialog("Cuántas personas entrarán?", "0"));
            }
            actual.desPiso();
        }
    }

    public void setPiso(int x) {
        Nodo p = prim;
        while (p != null) {
            if (p.getObj() == x) {
                p.isPiso();
                return;
            }
            p = p.getProx();
        }
    }
}
