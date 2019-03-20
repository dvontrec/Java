// Creates a movie class
class Movie {
  private String name;

  // public constructor
  public Movie(String name) {
    this.name = name;
  }

  // return the plot is not set on base movie
  public String plot() {
    return "No plot here";
  }

  public String getName() {
    return this.name;
  }
}

// Jaws class extends the Movie class
class Jaws extends Movie {
  // constructor calls the partent constructor setting the name to jaws
  public Jaws() {
    super("Jaws");
  }

  // plot method
  public String plot() {
    return "A shark eats lots of people";
  }
}

class IndependenceDay extends Movie {
  public IndependenceDay() {
    super("Independence Day");
  }

  // plot method overrides the parent plot method
  @Override
  public String plot() {
    return "Aliens attempt to take over earth";
  }
}

class Forgetable extends Movie {
  public Forgetable() {
    super("Forgetable");
  }
  // does not override plot method
}

public class Main {
  public static void main(String[] args) {
    for (int i = 1; i < 11; i++) {
      Movie movie = randomMovie();
      System.out.println(movie.getName());
      System.out.println(movie.plot());
      System.out.println();
    }
  }

  public static Movie randomMovie() {
    // gets a random number cast to an int between 0 and 2 then adds one (1-3)
    int randomNumber = (int) (Math.random() * 3) + 1;
    // return a movie type depending on the random number
    switch (randomNumber) {
    case 1:
      // does not need a break because returns on case
      return new Jaws();
    case 2:
      return new IndependenceDay();
    case 3:
      return new Forgetable();
    default:
      return null;
    }
  }
}