public class MemeSticker extends Sticker {

    public MemeSticker(StickerRenderer renderer) {
        super(renderer);
    }

    @Override
    public void create() {
        System.out.println("Meme sticker: ");
        renderer.render("Funny Meme","When the code finally works!");
    }
}
