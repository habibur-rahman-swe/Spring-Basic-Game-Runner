package com.habib.learn_spring_framework.gamerunner;

import com.habib.learn_spring_framework.gamerunner.game.GameRunner;
import com.habib.learn_spring_framework.gamerunner.game.MarioGame;

public class AppGammingBasicJava {
	public static void main(String[] args) {
		var marioGame = new MarioGame();
		var gameRunner = new GameRunner(marioGame);
		
		gameRunner.run();
	}
}
