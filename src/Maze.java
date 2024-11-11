import java.io.*;
import java.util.Locale;

public class Maze extends Graph {
    //variaveis
    private Node[][] maze;
    private int lines;
    private int columns;
    private int insulatedZones = 0;
    private String mostCommonCreature = "Nenhuma";

    //construtor
    public Maze(File file) throws IOException {
        super();
        System.out.println(file.getName()
                .replace("c","C")
                .replace("o","o ")
                .replace(".txt",""));
        createMaze(file);
        map();
        System.out.println("Número de regiões isoladas: " + insulatedZones);
        System.out.println("Criatura mais comum no labirinto inteiro: " + mostCommonCreature);
    }
    //metodo leitor
    private void createMaze(File file) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(file));
        String[] temp = br.readLine().split(" ");
        String temp1;
        lines = Integer.parseInt(temp[0]);
        columns = Integer.parseInt(temp[1]);
        maze = new Node[lines][columns];
        for (int i = 0; i < lines; i++) {
            temp1 = br.readLine();
            for (int j = 0; j < columns; j++) {
                maze[i][j].setSymbol(temp1.charAt(j));
            }
        }
    }
    private void map() {

    }
}