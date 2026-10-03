public class Main {

    public static void main (String[] args) {

        Sticker cuteSticker = new CuteSticker(new DigitalRenderer());

        cuteSticker.create();

        cuteSticker.setRenderer(new PrintRenderer());

        cuteSticker.create();

        Sticker memeSticker = new MemeSticker(new DigitalRenderer());

        memeSticker.create();

    }
}