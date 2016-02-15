package cz.req.ax.builders;

import com.vaadin.ui.Upload;

/**
 * @author <a href="mailto:jan.pikl@marbes.cz">Jan Pikl</a>
 *         Date: 15.2.2016
 */
public class UploadBuilder extends ComponentBuilder<Upload, UploadBuilder> {

    public UploadBuilder() {
        super(new Upload(), true);
    }

    public UploadBuilder(Upload target, boolean useDefaults) {
        super(target, useDefaults);
    }

    @Override
    protected void applyDefaults() {
        super.applyDefaults();
        caption("Nahrát soubor");
    }

    @Override
    public UploadBuilder caption(String caption) {
        target.setButtonCaption(caption);
        return this;
    }

    public UploadBuilder receiver(Upload.Receiver receiver) {
        target.setReceiver(receiver);
        return this;
    }

    public UploadBuilder onStart(Upload.StartedListener listener) {
        target.addStartedListener(listener);
        return this;
    }

    public UploadBuilder onProgress(Upload.ProgressListener listener) {
        target.addProgressListener(listener);
        return this;
    }

    public UploadBuilder onSuccess(Upload.SucceededListener listener) {
        target.addSucceededListener(listener);
        return this;
    }

    public UploadBuilder onFailure(Upload.FailedListener listener) {
        target.addFailedListener(listener);
        return this;
    }

    public UploadBuilder onFinish(Upload.FinishedListener listener) {
        target.addFinishedListener(listener);
        return this;
    }

    public UploadBuilder onChange(Upload.ChangeListener listener) {
        target.addChangeListener(listener);
        return this;
    }

}
