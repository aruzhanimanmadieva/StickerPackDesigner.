public abstract class Sticker {

    protected StickerRenderer renderer;

    public Sticker(StickerRenderer renderer) {
        this.renderer = renderer;
    }

    public void setRenderer(StickerRenderer renderer) {
        this.renderer = renderer;
    }

    public abstract void create();
}
