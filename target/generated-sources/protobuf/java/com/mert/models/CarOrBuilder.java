// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common/car.proto

package com.mert.models;

public interface CarOrBuilder extends
    // @@protoc_insertion_point(interface_extends:common.Car)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string make = 1;</code>
   */
  java.lang.String getMake();
  /**
   * <code>string make = 1;</code>
   */
  com.google.protobuf.ByteString
      getMakeBytes();

  /**
   * <code>string model = 2;</code>
   */
  java.lang.String getModel();
  /**
   * <code>string model = 2;</code>
   */
  com.google.protobuf.ByteString
      getModelBytes();

  /**
   * <code>int32 year = 3;</code>
   */
  int getYear();

  /**
   * <code>.common.BodyStyle body_style = 4;</code>
   */
  int getBodyStyleValue();
  /**
   * <code>.common.BodyStyle body_style = 4;</code>
   */
  com.mert.models.BodyStyle getBodyStyle();
}