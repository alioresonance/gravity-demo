package demo.pageobjects.model;

public class Random {
    public static User user() {
        long unique = System.currentTimeMillis();
        User random = new User();
        random.setFirstname("fi" + unique);
        random.setLastname("la" + unique);
        random.setEmail("wmqa+" + unique + "@gmail.com");
        random.setPassword("SpongeB0b1!");
        random.setEmailMeNews(false);
        return random;
    }
}
