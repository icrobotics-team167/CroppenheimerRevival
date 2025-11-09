// Copyright (c) 2026 FRC 167
// https://github.com/icrobotics-team167
//
// Use of this source code is governed by an MIT-style
// license that can be found in the LICENSE file at
// the root directory of this project.

package frc.cotc;

//import static edu.wpi.first.units.Units.*;
//import edu.wpi.first.units.*;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
    public static final class Field {
    public static final double FIELD_LENGTH_METERS = 16.46;
    public static final double FIELD_WIDTH_METERS = 8.21;
  }
  public static final class Driving {
    public static final boolean SLOWMODE_DEFAULT = true;
    public static final double SLOWMODE_MULTIPLIER = 0.2;
    public static final double PRIMARY_DRIVER_EXPONENT = 1.5;
    public static final double SECONDARY_DRIVER_EXPONENT = 1.5;

    public static final class Deadbands {
      public static final double PRIMARY_LEFT_INNER = 0.05;
      public static final double PRIMARY_RIGHT_INNER = 0.05;
      public static final double SECONDARY_LEFT_INNER = 0.05;
      public static final double SECONDARY_RIGHT_INNER = 0.05;
      public static final double PRIMARY_LEFT_OUTER = 0.01;
      public static final double PRIMARY_RIGHT_OUTER = 0.01;
      public static final double SECONDARY_LEFT_OUTER = 0.01;
      public static final double SECONDARY_RIGHT_OUTER = 0.01;
    }
  }
}
