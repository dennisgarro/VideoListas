import java.util.LinkedList;
import java.util.Scanner;

public class Metodos {
    public LinkedList<ObjEmpleado> IngresarRegistro(LinkedList<ObjEmpleado> lista) {
        boolean continua = true;
        Scanner sc = new Scanner(System.in);
        int opt = 0;
        while (continua) {
            ObjEmpleado obj = new ObjEmpleado();
            System.out.println("Ingrese los datos del empleado \n");
            System.out.println("Ingrese la cedula");
            obj.setCedula(sc.nextInt());
            System.out.println("Ingrese el nombre");
            obj.setNombre(sc.next());
            System.out.println("Ingrese el apellido ");
            obj.setApellido(sc.next());
            System.out.println("Ingrese la dirección");
            obj.setDireccion(sc.next());
            System.out.println("Ingrese la edad ");
            obj.setEdad(sc.nextInt());
            System.out.println("ingrese M: masculino, F: femenino");
            obj.setSexo(sc.next());
            System.out.println("Ingrese el correo");
            obj.setCorreo(sc.next());
            lista.add(obj);
            System.out.println("Desea Ingresar mas registros 1: Si, 2: NO");
            opt = sc.nextInt();

            if (opt == 2) {
                continua = false;
            }
        }
        return lista;
    }

    public void MostrarResgistros(LinkedList<ObjEmpleado> lista) {
        for (ObjEmpleado obj : lista) {
            System.out.println("Cedula: " + obj.getCedula());
            System.out.println("Nombre: " + obj.getNombre());
            System.out.println("Apellido: " + obj.getApellido());
            System.out.println("Direccion: " + obj.getDireccion());
            System.out.println("Edad: " + obj.getEdad());
            System.out.println("Sexo: " + obj.getSexo());
            System.out.println("Correo: " + obj.getCorreo());
            System.out.println("----------------------------------------------------------");
        }
    }

    public void Exportar(LinkedList<ObjEmpleado> lista) {
        Exportar Exp = new Exportar();
        Exp.exportarArchivo(lista);
    }

    public LinkedList<ObjEmpleado> Importar() {
        Importar i = new Importar();
        LinkedList<ObjEmpleado> lista = i.ImportarArchivo();
        return lista;

    }
}
