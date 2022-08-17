package ufscar.es2;

import ufscar.es2.objects.Point;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;

class PointTest {

  Point p1, p2;

  @BeforeEach
  void initializePoints() {
    p1 = new Point();
    p2 = new Point();
  }

  @Nested
  @DisplayName("Testes com pontos que possuem dados")
  class pointsWithData {

    @BeforeEach
    void setDataPoints() {
      p1.setPoint(0, 0);
      p2.setPoint(0, 5);
    }

    @Test
    void distanceBetweenPoints() {
      assertEquals(5, p1.distance(p2), 0f);
    }

    @Test
    void distanceSamePoint() {
      assertEquals(0, p1.distance(p1), 0f);
    }
  }

  // Do JUnit 4 para o 5 temos a opção de assertThrows, que podemos esperar
  // determinada exceção.
  @Test
  void testNull() {
    Point p3 = null;
    assertThrows(NullPointerException.class, () -> {
      p3.distance(p3);
    });
  }

  @Test
  void testAbc() {
    assertThrows(NullPointerException.class, p1::abc);
  }

  // @Test(expected= NullPointerException.class)
  // void testNull() {
  // Point p3 = null;
  // try {
  // assertEquals(0, p1.distance(p3), 0f);
  // }
  // catch(NullPointerException e) {
  // throw e;
  // }
  // fail("should not get here...");
  // }

}// fim da classe
