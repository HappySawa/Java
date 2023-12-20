package PRAC22.src;
public class Main {
    public static void main(String[] args) {
    	
    	
        ChairFactory victorianChairFactory = new VictorianChairFactory();
        ChairFactory multifunctionalChairFactory = new MultifunctionalChairFactory();
        ChairFactory magicChairFactory = new MagicChairFactory();

        IChair victorianChair = victorianChairFactory.createChair();
        IChair multifunctionalChair = multifunctionalChairFactory.createChair();
        IChair magicChair = magicChairFactory.createChair();

        Client client = new Client();

        client.Sit(victorianChair);
        client.Sit(multifunctionalChair);
        client.Sit(magicChair);

        ICreateDocument textDocumentFactory = new CreateTextDocument();
        EditorWindow editorWindow = new EditorWindow(textDocumentFactory);

        editorWindow.createNewDocument();

        editorWindow.openDocument();

        editorWindow.saveDocument();
    }
}