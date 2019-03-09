public class Film {
    private String name;
    private String director;
    private String genre;
    private double price;
    private double IMDB;
    private int year;
    private int length;
    private boolean availability;
    private int days;

    public Film(String name, String director, String genre, double price, double IMDB, int year, int hours,int minutes) {
        this.name = name;
        this.director = director;
        this.genre = genre;
        this.price = price;
        this.IMDB = IMDB;
        this.year = year;
        this.length = hours*60;
        this.length += minutes;
        this.availability = true;
    }

    public void rent(int days){
        this.availability = false;
        this.days = days;
    }

    public void turnIn(int days){
        this.availability = true;
        if(days > this.days){
            Shop.income(this.price * this.days + (days - this.days) * this.price * 2);
        }else Shop.income( this.price * this.days);
    }

    public boolean isAvailable() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getIMDB() {
        return IMDB;
    }

    public void setIMDB(double IMDB) {
        this.IMDB = IMDB;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getLength() {
        return length/60 + " Hours " + length%60 + " Minutes ";
    }

    public void setLength(int hours,int minutes) {
        this.length = hours*60;
        this.length += minutes;
    }

    @Override
    public String toString() {
        return "Film{" +
                "name='" + name + '\'' +
                ", director='" + director + '\'' +
                ", genre='" + genre + '\'' +
                ", price=" + price +
                ", IMDB=" + IMDB + "/10" +
                ", year=" + year +
                ", length=" + length/60 + " hours " + length%60 + " minutes " +
                '}';
    }
}
