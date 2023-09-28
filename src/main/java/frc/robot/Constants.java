package frc.robot;

import edu.wpi.first.math.geometry.Translation2d;
import edu.wpi.first.math.kinematics.SwerveDriveKinematics;
import edu.wpi.first.math.trajectory.TrapezoidProfile;
import edu.wpi.first.math.util.Units;
//import edu.wpi.first.wpilibj.geometry.Translation2d;
//import edu.wpi.first.wpilibj.kinematics.SwerveDriveKinematics;
//import edu.wpi.first.wpilibj.trajectory.TrapezoidProfile;
//import edu.wpi.first.wpilibj.util.Units;

public final class Constants {

    public static final class ModuleConstants {
        public static final double kWheelDiameterMeters = Units.inchesToMeters(4);
        // On the previous code 1/5.8462
        // On the previous code 6.75
        public static final double kDriveMotorGearRatio = 1 / 6.75;
        // On the previous code said 1/18
        public static final double kTurningMotorGearRatio = 1 / 12.8;
        public static final double kDriveEncoderRot2Meter = kDriveMotorGearRatio * Math.PI * kWheelDiameterMeters;
        public static final double kTurningEncoderRot2Rad = kTurningMotorGearRatio * 2 * Math.PI;
        public static final double kDriveEncoderRPM2MeterPerSec = kDriveEncoderRot2Meter / 60;
        public static final double kTurningEncoderRPM2RadPerSec = kTurningEncoderRot2Rad / 60;
        public static final double kPTurning = 0.5;
    }

    public static final class DriveConstants {

        public static final double kTrackWidth = Units.inchesToMeters(12.5);
        // Distance between right and left wheels
        public static final double kWheelBase = Units.inchesToMeters(12.5);
        // Distance between front and back wheels
       // public static final SwerveDriveKinematics kDriveKinematics = new SwerveDriveKinematics();
     //  public static final SwerveDriveKinematics kDriveKinematics = new SwerveDriveKinematics(
        //new Translation2d(kWheelBase / 2, kTrackWidth / 2), //fl
       // new Translation2d(-kWheelBase / 2, kTrackWidth / 2), //fr
       // new Translation2d(kWheelBase / 2, -kTrackWidth / 2), //bl
      //  new Translation2d(-kWheelBase / 2, -kTrackWidth / 2)); //br
   //  public final SwerveDriveKinematics kDrivekinematics = new SwerveDriveKinematics(
      //  m_frontLeftLocation, m_frontRightLocation, m_backLeftLocation, m_backRightLocation
     // );
            
                static Translation2d m_frontLeftLocation = new Translation2d(0.381, 0.381);
                static Translation2d m_frontRightLocation = new Translation2d(0.381, -0.381);
                static Translation2d m_backLeftLocation = new Translation2d(-0.381, 0.381);
                static  Translation2d m_backRightLocation = new Translation2d(-0.381, -0.381);

        public final static SwerveDriveKinematics kDrivekinematics = new SwerveDriveKinematics(
                    m_frontLeftLocation, m_frontRightLocation, m_backLeftLocation, m_backRightLocation
                  );

// Creating my kinematics object using the module locations
//public  static final  
                //public static SwerveDriveKinematics kDriveKinematics = new SwerveDriveKinematics( m_frontLeftLocation, m_frontRightLocation, m_backLeftLocation, m_backRightLocation);
        


        public static final int kFrontLeftDriveMotorPort = 6;
        public static final int kBackLeftDriveMotorPort = 8;
        public static final int kFrontRightDriveMotorPort = 4;
        public static final int kBackRightDriveMotorPort = 2;

        public static final int kFrontLeftTurningMotorPort = 5;
        public static final int kBackLeftTurningMotorPort = 7;
        public static final int kFrontRightTurningMotorPort = 3;
        public static final int kBackRightTurningMotorPort = 1;
// THe drive ones are running well but the turning encoders are in pair of back and front sets 
// Turning encoders 
        public static final boolean kFrontLeftTurningEncoderReversed = false;
        public static final boolean kBackLeftTurningEncoderReversed = false;

        public static final boolean kFrontRightTurningEncoderReversed = false;

        public static final boolean kBackRightTurningEncoderReversed = false;
// Drive encoders 
        public static final boolean kFrontLeftDriveEncoderReversed = false;

        public static final boolean kBackLeftDriveEncoderReversed = true;
        // Was false trying true 
        // Front right module everytime that is reset the encoder reads the opposite needs to be flipped
        public static final boolean kFrontRightDriveEncoderReversed = false;
        public static final boolean kBackRightDriveEncoderReversed = true;
       // public static final boolean kFrontRightDriveEncoderReversed = false;
       // public static final boolean kBackRightDriveEncoderReversed = false;

        public static final int kFrontLeftDriveAbsoluteEncoderPort = 2;
        public static final int kBackLeftDriveAbsoluteEncoderPort = 3;
        public static final int kFrontRightDriveAbsoluteEncoderPort = 1;
        public static final int kBackRightDriveAbsoluteEncoderPort = 0;

        public static final boolean kFrontLeftDriveAbsoluteEncoderReversed = false;
        public static final boolean kBackLeftDriveAbsoluteEncoderReversed = false;
        public static final boolean kFrontRightDriveAbsoluteEncoderReversed = true;
        public static final boolean kBackRightDriveAbsoluteEncoderReversed = true;
// This is for the absolute encoders 
        public static final double kFrontLeftDriveAbsoluteEncoderOffsetRad = 0;// used to be 1.254
        public static final double kBackLeftDriveAbsoluteEncoderOffsetRad = 0; // used to be 0.252
        public static final double kFrontRightDriveAbsoluteEncoderOffsetRad = 0; // used to be -1.816
        public static final double kBackRightDriveAbsoluteEncoderOffsetRad = 0; // used to be -4.811
// Speed gets divided below 
        public static final double kPhysicalMaxSpeedMetersPerSecond = 5;
        // Angle radians 
        public static final double kPhysicalMaxAngularSpeedRadiansPerSecond = 2 * 2 * Math.PI;
// Speed for the driving 
        public static final double kTeleDriveMaxSpeedMetersPerSecond = kPhysicalMaxSpeedMetersPerSecond / 2;
        // Speed for the angular 
        public static final double kTeleDriveMaxAngularSpeedRadiansPerSecond = //
                kPhysicalMaxAngularSpeedRadiansPerSecond / 2;
        // Acceleration speeds. 
        public static final double kTeleDriveMaxAccelerationUnitsPerSecond = 4;
            // Was at 4 brought down to 2 for the spinning function ][\
            

            
        public static final double kTeleDriveMaxAngularAccelerationUnitsPerSecond = 2;
    }

    public static final class AutoConstants {
        public static final double kMaxSpeedMetersPerSecond = DriveConstants.kPhysicalMaxSpeedMetersPerSecond / 4;
        public static final double kMaxAngularSpeedRadiansPerSecond = //
                DriveConstants.kPhysicalMaxAngularSpeedRadiansPerSecond / 10;
        public static final double kMaxAccelerationMetersPerSecondSquared = 3;
        public static final double kMaxAngularAccelerationRadiansPerSecondSquared = Math.PI / 4;
        public static final double kPXController = 1.5;
        public static final double kPYController = 1.5;
        public static final double kPThetaController = 3;

        public static final TrapezoidProfile.Constraints kThetaControllerConstraints = //
                new TrapezoidProfile.Constraints(
                        kMaxAngularSpeedRadiansPerSecond,
                        kMaxAngularAccelerationRadiansPerSecondSquared);
    }

    public static final class OIConstants {
        public static final int kDriverControllerPort = 0;

        public static final int kDriverYAxis = 1;
        public static final int kDriverXAxis = 0;
        public static final int kDriverRotAxis = 4;
        public static final int kDriverFieldOrientedButtonIdx = 1;

        public static final double kDeadband = 0.05;
    }
}