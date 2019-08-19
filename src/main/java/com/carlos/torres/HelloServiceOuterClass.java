package com.carlos.torres;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;

public final class HelloServiceOuterClass {
	
	private HelloServiceOuterClass() {
	}

	public static void registerAllExtensions(ExtensionRegistryLite registry) {
	}

	public static void registerAllExtensions(ExtensionRegistry registry) {
		registerAllExtensions((ExtensionRegistryLite) registry);
	}

	static final Descriptors.Descriptor internal_static_com_carlos_torres_HelloRequest_descriptor;
	static final GeneratedMessageV3.FieldAccessorTable internal_static_com_carlos_torres_HelloRequest_fieldAccessorTable;
	static final Descriptors.Descriptor internal_static_com_carlos_torres_HelloResponse_descriptor;
	static final GeneratedMessageV3.FieldAccessorTable internal_static_com_carlos_torres_HelloResponse_fieldAccessorTable;

	public static Descriptors.FileDescriptor getDescriptor() {
		return descriptor;
	}

	private static Descriptors.FileDescriptor descriptor;
	static {
		String[] descriptorData = { "\n\022HelloService.proto\022\021com.carlos.torres\""
				+ "3\n\014HelloRequest\022\021\n\tfirstName\030\001 \001(\t\022\020\n\010la"
				+ "stName\030\002 \001(\t\"!\n\rHelloResponse\022\020\n\010greetin"
				+ "g\030\001 \001(\t2Z\n\014HelloService\022J\n\005hello\022\037.com.c"
				+ "arlos.torres.HelloRequest\032 .com.carlos.t" + "orres.HelloResponseB\002P\001b\006proto3" };
		descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(descriptorData, new Descriptors.FileDescriptor[] {});
		internal_static_com_carlos_torres_HelloRequest_descriptor = getDescriptor().getMessageTypes().get(0);
		internal_static_com_carlos_torres_HelloRequest_fieldAccessorTable = 
				new GeneratedMessageV3.FieldAccessorTable(internal_static_com_carlos_torres_HelloRequest_descriptor, new String[] { "FirstName", "LastName", });
		internal_static_com_carlos_torres_HelloResponse_descriptor = getDescriptor().getMessageTypes().get(1);
		internal_static_com_carlos_torres_HelloResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
				internal_static_com_carlos_torres_HelloResponse_descriptor, new String[] { "Greeting", });
	}

	// @@protoc_insertion_point(outer_class_scope)
}
