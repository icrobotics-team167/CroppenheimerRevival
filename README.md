File tree
```
CroppenheimerRevival/
├── 📁 .idea/
├── 📁 .vscode/
├── 📁 .wpilib/
├── 📁 gradle/
├── 📁 src/main/
│   ├── 📁 deploy/
│   │   └── 📄 example.txt               # Any files in this directory are copied to the roboRIO's filesystem (`/home/lvuser/deploy`) during deployment.
│   └── 📁 java/frc/cotc/
│       ├── 📁 superstructure/
│       │   ├── 📄 Feeder.java             # Subsystem class for the Feeder mechanism.
│       │   ├── 📄 Intake.java            # Subsystem class for the Intake mechanism.
│       │   ├── 📄 Pivot.java             # Subsystem class for the Pivot mechanism.
│       │   ├── 📄 Shooter.java           # Subsystem class for the Shooter mechanism.
│       │   └── 📄 Superstructure.java      # A "manager" class that coordinates all the other superstructure subsystems.
│       ├── 📁 swerve/
│       │   ├── 📄 Swerve.java            # The main `SubsystemBase` class for the swerve drive.
│       │   ├── 📄 SwerveIO.java          # The **interface** (or base class) for the swerve drive's hardware. This abstraction allows using different hardware (real vs. sim) with the same `Swerve` subsystem.
│       │   └── 📄 SwerveIOSparkMax.java    # A **concrete implementation** of `SwerveIO` for the real robot, using REV SPARK Max controllers.
│       ├── 📄 CommandsLogging.java       # A utility for logging the `CommandScheduler` to AdvantageKit, showing which commands are running, interrupted, or are default commands.
│       ├── 📄 Constants.java             # A central file for robot-wide numerical constants (e.g., field dimensions, controller deadbands) to avoid "magic numbers."
│       ├── 📄 Main.java                  # The **main entry point** for the Java program. Its only job is to start the `Robot` class.
│       └── 📄 Robot.java                 # The **heart of the robot code**. It extends `LoggedRobot` (from AdvantageKit), initializes subsystems, sets up driver controls (`CommandXboxController`), and manages the main robot loop (`robotPeriodic`).
├── 📁 vendordeps/
│   ├── 📄 AdvantageKit.json            # JSON file that tells GradleRIO how to download the **AdvantageKit** logging framework.
│   ├── 📄 maple-sim.json               # Dependency file for the **MapleSim** simulation library.
│   ├── 📄 Phoenix6-frc2025-latest.json  # Dependency file for **CTRE's Phoenix 6** library (for Talon FX, CANcoder, etc.).
│   ├── 📄 photonlib-v2025.3.1.json     # Dependency file for the **PhotonVision** vision library.
│   ├── 📄 REVLib-2025.json             # Dependency file for **REV Robotics'** library (for SPARK Max/Flex, NEO/Vortex).
│   └── 📄 WPILibNewCommands.json       # Dependency file for the core **WPILib Command-Based Framework**.
```
