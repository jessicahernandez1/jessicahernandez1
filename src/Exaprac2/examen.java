
package exaprac2;

import javax.swing.JOptionPane;


public class examen {

   
    public static void main(String[] args) {
       int n= 0;
       double mayor=0;
       String detalle="Detalle de planilla \n\n";
       double total=0;
       n=Integer.parseInt(JOptionPane.showInputDialog("N° de empleados a registrar en planilla"));
       
       String empleado[]= new String[n];
       int horas[]= new int[n];
       double pxh[]= new double[n];
       double salario[]= new double [n];
       
       for(int i=0; i<n; i++){
           empleado[i]=JOptionPane.showInputDialog("Nombre del empleado "+(i+1));
           horas[i]=Integer.parseInt(JOptionPane.showInputDialog("Cantidad de horas trabajadas"));
           pxh[i]=Double.parseDouble(JOptionPane.showInputDialog("Salario por horas"));
           salario[i]=horas[i]*pxh[i];
           total+=salario[i];
           detalle += "Empleado: "+ empleado[i] + "\n" + "Horas trabajadas: "+ horas[i] + "\n" + "Salario por horas: "+ pxh[i] + "\n" + "Salario a pagar: " + salario[i] + "\n\n";
                   
       }
       JOptionPane.showMessageDialog(null, detalle + "\n\n"+ "Total de planilla: "+total);
       
          mayor=salario[0];
          
       for (int c=0; c<n; c++){
           if (salario[c]>mayor){
               mayor=salario[c];
               JOptionPane.showMessageDialog(null,"El salario mayor es de: "+mayor+" y pertenece a: "+empleado[c]);
           }
       }
    }
    
}
