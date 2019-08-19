package com.carlos.torres;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface HelloRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.carlos.torres.HelloRequest)
    MessageOrBuilder {

  /**
   * <code>string firstName = 1;</code>
   */
  String getFirstName();
  
  /**
   * <code>string firstName = 1;</code>
   */
  ByteString getFirstNameBytes();

  /**
   * <code>string lastName = 2;</code>
   */
  String getLastName();
  /**
   * <code>string lastName = 2;</code>
   */
  ByteString getLastNameBytes();
}
