package deep.dive.edu;

public class ComplementaryDNA {
  public String complement(String input) {
    input = input.toUpperCase();
    StringBuilder str = new StringBuilder();
    for (int i = 0; i < input.length(); i++) {
      char c = input.charAt(i);
      switch (c) {
        case 'A':
          str.append('T');
          break;
        case 'T':
          str.append('A');
          break;
        case 'G':
        str.append('C');
        break;
        case 'C':
          str.append('G');
          break;
      }
    }
    return str.toString();
  }
  
}
