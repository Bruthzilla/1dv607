package view;

public class SweConsole extends BaseConsole implements IView {  
  public boolean wantsToPlay() {
    return getInputChar() != 'a';
  }
  
  public void DisplayResult(boolean a_win) {
    if (a_win) {
      System.out.println("Yay du vann! ");
    } else {
      System.out.println("�sch du f�rlorade...");
    }
  }
  
  public void DisplayWelcomeMessage() {
    System.out.println("V�lkommen till t�rningsspelet");
  }
  
  public void DisplayInstructions() {
    System.out.println("Truck en tangent f�r att spela eller 'a' f�r att avsluta");
  }
}