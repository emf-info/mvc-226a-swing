package wrk;

import ctrl.ICtrlWrk;

public class Wrk implements IWrkCtrl {

    public Wrk() {
        refCtrl = null;
    }

    @Override
    public int calcule( int a, int b ) {
        return a + b;
    }

    public ICtrlWrk getRefCtrl() {
        return refCtrl;
    }

    public void setRefCtrl( ICtrlWrk refCtrl ) {
        this.refCtrl = refCtrl;
    }

    private ICtrlWrk refCtrl;
}
