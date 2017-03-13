package im.actor.core.viewmodel;

import java.util.ArrayList;

import im.actor.runtime.mvvm.ValueModel;
import im.actor.sdk.camera.CameraView;

/**
 * Created by 98379720172 on 13/03/17.
 */

public class CameraVM {

    private ValueModel<CameraView> cameraViewValueModel;

    public CameraVM() {
        cameraViewValueModel = new ValueModel<>("gallery.photo", new CameraView());
    }


}
