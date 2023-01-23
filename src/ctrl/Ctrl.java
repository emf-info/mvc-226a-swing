package ctrl;

import ihm.IIhmCtrl;
import wrk.IWrkCtrl;

public class Ctrl implements ICtrlIhm, ICtrlWrk {

    public Ctrl() {
        refWrk = null;
        refIhm = null;
    }

    public void start() {
        refIhm.start();
        int resultat = refWrk.calcule( 10, 20 );
        refIhm.affiche( "10 + 20 = " + resultat );
    }

    public IIhmCtrl getRefIhm() {
        return refIhm;
    }

    public void setRefIhm( IIhmCtrl refIhm ) {
        this.refIhm = refIhm;
    }

    public IWrkCtrl getRefWrk() {
        return refWrk;
    }

    public void setRefWrk( IWrkCtrl refWrk ) {
        this.refWrk = refWrk;
    }

    private IIhmCtrl refIhm;
    private IWrkCtrl refWrk;

}
