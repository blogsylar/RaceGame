package ru.macdroid.racegame;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Screen;
import ru.macdroid.racegame.view.GameScreen;

public class Main extends Game {

	private Screen gameScreen;

	@Override
	public void create() {

		gameScreen = new GameScreen(); // создаю объект класса
		setScreen(gameScreen); // назначаю экран

	}
}
