/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VisiteInterfaces;

import java.util.List;
import javafx.collections.ObservableList;

/**
 *
 * @author USER
 */
public interface IService<T> {
    public void ajouter(T t);
    public void supprimer(T t);
    public void modifier(T t);
   public ObservableList<T>  afficher();
   
    
}
