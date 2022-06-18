package EOorg.EOeolang.EOmath;

import org.eolang.AtComposite;
import org.eolang.Data;
import org.eolang.Param;
import org.eolang.PhDefault;
import org.eolang.Phi;
import org.eolang.XmirObject;

/**
 * Cos.
 * @since 0.0.1
 */
@XmirObject(oname = "angle.cos")
public final class EOangle$EOcos extends PhDefault {

    public EOangle$EOcos(final Phi sigma) {
        super(sigma);
        this.add("φ", new AtComposite(this, rho -> new Data.ToPhi(
            Math.cos(new Param(rho).strong(Double.class))
        )));
    }
}
