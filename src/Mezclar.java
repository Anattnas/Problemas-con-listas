
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

    public class Mezclar {

        // Método que combina dos listas ordenadas en una sola lista también ordenada
        public static List<Integer> merge(List<Integer> list1, List<Integer> list2) {
            List<Integer> resultList = new ArrayList<>();
            int i = 0, j = 0;

            // Combina ambas listas mientras las recorremos
            while (i < list1.size() && j < list2.size()) {
                if (list1.get(i) < list2.get(j)) {
                    resultList.add(list1.get(i));
                    i++;
                } else {
                    resultList.add(list2.get(j));
                    j++;
                }
            }

            // Agregar los elementos restantes de list1 si los hay
            while (i < list1.size()) {
                resultList.add(list1.get(i));
                i++;
            }

            // Agregar los elementos restantes de list2 si los hay
            while (j < list2.size()) {
                resultList.add(list2.get(j));
                j++;
            }

            return resultList;
        }

        // Método principal para ejecutar el programa
        public static void main(String[] args) {
            if (args.length != 2) {
                System.out.println("Debe proporcionar dos listas como argumentos de línea de comandos.");
                return;
            }

            // Convertir los argumentos de línea de comandos en listas de enteros
            List<Integer> list1 = parseInput(args[0]);
            List<Integer> list2 = parseInput(args[1]);

            // Combinar las listas
            List<Integer> mergedList = merge(list1, list2);

            // Imprimir la lista resultante
            System.out.println(mergedList);
        }

        // Método auxiliar para convertir una cadena de números en una lista de enteros
        private static List<Integer> parseInput(String input) {
            String[] parts = input.split(", ");
            List<Integer> result = new ArrayList<>();
            for (String part : parts) {
                result.add(Integer.parseInt(part));
            }
            return result;
        }
    }
