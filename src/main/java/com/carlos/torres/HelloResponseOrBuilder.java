package com.carlos.torres;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface HelloResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.carlos.torres.HelloResponse)
    MessageOrBuilder {

  /**
   * <code>string greeting = 1;</code>
   */
  String getGreeting();
  
  /**
   * <code>string greeting = 1;</code>
   */
  ByteString getGreetingBytes();
}
