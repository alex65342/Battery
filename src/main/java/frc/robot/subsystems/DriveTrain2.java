// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveTrain2 extends SubsystemBase {
  private final TalonFX frontRightMoveMotor;
  private final TalonFX frontRightTurnMotor;
  private final TalonFX frontLeftMoveMotor;
  private final TalonFX frontLeftTurnMotor;
  private final TalonFX backRightMoveMotor;
  private final TalonFX backRightTurnMotor;
  private final TalonFX backLeftMoveMotor;
  private final TalonFX backLeftTurnMotor;
  

  /** Creates a new DriveTrain2. */
  public DriveTrain2() {
    frontRightMoveMotor = new TalonFX(2);
    frontRightTurnMotor = new TalonFX(1);
    frontLeftMoveMotor = new TalonFX(4);
    frontLeftTurnMotor = new TalonFX(3);
    backRightMoveMotor = new TalonFX(8);
    backRightTurnMotor = new TalonFX(7);
    backLeftMoveMotor = new TalonFX(6);
    backLeftTurnMotor = new TalonFX(5);
    frontRightTurnMotor.setNeutralMode(NeutralMode.Brake);
    backRightTurnMotor.setNeutralMode(NeutralMode.Brake);
    frontLeftTurnMotor.setNeutralMode(NeutralMode.Brake);
    backLeftTurnMotor.setNeutralMode(NeutralMode.Brake);
    

  }
  public void setLeftSpeed(double speed){
    frontLeftMoveMotor.set(ControlMode.PercentOutput, speed);
    backLeftMoveMotor.set(ControlMode.PercentOutput, speed);
    
  }
  public void setRightSpeed(double speed){
    frontRightMoveMotor.set(ControlMode.PercentOutput, speed);
    backRightMoveMotor.set(ControlMode.PercentOutput, speed);
    
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
