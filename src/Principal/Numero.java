package Principal;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Numero {

    private int number;
    private String cambiaNumero;
    private String suma;
    private String resta;
    private String valor;
    private String doble;
    private String triple;
    private String cuadruple;
    private String numberactual;

    public Numero() {
    }

    public Numero(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getNumberactual() {
        int nat = number;
        String natdos = String.valueOf(number);
        numberactual = natdos;
        
        return numberactual;
    }

    public void setNumberactual(String numberactual) {
        this.numberactual = numberactual;
    }
    

    public String getCambiaNumero() {
        int cam;
        int cambio;
        cambio = Integer.parseInt(
                JOptionPane.showInputDialog("Desea cambiat su numero 1)Si 2)No"));
        if (cambio == 1) {
            cam = Integer.parseInt(
                    JOptionPane.showInputDialog("Deme su nuevo valor valor"));
            number = cam;
            int cambio2 = cam;
            String cambio3 = String.valueOf(cam);
            cambiaNumero = cambio3;
            return cambiaNumero;
        }
        else{
        JOptionPane.showMessageDialog(null, "No se cambio nada");
        }
        number = number;
        int cambio4 = number;
        String cambio5 =String.valueOf(number);
        cambiaNumero = cambio5;
        return cambiaNumero;
    }

    public void setCambiaNumero(String cambiaNumero) {
        this.cambiaNumero = cambiaNumero;
    }

    public String getSuma() {
        int a, b, sumatotal;
        a = Integer.parseInt(
                JOptionPane.showInputDialog("Deme un valor"));
        b = Integer.parseInt(
                JOptionPane.showInputDialog("Deme otro valor"));
        sumatotal = a + b;
        int sumacompleta = number + sumatotal;
        String smc = String.valueOf(sumacompleta);
        suma = smc;
        return suma;
    }

    public void setSuma(String suma) {
        this.suma = suma;
    }

    public String getResta() {
        int c, d, restatotal;
        c = Integer.parseInt(
                JOptionPane.showInputDialog("Deme un valor"));
        d = Integer.parseInt(
                JOptionPane.showInputDialog("Deme otro valor"));
        restatotal = c - d;
        int restados = number - restatotal;
        int r0 = restados;
        String r1 = String.valueOf(restados);
        resta = r1;
        return resta;
    }

    public void setResta(String resta) {
        this.resta = resta;
    }

    public String getValor() {
        int va = number;
        String vai = String.valueOf(number);
        valor = vai;
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getDoble() {
        int dob = number*2;
        String mdob = String.valueOf(dob);
        doble =mdob;
        return doble;
    }

    public void setDoble(String doble) {
        this.doble = doble;
    }

    public String getTriple() {
        int trip = (int) Math.pow(number, 3);
        String mtrip = String.valueOf(trip);
        triple =mtrip;
        return triple;
    }

    public void setTriple(String triple) {
        this.triple = triple;
    }

    public String getCuadruple() {
        int cu = (int) Math.pow(number, 4);
        String mcu = String.valueOf(cu);
        cuadruple = mcu;
        return cuadruple;
    }

    public void setCuadruple(String cuadruple) {
        this.cuadruple = cuadruple;
    }

}
