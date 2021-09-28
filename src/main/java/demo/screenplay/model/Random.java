package demo.screenplay.model;

public class Random {
    public static User user() {
        long unique = System.currentTimeMillis();
        User random = new User();
        random.setFirstname("Fi" + unique);
        random.setLastname("La" + unique);
        random.setEmail("wmqa+" + unique + "@gmail.com");
        random.setPassword("SpongeB0b!");
        random.setEmailMeNews(false);
        return random;
    }
}
