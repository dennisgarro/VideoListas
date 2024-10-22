import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

public class Exportar {
    public void exportarArchivo(LinkedList<ObjEmpleado> lista) {
        if (lista.isEmpty()) {
            System.out.println("La lista esta vacia no se puede exportar el archivo");
            return;
        } else {
            try (FileWriter e = new FileWriter("Empleados.txt")) {
                for (ObjEmpleado obj : lista) {
                    e.write("Cedula: " + obj.getCedula() + "\n");
                    e.write("Nombre: " + obj.getNombre() + "\n");
                    e.write("Apellido: " + obj.getApellido() + "\n");
                    e.write("Direccion: " + obj.getDireccion() + "\n");
                    e.write("edad: " + obj.getEdad() + "\n");
                    e.write("Sexo: " + obj.getSexo() + "\n");
                    e.write("Correo: " + obj.getCorreo() + "\n");
                    e.write("------------------------------------------------------ \n");

                }
                System.out.println("Archivo exportado correctamente ");

            } catch (IOException e) {
                // TODO: handle exception
                e.printStackTrace();
            }
        }
    }
}
