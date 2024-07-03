// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.button.CommandPS5Controller;
import frc.robot.Commands.IntakeCommand;
import frc.robot.Subsystems.IntakeSubsystem;

public class RobotContainer {
  public IntakeSubsystem intake = new IntakeSubsystem();
  public CommandPS5Controller base = new CommandPS5Controller(0);

  public RobotContainer() {
    configureBindings();
  }

  private void configureBindings() {
    base.R2().whileTrue(new IntakeCommand(intake));
  }

  public Command getAutonomousCommand() {
    return Commands.print("No autonomous command configured");
  }
}
