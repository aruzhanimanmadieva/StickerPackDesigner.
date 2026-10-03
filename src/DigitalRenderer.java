public class DigitalRenderer implements StickerRenderer {

    @Override
    public void render(String name,String text){
        System.out.println("Digital sticker: " + name);
        System.out.println("Text: " + text);
        System.out.println("Format: PNG for phone");
    }
}
