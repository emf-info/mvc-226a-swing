package app;

import ctrl.Ctrl;
import ihm.Ihm;
import wrk.Wrk;

/**
 * Modèle d'application "MVC" réalisé avec interfaces avec ihm Swing.
 *
 * @author EMF-Informatique
 */
public class Application {

    public static void main( String[] args ) {

        Ctrl ctrl = new Ctrl();
        Wrk wrk = new Wrk();
        Ihm ihm = new Ihm();

        ctrl.setRefIhm( ihm );
        ctrl.setRefWrk( wrk );
        ihm.setRefCtrl( ctrl );
        wrk.setRefCtrl( ctrl );

        ctrl.start();
    }

}
