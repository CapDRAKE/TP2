public class App {

  // calcule le prix payé par l'utilisateur dans le restaurant, en fonction de
  // type de
  // repas qu'il prend (assiette ou sandwich), de la taille de la boisson (petit,
  // moyen, grand), du dessert et
  // de son type (normal ou special) et si il prend un café ou pas (yes ou no).
  // les prix sont fixes pour chaque type de chose mais des réductions peuvent
  // s'appliquer
  // si cela rentre dans une formule!
  public int Compute(String type, String name, String beverage, String size, String dessert, String dsize,
      String coffee) {
    // prix total à payer pour le client
    int total = 0;
    int assiettePrix = 15;
    int sandwichPrix = 10;

    // le type ne peut être vide car le client doit déclarer au moins un repas
    if (type == null || name == null || type.isEmpty() || name.isEmpty())
      return -1;

    if (type.equals("assiette")) {
      total += assiettePrix;
    } else {
      total += sandwichPrix;
    }

    if (size.equals("petit")) {
      total += 2;
      if (dsize.equals("normal")) {
        total += 2;
      } else {
        total += 4;
      }
    } else if (size.equals("moyen")) {
      total += 3;
      if (dsize.equals("normal")) {
        if (type.equals("assiette")) {
          total = 18;
        } else {
          total = 13;
        }
      } else {
        total += 4;
      }
    } else if (size.equals("grand")) {
      total += 4;
      if (dsize.equals("normal")) {
        total += 2;
      } else {
        System.out.print("Prix Formule Max appliquée ");
        if (type.equals("assiette")) {
          total = 21;
        } else {
          total = 16;
        }
      }
    }
    if (type.equals("assiette") && size.equals("moyen") && dsize.equals("normal") && coffee.equals("yes")) {
      System.out.print(" avec café offert!");
    } else {
      // Assume coffee costs 1 unit, adding to the total only if coffee is not
      // included
      if (!coffee.equals("yes")) {
        total += 1;
      }
    }
    return total;
  }

}