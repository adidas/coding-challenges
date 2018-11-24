package com.adidas;

public class AdidasAsciiLogo {
  public String createAdidasAsciiLogo(int width) throws Exception {
    if (width < 2) {
      throw new Exception("Error, minimum width is 2.");
    }

    StringBuilder logo = new StringBuilder();
    int height = (int) Math.round(Math.sqrt(width));

    for (int i = height - 1; i >= 0; i--) {
      for (int j = 1; j <= 2 * width; j++)
        logo.append(" ");

      for (int j = 1; j < height - i; j++)
        logo.append(" ");
      for (int j = 0; j < width; j++)
        logo.append("@");

      logo.append("\n");
    }

    for (int i = height - 1; i >= 0; i--) {
      for (int j = 0; j < width; j++)
        logo.append(" ");

      for (int j = 1; j < height - i; j++)
        logo.append(" ");
      for (int j = 0; j < width; j++)
        logo.append("@");

      for (int j = 0; j < height; j++)
        logo.append(" ");
      for (int j = 0; j < width; j++)
        logo.append("@");

      logo.append("\n");
    }

    for (int i = height - 1; i >= 0; i--) {
      for (int j = 1; j < height - i; j++)
        logo.append(" ");
      for (int j = 0; j < width; j++)
        logo.append("@");

      for (int j = 0; j < height; j++)
        logo.append(" ");
      for (int j = 0; j < width; j++)
        logo.append("@");

      for (int j = 0; j < height; j++)
        logo.append(" ");
      for (int j = 0; j < width; j++)
        logo.append("@");

      logo.append("\n");
    }

    return logo.toString();
  }
}
