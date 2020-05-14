package serenitylabs.tutorials.vetclinic.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import org.junit.Test;
import org.junit.runner.RunWith;
import serenitylabs.tutorials.vetclinic.model.Pet;
import serenitylabs.tutorials.vetclinic.model.PetHotel;
import serenitylabs.tutorials.vetclinic.screenplay.tasks.CheckOut;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.not;

@RunWith(SerenityRunner.class)
public class WhenCheckingOutFromThePetHotel {

    @Test
    public void petra_checks_her_cat_out_of_the_hotel(){
        // GIVEN

        Actor petra = Actor.named("Petra the pet owner");
        Pet ginger = Pet.cat().named("Ginger");
        PetHotel petHotel = PetHotel.called("Pet Hotel California");

        //petra.wasAbleTo(CheckOut.aPet(ginger).into(petHotel));

        //WHEN
        petra.wasAbleTo(
                CheckOut.aPet(ginger).from(petHotel)
        );

        //THEN
        assertThat(petHotel.getPets(), not(hasItem(ginger)));
    }
}
