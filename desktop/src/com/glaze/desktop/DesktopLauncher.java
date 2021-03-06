package com.glaze.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.glaze.App;
import com.glaze.Inf;
import com.glaze.Renderer;

public class DesktopLauncher {

    public static void main(String[] args) {
        LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
        cfg.title = Inf.APP_NAME;
        cfg.width = Renderer.windowWidth;
        cfg.height = Renderer.windowHeight;
        cfg.resizable = true;
        new LwjglApplication(new App(), cfg);
    }
}