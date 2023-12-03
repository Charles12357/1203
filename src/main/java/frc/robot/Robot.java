// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

/**
 * The VM is configured to automatically run this class, and to call the functions corresponding to
 * each mode, as described in the TimedRobot documentation. If you change the name of this class or
 * the package after creating this project, you must also update the build.gradle file in the
 * project.
 */
public class Robot extends TimedRobot {
  //創物件
  private final WPI_TalonSRX motor = new WPI_TalonSRX(5);
  private final XboxController xboxController = new XboxController(1);

  /** This function is called periodically during autonomous. */
  @Override
  public void robotInit() {
    //設定初始
    motor.configFactoryDefault();
    //初始化物件
    motor.setInverted(true);
    //設定反轉
  }

  @Override
  public void teleopPeriodic() {
    //手動控制
    //20毫秒
    motor.set(ControlMode.PercentOutput, xboxController.getLeftY());
  }
}