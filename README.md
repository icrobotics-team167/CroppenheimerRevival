File tree

CroppenheimerRevival/
├── 📁 .idea/
│   └── 📁 runConfigurations/
│       ├── 📄 Build_Robot.xml                 # IntelliJ run config for the `build` Gradle task.
│       ├── 📄 Build___Deploy_Robot.xml        # IntelliJ run config for the `deploy` Gradle task.
│       ├── 📄 Build___Run_Simulate_Java.xml   # IntelliJ run config for the `simulateJava` Gradle task.
│       └── 📄 Clean.xml                      # IntelliJ run config for the `clean` Gradle task.
├── 📁 .vscode/
│   ├── 📄 launch.json                  # VS Code settings for debugging Java code, with targets for both desktop simulation and deploying to the roboRIO.
│   └── 📄 settings.json                # VS Code workspace settings, configuring the Java environment and hiding common unneeded files.
├── 📁 .wpilib/
│   └── 📄 wpilib_preferences.json        # WPILib-specific settings, storing the team number (167) and FRC year (2025) for GradleRIO.
├── 📁 gradle/
│   └── 📁 wrapper/
│       ├── 📄 gradle-wrapper.jar        # The Gradle Wrapper executable, ensuring consistent builds for all developers.
│       └── 📄 gradle-wrapper.properties  # Configuration file specifying the Gradle version to use (8.11).
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
├── 📄 .gitattributes                   # Git config file to enforce Unix-style line endings (`eol=lf`) for consistency across operating systems.
├── 📄 .gitignore                     # Lists files and directories (like `build/`, `.gradle/`, and IDE settings) that Git should ignore.
├── 📄 build.gradle                   # The main build script. It uses the **GradleRIO plugin** to manage all project dependencies, tasks, and settings for building, simulating, and deploying the robot code.
├── 📄 gradlew                        # The Gradle Wrapper executable script for macOS and Linux.
├── 📄 gradlew.bat                    # The Gradle Wrapper batch script for Windows.
├── 📄 LICENSE                        # The project's open-source license (MIT License), Copyright (c) 2026 FRC 167.
├── 📄 settings.gradle                # Gradle settings file that configures the plugin repositories, including the local WPILib Maven cache.
└── 📄 WPILib-License.md              # The official license file for the WPILib libraries used in this project.
