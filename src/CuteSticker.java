public class CuteSticker extends Sticker {

    public CuteSticker(StickerRenderer renderer) {
        super(renderer);
    }

    @Override
    public void create() {
        System.out.println("Cute sticker: ");
        renderer.render("Cute Cat","Have a nice day!");
    }
}
