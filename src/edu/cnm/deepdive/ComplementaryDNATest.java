package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ComplementaryDNATest {

  @Test
  void testComplement() {
    ComplementaryDNA dna = new ComplementaryDNA();
    assertEquals("TATACGCG", dna.complement("ATATGCGC"));
    assertEquals("CGGAAATTTTAAAGGC", dna.complement("GCCTTTAAAATTTCCG"));
    assertEquals("TAGCTAGC", dna.complement("ATCGATCG"));
    assertEquals("GGGGCCCAAT", dna.complement("CCCCGGGTTA"));
    
    assertNotEquals("TATACGCG", dna.complement("TATACGCG"));
  }

}
