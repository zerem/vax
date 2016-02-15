package cz.req.ax.builders;

import com.vaadin.ui.CheckBox;

/**
 * @author <a href="mailto:jan.pikl@marbes.cz">Jan Pikl</a>
 *         Date: 7.2.2016
 */
public class CheckBoxBuilder extends FieldBuilder<Boolean, CheckBox, CheckBoxBuilder> {

    public CheckBoxBuilder() {
        super(new CheckBox(), true);
    }

    public CheckBoxBuilder(CheckBox target, boolean useDefaults) {
        super(target, useDefaults);
    }

    public CheckBoxBuilder checked() {
        return value(true);
    }

    public CheckBoxBuilder unchecked() {
        return value(false);
    }

}