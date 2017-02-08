package hfe;


import java.util.logging.Logger;

public class UseSpring {

    UseSpring() {
        SampleController controller = MrSpring.getContext().getBean(SampleController.class);
        Logger.getLogger(UseSpring.class.getName()).info(controller.muffe());
    }

    public static void main(String[] args) {
        UseSpring use = new UseSpring();
    }
}
