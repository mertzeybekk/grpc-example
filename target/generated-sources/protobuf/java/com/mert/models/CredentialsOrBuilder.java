// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: credential.proto

package com.mert.models;

public interface CredentialsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Credentials)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.EmailCredentials emailMode = 1;</code>
   */
  boolean hasEmailMode();
  /**
   * <code>.EmailCredentials emailMode = 1;</code>
   */
  com.mert.models.EmailCredentials getEmailMode();
  /**
   * <code>.EmailCredentials emailMode = 1;</code>
   */
  com.mert.models.EmailCredentialsOrBuilder getEmailModeOrBuilder();

  /**
   * <code>.PhoneOTP phoneMode = 2;</code>
   */
  boolean hasPhoneMode();
  /**
   * <code>.PhoneOTP phoneMode = 2;</code>
   */
  com.mert.models.PhoneOTP getPhoneMode();
  /**
   * <code>.PhoneOTP phoneMode = 2;</code>
   */
  com.mert.models.PhoneOTPOrBuilder getPhoneModeOrBuilder();

  public com.mert.models.Credentials.ModeCase getModeCase();
}