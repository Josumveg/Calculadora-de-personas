package calculadorapersonas;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.control.ChoiceBox;

/**
 * @author Jose Pablo Umaña Vega
 * @version 19.0.2
 */

public class main extends Application{
    
    /**
     * Este programa calcula la suma, resta, 
     * division o multiplicacion de la edad de
     * 2 personas.
     * @param args 
     */

    public static void main(String[] args) {
        /**
         * Este es el metodo principal, 
         * es crucial para el funcionamiento
         * del programa.
         */
        launch(args);
        /**
         * Se tiene que poner este comando
         * para utilizar javafx.
         */
    }
    
    /**
     * Se declaran los objetos persona
     * para que puedan ser utilizados en
     * toda la clase main.
     */
    Persona persona1;
    Persona persona2;
    Persona persona3;
    Persona persona4;
    Persona contador;
    
    /**
     * Metodo start que se utiliza para
     * inicializar el stage o la ventana
     * con javafx.
     * @param primaryStage
     * @throws Exception 
     */
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Calculadora de personas");
        
        //Espacio para variables
        contador = new Persona();
        /**
         * Se le asigna una clase al objeto persona, 
         * pero solo con la variable cantidad
         */
        
        // Espacio para labels
        Label labelresultado = new Label("Resultado: ");
        labelresultado.setTranslateX(-150);
        labelresultado.setTranslateY(-200);
        labelresultado.setTextFill(Color.BROWN);
        Font font = Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 25);
        labelresultado.setFont(font);
        /**
         * Label para mostrar el texto resultado
         */
        
        Label labelresultado2 = new Label("");
        labelresultado2.setTranslateX(70);
        labelresultado2.setTranslateY(-200);
        labelresultado2.setTextFill(Color.BROWN);
        labelresultado2.setFont(font);
        /**
         * Label para mostrar el resultado de la operacion
         */
        
        Label labelnombre = new Label("Nombre: ");
        labelnombre.setTranslateX(-150);
        labelnombre.setTranslateY(-50);
        labelnombre.setTextFill(Color.BLACK);
        Font font2 = Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 15);
        labelnombre.setFont(font2);
        /**
         * Label para mostrar el texto nombre
         */
        
        Label labelprovincia = new Label("Provincia: ");
        labelprovincia.setTranslateX(-145);
        labelprovincia.setTranslateY(0);
        labelprovincia.setTextFill(Color.BLACK);
        labelprovincia.setFont(font2);
        /**
         * Label para mostrar el texto provincia
         */
        
        Label labeledad = new Label("Edad: ");
        labeledad.setTranslateX(-157);
        labeledad.setTranslateY(50);
        labeledad.setTextFill(Color.BLACK);
        labeledad.setFont(font2);
        /**
         * Label para mostrar el texto edad
         */
        
        Label labelagregar = new Label("Agregar persona");
        labelagregar.setTranslateX(-100);
        labelagregar.setTranslateY(-125);
        labelagregar.setTextFill(Color.BLUE);
        Font font3 = Font.font("Times New Roman", FontWeight.BOLD, FontPosture.REGULAR, 25);
        labelagregar.setFont(font3);
        /**
         * Label para mostrar el texto agregar persona
         */
        
        Label labeloperacion = new Label("Elegir operacion");
        labeloperacion.setTranslateX(125);
        labeloperacion.setTranslateY(-125);
        labeloperacion.setTextFill(Color.BLUE);
        labeloperacion.setFont(font3);
        /**
         * Label para mostrar el texto elegir operacion
         */
        
        Label labelpersona1 = new Label("Persona 1:");
        labelpersona1.setTranslateX(80);
        labelpersona1.setTranslateY(-50);
        labelpersona1.setTextFill(Color.BLACK);
        labelpersona1.setFont(font2);
        /**
         * Label para mostrar el texto persona 1
         */
        
        Label labelpersona2 = new Label("Persona 2:");
        labelpersona2.setTranslateX(80);
        labelpersona2.setTranslateY(15);
        labelpersona2.setTextFill(Color.BLACK);
        labelpersona2.setFont(font2);
        /**
         * Label para mostrar el texto persona 2
         */
        
        Label labelerror = new Label("");
        labelerror.setTranslateX(0);
        labelerror.setTranslateY(170);
        labelerror.setTextFill(Color.RED);
        labelerror.setFont(font2);
        /**
         * Label para mostrar errores en el uso
         * incorrecto del programa por parte del usuario, 
         * o para informar al usuario en general
         */
        
        // Espacio para textfields
        TextField entrynombre = new TextField();
        entrynombre.setTranslateX(-45);
        entrynombre.setTranslateY(-50);
        entrynombre.setMaxWidth(125);
        /**
         * Text field para introducir el nombre de la persona 
         */
        
        TextField entryedad = new TextField();
        entryedad.setTranslateX(-45);
        entryedad.setTranslateY(50);
        entryedad.setMaxWidth(125);
        /**
         * Text field para introducir la edad de la persona 
         */
        
        // Espacio para drop down lists
        ChoiceBox<String> listaprovincia = new ChoiceBox<>();
        listaprovincia.setTranslateX(-45);
        listaprovincia.setTranslateY(0);
        listaprovincia.setMaxWidth(125);
        listaprovincia.getItems().addAll("San Jose", "Cartago", 
                "Limon", "Heredia", "Guanacaste", "Alajuela", 
                "Puntarenas");
        /**
         * Drop down list para elegir
         * la provincia de la que proviene
         * la persona
         */
        
        ChoiceBox<String> listapersona1 = new ChoiceBox<>();
        listapersona1.setTranslateX(125);
        listapersona1.setTranslateY(-15);
        listapersona1.setMaxWidth(160);
        /**
         * Drop down list para elegir 
         * la primera persona con la 
         * que se quiere realizar la 
         * operacion de su edad
         */
        
        ChoiceBox<String> listapersona2 = new ChoiceBox<>();
        listapersona2.setTranslateX(125);
        listapersona2.setTranslateY(50);
        listapersona2.setMaxWidth(160);
        /**
         * Drop down list para elegir 
         * la segunda persona con la 
         * que se quiere realizar la 
         * operacion de su edad
         */
        
        // Espacio para botones 
        Button botonagregarpersona = new Button("Añadir persona");
        botonagregarpersona.setTranslateX(-50);
        botonagregarpersona.setTranslateY(100);
        /**
         * Creacion de boton para 
         * agregar la persona deseada
         */
        
        Button sumar = new Button("+");
        sumar.setTranslateX(70);
        sumar.setTranslateY(100);
        /**
         * Creacion de boton para 
         * sumar las edades de las 
         * personas
         */
        
        Button restar = new Button("-");
        restar.setTranslateX(110);
        restar.setTranslateY(100);
        restar.setMaxWidth(25);
        /**
         * Creacion de boton para 
         * restar las edades de las 
         * personas
         */
        
        Button multiplicar = new Button("*");
        multiplicar.setTranslateX(150);
        multiplicar.setTranslateY(100);
        multiplicar.setMaxWidth(25);
        /**
         * Creacion de boton para 
         * multiplicar las edades de las 
         * personas
         */
        
        Button dividir = new Button("/");
        dividir.setTranslateX(190);
        dividir.setTranslateY(100);
        dividir.setMaxWidth(25);
        /**
         * Creacion de boton para 
         * dividir las edades de las 
         * personas
         */
        
        // Funcionalidad de botones
        botonagregarpersona.setOnAction(e -> {
        /**
         * Funcion que se da al presionar
         * el boton agregar persona. Se obtienen
         * los valores de edad, provincia y nombre, luego
         * se guardan en un objeto de la clase Persona. 
         */
        try {
            if (contador.cantidad == 0) {
                persona1 = new Persona(entrynombre.getText(), Integer.parseInt(entryedad.getText()), listaprovincia.getValue());
                listapersona1.getItems().add(persona1.nombre);
                listapersona2.getItems().add(persona1.nombre);
                contador.cantidad++;
            }
            else if (contador.cantidad == 1) {
                persona2 = new Persona(entrynombre.getText(), Integer.parseInt(entryedad.getText()), listaprovincia.getValue());
                listapersona1.getItems().add(persona2.nombre);
                listapersona2.getItems().add(persona2.nombre);
                contador.cantidad++;
            }
            else if (contador.cantidad == 2) {
                persona3 = new Persona(entrynombre.getText(), Integer.parseInt(entryedad.getText()), listaprovincia.getValue());
                listapersona1.getItems().add(persona3.nombre);
                listapersona2.getItems().add(persona3.nombre);
                contador.cantidad++;
            }
            else if (contador.cantidad == 3) {
                persona4 = new Persona(entrynombre.getText(), Integer.parseInt(entryedad.getText()), listaprovincia.getValue());
                listapersona1.getItems().add(persona4.nombre);
                listapersona2.getItems().add(persona4.nombre);
                contador.cantidad++;
            }
            else {
                labelerror.setText("Se ha llegado a la cantidad maxima de personas");
            }
        }
        catch(Exception except) {
            labelerror.setText("Llenar todos los espacios antes de agregar persona");
        }
        });
        
        sumar.setOnAction(e -> {
        /**
         * Funcion que se da al presionar el boton
         * para sumar edades. Se busca en los objetos
         * persona los nombres que coincidan con los 
         * que se eligen, luego se suman sus edades. 
         */
        String choice1 = listapersona1.getValue();
        String choice2 = listapersona2.getValue();
        int edad1;
        int edad2;
        if (choice1 != null && choice2 != null) {
            if (choice1.equals(persona1.nombre)) {
                edad1 = persona1.edad;
                if (choice2.equals(persona1.nombre)){
                    edad2 = persona1.edad;
                    labelresultado2.setText(Integer.toString(edad1 + edad2));
                }
                else if (choice2.equals(persona2.nombre)){
                    edad2 = persona2.edad;
                    labelresultado2.setText(Integer.toString(edad1 + edad2));
                }
                else if (choice2.equals(persona3.nombre)){
                    edad2 = persona3.edad;
                    labelresultado2.setText(Integer.toString(edad1 + edad2));
                }
                else {
                    edad2 = persona4.edad;
                    labelresultado2.setText(Integer.toString(edad1 + edad2));
                }
            }
            else if (choice1.equals(persona2.nombre)) {
                edad1 = persona2.edad;
                if (choice2.equals(persona1.nombre)){
                    edad2 = persona1.edad;
                    labelresultado2.setText(Integer.toString(edad1 + edad2));
                }
                else if (choice2.equals(persona2.nombre)){
                    edad2 = persona2.edad;
                    labelresultado2.setText(Integer.toString(edad1 + edad2));
                }
                else if (choice2.equals(persona3.nombre)){
                    edad2 = persona3.edad;
                    labelresultado2.setText(Integer.toString(edad1 + edad2));
                }
                else {
                    edad2 = persona4.edad;
                    labelresultado2.setText(Integer.toString(edad1 + edad2));
                }
            }
            else if (choice1.equals(persona3.nombre)) {
                edad1 = persona3.edad;
                if (choice2.equals(persona1.nombre)){
                    edad2 = persona1.edad;
                    labelresultado2.setText(Integer.toString(edad1 + edad2));
                }
                else if (choice2.equals(persona2.nombre)){
                    edad2 = persona2.edad;
                    labelresultado2.setText(Integer.toString(edad1 + edad2));
                }
                else if (choice2.equals(persona3.nombre)){
                    edad2 = persona3.edad;
                    labelresultado2.setText(Integer.toString(edad1 + edad2));
                }
                else {
                    edad2 = persona4.edad;
                    labelresultado2.setText(Integer.toString(edad1 + edad2));
                }
            }
            else {
                edad1 = persona4.edad;
                if (choice2.equals(persona1.nombre)){
                    edad2 = persona1.edad;
                    labelresultado2.setText(Integer.toString(edad1 + edad2));
                }
                else if (choice2.equals(persona2.nombre)){
                    edad2 = persona2.edad;
                    labelresultado2.setText(Integer.toString(edad1 + edad2));
                }
                else if (choice2.equals(persona3.nombre)){
                    edad2 = persona3.edad;
                    labelresultado2.setText(Integer.toString(edad1 + edad2));
                }
                else {
                    edad2 = persona4.edad;
                    labelresultado2.setText(Integer.toString(edad1 + edad2));
                    
                }
            }
        }
        else {
            labelerror.setText("Elegir personas antes de elegir operacion");
        }
        });
        
        restar.setOnAction(e -> {
        /**
         * Funcion que se da al presionar el boton
         * para sumar edades. Se busca en los objetos
         * persona los nombres que coincidan con los 
         * que se eligen, luego se restan sus edades. 
         */
        String choice1 = listapersona1.getValue();
        String choice2 = listapersona2.getValue();
        int edad1;
        int edad2;
        if (choice1 != null && choice2 != null) {
            if (choice1.equals(persona1.nombre)) {
                edad1 = persona1.edad;
                if (choice2.equals(persona1.nombre)){
                    edad2 = persona1.edad;
                    labelresultado2.setText(Integer.toString(edad1 - edad2));
                }
                else if (choice2.equals(persona2.nombre)){
                    edad2 = persona2.edad;
                    labelresultado2.setText(Integer.toString(edad1 - edad2));
                }
                else if (choice2.equals(persona3.nombre)){
                    edad2 = persona3.edad;
                    labelresultado2.setText(Integer.toString(edad1 - edad2));
                }
                else {
                    edad2 = persona4.edad;
                    labelresultado2.setText(Integer.toString(edad1 - edad2));
                }
            }
            else if (choice1.equals(persona2.nombre)) {
                edad1 = persona2.edad;
                if (choice2.equals(persona1.nombre)){
                    edad2 = persona1.edad;
                    labelresultado2.setText(Integer.toString(edad1 - edad2));
                }
                else if (choice2.equals(persona2.nombre)){
                    edad2 = persona2.edad;
                    labelresultado2.setText(Integer.toString(edad1 - edad2));
                }
                else if (choice2.equals(persona3.nombre)){
                    edad2 = persona3.edad;
                    labelresultado2.setText(Integer.toString(edad1 - edad2));
                }
                else {
                    edad2 = persona4.edad;
                    labelresultado2.setText(Integer.toString(edad1 - edad2));
                }
            }
            else if (choice1.equals(persona3.nombre)) {
                edad1 = persona3.edad;
                if (choice2.equals(persona1.nombre)){
                    edad2 = persona1.edad;
                    labelresultado2.setText(Integer.toString(edad1 - edad2));
                }
                else if (choice2.equals(persona2.nombre)){
                    edad2 = persona2.edad;
                    labelresultado2.setText(Integer.toString(edad1 - edad2));
                }
                else if (choice2.equals(persona3.nombre)){
                    edad2 = persona3.edad;
                    labelresultado2.setText(Integer.toString(edad1 - edad2));
                }
                else {
                    edad2 = persona4.edad;
                    labelresultado2.setText(Integer.toString(edad1 - edad2));
                }
            }
            else {
                edad1 = persona4.edad;
                if (choice2.equals(persona1.nombre)){
                    edad2 = persona1.edad;
                    labelresultado2.setText(Integer.toString(edad1 - edad2));
                }
                else if (choice2.equals(persona2.nombre)){
                    edad2 = persona2.edad;
                    labelresultado2.setText(Integer.toString(edad1 - edad2));
                }
                else if (choice2.equals(persona3.nombre)){
                    edad2 = persona3.edad;
                    labelresultado2.setText(Integer.toString(edad1 - edad2));
                }
                else {
                    edad2 = persona4.edad;
                    labelresultado2.setText(Integer.toString(edad1 - edad2));
                    
                }
            }
        }
        else {
            labelerror.setText("Elegir personas antes de elegir operacion");
        }
        });
        
        dividir.setOnAction(e -> {
        /**
         * Funcion que se da al presionar el boton
         * para sumar edades. Se busca en los objetos
         * persona los nombres que coincidan con los 
         * que se eligen, luego se dividen sus edades. 
         */
        String choice1 = listapersona1.getValue();
        String choice2 = listapersona2.getValue();
        int edad1;
        int edad2;
        if (choice1 != null && choice2 != null) {
            if (choice1.equals(persona1.nombre)) {
                edad1 = persona1.edad;
                if (choice2.equals(persona1.nombre)){
                    edad2 = persona1.edad;
                    labelresultado2.setText(Double.toString((float) edad1 / edad2));
                }
                else if (choice2.equals(persona2.nombre)){
                    edad2 = persona2.edad;
                    labelresultado2.setText(Double.toString((float) edad1 / edad2));
                }
                else if (choice2.equals(persona3.nombre)){
                    edad2 = persona3.edad;
                    labelresultado2.setText(Double.toString((float) edad1 / edad2));
                }
                else {
                    edad2 = persona4.edad;
                    labelresultado2.setText(Double.toString((float) edad1 / edad2));
                }
            }
            else if (choice1.equals(persona2.nombre)) {
                edad1 = persona2.edad;
                if (choice2.equals(persona1.nombre)){
                    edad2 = persona1.edad;
                    labelresultado2.setText(Double.toString((float) edad1 / edad2));
                }
                else if (choice2.equals(persona2.nombre)){
                    edad2 = persona2.edad;
                    labelresultado2.setText(Double.toString((float) edad1 / edad2));
                }
                else if (choice2.equals(persona3.nombre)){
                    edad2 = persona3.edad;
                    labelresultado2.setText(Double.toString((float) edad1 / edad2));
                }
                else {
                    edad2 = persona4.edad;
                    labelresultado2.setText(Double.toString((float) edad1 / edad2));
                }
            }
            else if (choice1.equals(persona3.nombre)) {
                edad1 = persona3.edad;
                if (choice2.equals(persona1.nombre)){
                    edad2 = persona1.edad;
                    labelresultado2.setText(Double.toString((float) edad1 / edad2));
                }
                else if (choice2.equals(persona2.nombre)){
                    edad2 = persona2.edad;
                    labelresultado2.setText(Double.toString((float) edad1 / edad2));
                }
                else if (choice2.equals(persona3.nombre)){
                    edad2 = persona3.edad;
                    labelresultado2.setText(Double.toString((float) edad1 / edad2));
                }
                else {
                    edad2 = persona4.edad;
                    labelresultado2.setText(Double.toString((float) edad1 / edad2));
                }
            }
            else {
                edad1 = persona4.edad;
                if (choice2.equals(persona1.nombre)){
                    edad2 = persona1.edad;
                    labelresultado2.setText(Double.toString((float) edad1 / edad2));
                }
                else if (choice2.equals(persona2.nombre)){
                    edad2 = persona2.edad;
                    labelresultado2.setText(Double.toString((float) edad1 / edad2));
                }
                else if (choice2.equals(persona3.nombre)){
                    edad2 = persona3.edad;
                    labelresultado2.setText(Double.toString((float) edad1 / edad2));
                }
                else {
                    edad2 = persona4.edad;
                    labelresultado2.setText(Double.toString((float) edad1 / edad2));
                    
                }
            }
        }
        else {
            labelerror.setText("Elegir personas antes de elegir operacion");
        }
        });
        
        multiplicar.setOnAction(e -> {
        /**
         * Funcion que se da al presionar el boton
         * para sumar edades. Se busca en los objetos
         * persona los nombres que coincidan con los 
         * que se eligen, luego se multiplican sus edades. 
         */
        String choice1 = listapersona1.getValue();
        String choice2 = listapersona2.getValue();
        int edad1;
        int edad2;
        if (choice1 != null && choice2 != null) {
            if (choice1.equals(persona1.nombre)) {
                edad1 = persona1.edad;
                if (choice2.equals(persona1.nombre)){
                    edad2 = persona1.edad;
                    labelresultado2.setText(Integer.toString(edad1 * edad2));
                }
                else if (choice2.equals(persona2.nombre)){
                    edad2 = persona2.edad;
                    labelresultado2.setText(Integer.toString(edad1 * edad2));
                }
                else if (choice2.equals(persona3.nombre)){
                    edad2 = persona3.edad;
                    labelresultado2.setText(Integer.toString(edad1 * edad2));
                }
                else {
                    edad2 = persona4.edad;
                    labelresultado2.setText(Integer.toString(edad1 * edad2));
                }
            }
            else if (choice1.equals(persona2.nombre)) {
                edad1 = persona2.edad;
                if (choice2.equals(persona1.nombre)){
                    edad2 = persona1.edad;
                    labelresultado2.setText(Integer.toString(edad1 * edad2));
                }
                else if (choice2.equals(persona2.nombre)){
                    edad2 = persona2.edad;
                    labelresultado2.setText(Integer.toString(edad1 * edad2));
                }
                else if (choice2.equals(persona3.nombre)){
                    edad2 = persona3.edad;
                    labelresultado2.setText(Integer.toString(edad1 * edad2));
                }
                else {
                    edad2 = persona4.edad;
                    labelresultado2.setText(Integer.toString(edad1 * edad2));
                }
            }
            else if (choice1.equals(persona3.nombre)) {
                edad1 = persona3.edad;
                if (choice2.equals(persona1.nombre)){
                    edad2 = persona1.edad;
                    labelresultado2.setText(Integer.toString(edad1 * edad2));
                }
                else if (choice2.equals(persona2.nombre)){
                    edad2 = persona2.edad;
                    labelresultado2.setText(Integer.toString(edad1 * edad2));
                }
                else if (choice2.equals(persona3.nombre)){
                    edad2 = persona3.edad;
                    labelresultado2.setText(Integer.toString(edad1 * edad2));
                }
                else {
                    edad2 = persona4.edad;
                    labelresultado2.setText(Integer.toString(edad1 * edad2));
                }
            }
            else {
                edad1 = persona4.edad;
                if (choice2.equals(persona1.nombre)){
                    edad2 = persona1.edad;
                    labelresultado2.setText(Integer.toString(edad1 * edad2));
                }
                else if (choice2.equals(persona2.nombre)){
                    edad2 = persona2.edad;
                    labelresultado2.setText(Integer.toString(edad1 * edad2));
                }
                else if (choice2.equals(persona3.nombre)){
                    edad2 = persona3.edad;
                    labelresultado2.setText(Integer.toString(edad1 * edad2));
                }
                else {
                    edad2 = persona4.edad;
                    labelresultado2.setText(Integer.toString(edad1 * edad2));
                    
                }
            }
        }
        else {
            labelerror.setText("Elegir personas antes de elegir operacion");
        }
        });
        
        // Layout
        StackPane layout = new StackPane();
        layout.getChildren().addAll(labelresultado, labelnombre,
     labelprovincia, labeledad, labelagregar, labeloperacion, 
     labelpersona1, labelpersona2, entrynombre, entryedad, 
     botonagregarpersona, sumar, restar, multiplicar, dividir, 
     listaprovincia, listapersona1, listapersona2, labelerror, 
     labelresultado2);
        /**
         * Se define el tipo de layout que
         * se utiliza para el escenario y se
         * le añaden los labels, botones y drop
         * down lists. 
         */
        
        // Escenario
        Scene scene = new Scene(layout, 500, 450);
        primaryStage.setScene(scene);
        primaryStage.show();
        /**
         * Se define las dimensiones del escenario
         */
    }
}
