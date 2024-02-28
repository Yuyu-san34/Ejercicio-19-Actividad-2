public class App {
    public static void main(String[] args) {
        double horas, salario,retencion,bruto,neto;
        horas=48;
        salario=5000;
        bruto=horas*salario;
        retencion=salario*(12.5/100);
        neto=bruto-retencion;
        System.out.println("El salario bruto es:"+bruto);
        System.out.println("La retencion de fuente es:"+retencion);
        System.out.println("El salario neto es:"+neto);

       
        
    }
}
