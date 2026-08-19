/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.kennethvelasquez.system.utils;
import java.io.IOException;
import java.io.UncheckedIOException;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;
import java.net.URL;
import javafx.fxml.JavaFXBuilderFactory;
import org.kennethvelasquez.system.ClasePrincipal;
public class ViewFactory {
    private final String PATH_VIEWS="/org/kennethvelasquez/system/view/";
    
    public Scene loadFileFXML(String nameFXML, int width, int height){
        String pathOfFile= PATH_VIEWS + nameFXML;
        try {
            //FXMLLoader
            FXMLLoader loaderFXML = new FXMLLoader();
            //Leer la URL del archivo
            //Llamar al archiov main
            URL urlFile = ClasePrincipal.class.getResource(pathOfFile);
            loaderFXML.setBuilderFactory( new JavaFXBuilderFactory() );
            loaderFXML.setLocation(urlFile);
            
            return new Scene(loaderFXML.load(),width, height);
            
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }
    
    
    public void loadScene(String nameFXML){
        Scene scene=null;
        try {
            switch (nameFXML) {
                case "login"-> {
                    SceneManager.getInstanciaSceneManager().getStagePrincipal().setTitle("LOGIN DE USUARIOS");
                    SceneManager.getInstanciaSceneManager().getStagePrincipal().setResizable(false);
                    scene = loadFileFXML("LoginView.fxml",400,500);
                }
                default-> scene = loadFileFXML("LoginView.fxml",300,400) ;
            }
            SceneManager.getInstanciaSceneManager().changeScene(scene);
        } catch (NullPointerException objetoNulo) {
            //Alert
            System.out.println("error load scene");
        }
    }
    
    public void viewLogin(){
        loadScene("login");
    }
    public void viewUsers(){
        loadScene("users");
    }
}
