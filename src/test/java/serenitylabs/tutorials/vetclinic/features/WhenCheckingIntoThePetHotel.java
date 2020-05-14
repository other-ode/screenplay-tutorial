package serenitylabs.tutorials.vetclinic.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import org.junit.Test;
import org.junit.runner.RunWith;
import serenitylabs.tutorials.vetclinic.model.Pet;
import serenitylabs.tutorials.vetclinic.model.PetHotel;
import serenitylabs.tutorials.vetclinic.screenplay.tasks.CheckIn;
import serenitylabs.tutorials.vetclinic.screenplay.tasks.CheckOut;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.not;

@RunWith(SerenityRunner.class)
public class WhenCheckingIntoThePetHotel {

    @Test
    public void petra_books_her_cat_into_the_hotel(){

        //GIVEN

        Actor petra = Actor.named("Petra the pet owner");
        Pet ginger = Pet.cat().named("Ginger");
        PetHotel petHotel = PetHotel.called("Pet Hotel");
        //PetHotel petHotel = new PetHotel("Pet Hotel");

        //WHEN
        petra.attemptsTo(
                CheckIn.aPet(ginger).into(petHotel)
                //new CheckIn(ginger, petHotel)
        );
       // petra.booksHerPet(ginger, petHotel);

        //THEN
        assertThat(petHotel.getPets(),hasItem(ginger));
    }

}
