package Client;

import sudokuService.*;


public class SudokuModel {
	private SudokuService service;


	public SudokuModel(){
		service = new SudokuService();
	}

	public void createNewGame(){
		service.createNewGame("");
    }

    public void reloadGame(){
    	service.relodeGame();
	}

    public void solveGame(){
    	service.solveGame();
	}

    public void checkGame(){
    	service.checkGame();
    }

    public void saveGame(){
    	//service.saveGame("");
    }

    public  void loadGame(){
    	service.loadGame("");
    }

    public void undoGame(){
    	service.undo();
    }

}