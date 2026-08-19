/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.kennethvelasquez.system.utils;

import javafx.stage.Stage;
import javafx.scene.Scene;
/**
 *
 * @author STEPHRYS
 */
public class SceneManager {
    private static SceneManager instanciaSceneManager;
    private Stage stagePrincipal;
    
    private SceneManager(){}
    
    public static SceneManager getInstanciaSceneManager(){
        if( instanciaSceneManager == null )
            instanciaSceneManager = new SceneManager();
        return instanciaSceneManager;
    }
    /**
     * Este metodo permite recibir un parametro de tipo Scene y
     * es la escena que se mostrará en el Stage
     * @param scene Escena a mostrar en el Stage
     */
    public void changeScene(Scene scene){
        try {
            stagePrincipal.setScene(scene);
            stagePrincipal.sizeToScene();
            stagePrincipal.show();
        } catch (NullPointerException objetoNulo) {
            //Alert
        }
    }

    public Stage getStagePrincipal() {
        return stagePrincipal;
    }

    public void setStagePrincipal(Stage stagePrincipal) {
        this.stagePrincipal = stagePrincipal;
    }
    
}




















