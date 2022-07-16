// EncapsulationTutorial

class DVD1 {
    private String movieName;
    private int price;
    int dvdSize;

    public int getPrice() {
        return price;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String mName, int passcode) {
        if(passcode == 12346) {
            movieName = mName;
        }
    }

    public void setPrice(int p, int passcode) {
        if(passcode == 12346) {
            price = p;
        }
    }
}

public class DVD {
    public static void main(String[] args) {
        DVD1 got = new DVD1();
        got.setMovieName("Game of Thrones", 12346);
        got.setPrice(500, 12346);
        got.dvdSize = 8; //8GB

        DVD1 ironMan = new DVD1();
        ironMan.setMovieName("Iron man", 12346);
        ironMan.setPrice(600, 12346);
        ironMan.dvdSize = 16;

        //user is doing below
        got.setPrice(10, 987654);
        ironMan.setMovieName("Flop Movie", 987654);
    }
}