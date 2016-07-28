package com.spaceshooter.game.desktop;

import static com.agos.game.MainGame.*;
import com.agos.game.MainGame;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = TITLE;
		config.width = WIDTH;
		config.height = HEIGHT;
		new LwjglApplication(new MainGame(), config);
	}
}
