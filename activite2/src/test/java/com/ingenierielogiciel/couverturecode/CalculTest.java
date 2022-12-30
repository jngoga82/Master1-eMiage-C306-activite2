package com.ingenierielogiciel.couverturecode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

/**  Tests unitaire pour la classe Calcul. **/
public class CalculTest {

  @Test
  public void testConstructeur() {
    try {
      new Calcul();
      fail("Reaction annormale, une exception a ete ignoree.");
    } catch (UnsupportedOperationException e) {
      System.out.println("C'est normal de se retrouver ici car : \"" + e.getMessage() + "\"");
    }
  }

  @Test
  public void testSomme() {
    assertEquals(5,Calcul.somme(2,3));
  }

  @Test
  public void testDivision() {
    assertEquals(4,Calcul.division(8,2));
  }
  
  @Test
  public void testDivisionFail() {
    try {
      Calcul.division(8, 0);
      fail("Reaction annormale, une exception a ete ignoree.");
    } catch (IllegalArgumentException e) {
      System.out.println("C'est normal de se retrouver ici car : \"" + e.getMessage() + "\"");
    }
  }

  @Test
  public void testNoteBornee() {
    assertEquals(20.0, Calcul.noteBornee(25.0,0.0,20.0));
  }
  
}
