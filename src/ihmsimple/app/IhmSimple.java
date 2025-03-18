package ihmsimple.app;

import java.lang.ModuleLayer.Controller;

import ihmsimple.services.ServiceDevine;

public class IhmSimple {

    /**
     * Méthode principale de l'application qui instancie les objets MVC et les relie
     * entre eux.
     * Voir le diagramme de séquence pour l'implémentation e cette méthode.
     * 
     * @param args arguments de la ligne de commande
     */
    public static void main(String[] args) {
        Controller refCtrl = new Controller();
        ServiceDevine refServiceDevine = new ServiceDevine(refCtrl);
    }

}
