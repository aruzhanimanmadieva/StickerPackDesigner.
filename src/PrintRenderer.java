public class PrintRenderer implements StickerRenderer {

    @Override
    public void render(String name, String text) {
        System.out.println("Printable sticker: " + name);
        System.out.println("Text: " + text);
        System.out.println("Format: high-quality print");
    }
}
