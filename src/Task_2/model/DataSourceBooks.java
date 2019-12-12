package Task_2.model;


import Task_2.model.entity.Book;

public class DataSourceBooks {

    public static Book[] getArray() {
        return new Book[]{
                (new Book("Believe", "Eric Berne", "Wiley", 1990, 229, 241.40)),
                (new Book("Owning Your Own Shadow", "Robert Johnson", "Wiley", 2012, 119, 500)),
                (new Book("Man’s Search for Meaning", "Viktor E. Frankl", "Wiley", 1996, 353, 240)),
                (new Book("Games People", "Eric Berne", "Pearson", 2002, 200, 320.50)),
                (new Book("He", "Robert Johnson", "Pearson", 2010, 140, 500)),
                (new Book("Mature Masculine", "Douglas Gillette", "ThomsonReuters", 1978, 894, 600.60)),
                (new Book("Start Where You Are", "Eric Berne", "Wiley", 1995, 521, 402.23)),
                (new Book("Self-Therapy", "Jay Earley", "ThomsonReuters", 2016, 120, 599)),
                (new Book("The Wisdom", "Russ Hudson", "Wiley", 1952, 1002, 800)),
                (new Book("When Things Fall Apart", "Pema Chodren", "ThomsonReuters", 1996, 700, 400.12)),
                (new Book("Sex in human loving", "Eric Berne", "Wiley", 1970, 333, 200)),
                (new Book("Personality", "Eric Berne", "Pearson", 2003, 600, 99.50)),
                (new Book("She", "Robert Johnson", "ThomsonReuters", 2008, 160, 450))
        };
    }
}

