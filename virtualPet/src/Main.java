public class Main {
    public static void main(String[] args) {
        String firstChoice;
        String name;
        char nameConf;
        int secondChoice;
        int sleep;
        int fatigue;
        int energy;
        int hygiene;
        int weight;
        boolean siono = false;

        sleep = (int) (Math.random() * (61 - 40 + 1) + 40);
        fatigue = (int) (Math.random() * (61 - 40 + 1) + 40);
        energy = (int) (Math.random() * (61 - 40 + 1) + 40);
        hygiene = (int) (Math.random() * (61 - 40 + 1) + 40);
        weight = (int) (Math.random() * (61 - 40 + 1) + 40);


        System.out.print("Put a name for your pet: ");
        name = teclat.Teclat.llegirString();
        System.out.print("Are you sure you want to name it " + name + " ? (y or n) ");
        nameConf = teclat.Teclat.llegirChar();
        if (nameConf == 'y' || nameConf == 'Y') {
            System.out.println("Nice choice :)");
        } else if (nameConf == 'n' || nameConf == 'N') {
            System.out.println("Put another name then: ");
            name = teclat.Teclat.llegirString();
            System.out.println("Nice choice :)");

        }
        System.out.println("What do you prefer, a dog or a cat? ");
        firstChoice = teclat.Teclat.llegirString();

        if (firstChoice.equalsIgnoreCase("dog")) {
            System.out.println(" ");
            System.out.println("You choose a dog, nice :)");
            System.out.println(" ");
            System.out.println("Your initial values are: ");
            System.out.println("Sleep: " + sleep + " points");
            System.out.println("Fatigue: " + fatigue + " points");
            System.out.println( "Energy: " + energy + " points");
            System.out.println("Hygiene: " + hygiene + " points");
            System.out.println("Weight: " + weight + " points");

            do {
                if (sleep > 100 || sleep <= 0 || fatigue > 100 || fatigue < 0 || energy > 100 || energy < 0 || hygiene > 100 || hygiene < 0 || weight > 100 || weight < 0)
                {
                    siono = true;
                }
                if(!siono) {
                    System.out.println(" ");
                    System.out.println("What do you want to do now?");
                    System.out.println("1.- Sleep (Decreases sleep in 25 points, decreases fatigue in 15 points and increases energy in 15 points) ");
                    System.out.println("2.- Play (Decreases sleep in 10 points, increases fatigue in 10 points, decreases energy in 10 points, decreases hygiene in 15 points and decreases weight in 10 points)");
                    System.out.println("3.- Eat (Increases sleep in 15 points, increases energy in 10 points, decreases hygiene in 10 points and increases weight in 10 points) ");
                    System.out.println("4.- Shower (Decreases sleep in 15 points and increases hygiene in 20 points) ");
                    System.out.println("0.- Exit application");

                    secondChoice = teclat.Teclat.llegirInt();
                    switch (secondChoice) {
                        case 1 -> {
                            System.out.println(" ");
                            System.out.println("Your dog " + name + " is sleeping...");
                            System.out.println("The sleep decreased 25 points");
                            System.out.println("The fatigue decreased 15 points");
                            System.out.println("The energy increased 15 points");
                            sleep = sleep - 25;
                            fatigue = fatigue - 15;
                            energy = energy + 15;
                            System.out.println("The new values are: ");
                            System.out.println("Sleep: " + sleep + " points");
                            System.out.println("Fatigue: " + fatigue + " points");
                            System.out.println( "Energy: " + energy + " points");
                            System.out.println("Hygiene: " + hygiene + " points");
                            System.out.println("Weight: " + weight + " points");
                        }
                        case 2 -> {
                            System.out.println(" ");
                            System.out.println("Your dog " + name + " is playing...");
                            System.out.println("The sleep decreased 10 points");
                            System.out.println("The fatigue increased 10 points");
                            System.out.println("The energy decreased 10 points");
                            System.out.println("The hygiene decreased 15 points");
                            System.out.println("The weight decreased 10 points");
                            sleep = sleep - 10;
                            fatigue = fatigue + 10;
                            energy = energy - 10;
                            hygiene = hygiene - 15;
                            weight = weight - 10;
                            System.out.println("The new values are: ");
                            System.out.println("Sleep: " + sleep + " points");
                            System.out.println("Fatigue: " + fatigue + " points");
                            System.out.println( "Energy: " + energy + " points");
                            System.out.println("Hygiene: " + hygiene + " points");
                            System.out.println("Weight: " + weight + " points");
                        }
                        case 3 -> {
                            System.out.println(" ");
                            System.out.println("Your dog " + name + " is eating...");
                            System.out.println("The sleep increased 15 points");
                            System.out.println("The energy increased 10 points");
                            System.out.println("The hygiene decreased 10 points");
                            System.out.println("The weight increased 10 points");
                            sleep = sleep + 15;
                            energy = energy + 10;
                            hygiene = hygiene - 10;
                            weight = weight + 10;
                            System.out.println("The new values are: ");
                            System.out.println("Sleep: " + sleep + " points");
                            System.out.println("Fatigue: " + fatigue + " points");
                            System.out.println( "Energy: " + energy + " points");
                            System.out.println("Hygiene: " + hygiene + " points");
                            System.out.println("Weight: " + weight + " points");
                        }

                        case 4 -> {
                            System.out.println(" ");
                            System.out.println("Your dog " + name + " is taking a shower...");
                            System.out.println("The sleep decreased 15 points");
                            System.out.println("The hygiene increased 20 points");
                            sleep = sleep - 15;
                            hygiene = hygiene + 20;
                            System.out.println("The new values are: ");
                            System.out.println("Sleep: " + sleep + " points");
                            System.out.println("Fatigue: " + fatigue + " points");
                            System.out.println( "Energy: " + energy + " points");
                            System.out.println("Hygiene: " + hygiene + " points");
                            System.out.println("Weight: " + weight + " points");
                        }
                        case 0 -> System.exit(0);
                    }
                }
            }
            while ((sleep <= 100 || sleep > 0 || fatigue <= 100 || fatigue > 0 || energy <= 100 || energy > 0 || hygiene <= 100 || hygiene > 0 || weight <= 100 || weight > 0)&&(siono == false));
            System.out.println(" ");
            System.out.println("Your dog is dead :(");

        }
        else if (firstChoice.equalsIgnoreCase("cat")) {
            System.out.println(" ");
            System.out.println("You choose a cat, nice :)");
            System.out.println(" ");
            System.out.println("Your initial values are: ");
            System.out.println("Sleep: " + sleep + " points");
            System.out.println("Fatigue: " + fatigue + " points");
            System.out.println( "Energy: " + energy + " points");
            System.out.println("Hygiene: " + hygiene + " points");
            System.out.println("Weight: " + weight + " points");
            do {
                if (sleep > 100 || sleep <= 0 || fatigue > 100 || fatigue < 0 || energy > 100 || energy < 0 || hygiene > 100 || hygiene < 0 || weight > 100 || weight < 0)
                {
                    siono = true;
                }
                if(!siono) {
                    System.out.println(" ");
                    System.out.println("What do you want to do now?");
                    System.out.println("1.- Sleep (Decreases sleep in 20 points, decreases fatigue in 15 points and increases energy in 15 points) ");
                    System.out.println("2.- Play (Increases sleep in 15 points, increases fatigue in 10 points, decreases energy in 10 points, decreases hygiene in 15 points and decreases weight in 10 points)");
                    System.out.println("3.- Eat (Increases sleep in 10 points, increases energy in 10 points, decreases hygiene in 10 points and increases weight in 10 points) ");
                    System.out.println("4.- Self-cleaning (Increases sleep in 10 points and increases hygiene in 20 points) ");
                    System.out.println("0.- Exit application");
                    secondChoice = teclat.Teclat.llegirInt();
                    switch (secondChoice) {
                        case 1 -> {
                            System.out.println(" ");
                            System.out.println("Your cat " + name + " is sleeping...");
                            System.out.println("The sleep decreased 20 points");
                            System.out.println("The fatigue decreased 15 points");
                            System.out.println("The energy increased 15 points");
                            sleep = sleep - 20;
                            fatigue = fatigue - 15;
                            energy = energy + 15;
                            System.out.println("The new values are: ");
                            System.out.println("Sleep: " + sleep + " points");
                            System.out.println("Fatigue: " + fatigue + " points");
                            System.out.println( "Energy: " + energy + " points");
                            System.out.println("Hygiene: " + hygiene + " points");
                            System.out.println("Weight: " + weight + " points");
                        }
                        case 2 -> {
                            System.out.println(" ");
                            System.out.println("Your cat " + name + " is playing...");
                            System.out.println("The sleep increased 15 points");
                            System.out.println("The fatigue increased 10 points");
                            System.out.println("The energy decreased 10 points");
                            System.out.println("The hygiene decreased 15 points");
                            System.out.println("The weight decreased 10 points");
                            sleep = sleep + 15;
                            fatigue = fatigue + 10;
                            energy = energy - 10;
                            hygiene = hygiene - 15;
                            weight = weight - 10;
                            System.out.println("The new values are: ");
                            System.out.println("Sleep: " + sleep + " points");
                            System.out.println("Fatigue: " + fatigue + " points");
                            System.out.println( "Energy: " + energy + " points");
                            System.out.println("Hygiene: " + hygiene + " points");
                            System.out.println("Weight: " + weight + " points");
                        }
                        case 3 -> {
                            System.out.println(" ");
                            System.out.println("Your cat " + name + " is eating...");
                            System.out.println("The sleep increased 10 points");
                            System.out.println("The energy increased 10 points");
                            System.out.println("The hygiene decreased 10 points");
                            System.out.println("The weight increased 10 points");
                            sleep = sleep + 10;
                            energy = energy + 10;
                            hygiene = hygiene - 10;
                            weight = weight + 10;
                            System.out.println("The new values are: ");
                            System.out.println("Sleep: " + sleep + " points");
                            System.out.println("Fatigue: " + fatigue + " points");
                            System.out.println( "Energy: " + energy + " points");
                            System.out.println("Hygiene: " + hygiene + " points");
                            System.out.println("Weight: " + weight + " points");
                        }

                        case 4 -> {
                            System.out.println(" ");
                            System.out.println("Your cat " + name + " is self-cleaning...");
                            System.out.println("The sleep increased 10 points");
                            System.out.println("The hygiene increased 20 points");
                            sleep = sleep + 15;
                            hygiene = hygiene + 20;
                            System.out.println("The new values are: ");
                            System.out.println("Sleep: " + sleep + " points");
                            System.out.println("Fatigue: " + fatigue + " points");
                            System.out.println( "Energy: " + energy + " points");
                            System.out.println("Hygiene: " + hygiene + " points");
                            System.out.println("Weight: " + weight + " points");
                        }
                        case 0 -> System.exit(0);
                    }
                }
            } while ((sleep <= 100 || sleep > 0 || fatigue <= 100 || fatigue > 0 || energy <= 100 || energy > 0 || hygiene <= 100 || hygiene > 0 || weight <= 100 || weight > 0)&&(siono == false));
            System.out.println(" ");
            System.out.println("Your cat is dead :(");
            }
        }
    }