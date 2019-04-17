import controller.Controller;
import model.GameRoom;
import view.View;

public class Main {
    public static void main(String[] args) {
        GameRoom gameRoom = new GameRoom();
        View view = new View();
        Controller controller = new Controller(gameRoom, view);
        controller.run();
    }
}
