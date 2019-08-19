package com.carlos.torres;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.Parser;
import com.google.protobuf.UnknownFieldSet;

/**
 * Protobuf type {@code HelloResponse}
 */
public final class HelloResponse extends GeneratedMessageV3 implements
		// @@protoc_insertion_point(message_implements:HelloResponse)
		HelloResponseOrBuilder {
	private static final long serialVersionUID = 0L;

	// Use HelloResponse.newBuilder() to construct.
	private HelloResponse(GeneratedMessageV3.Builder<?> builder) {
		super(builder);
	}

	private HelloResponse() {
		greeting_ = "";
	}

	@Override
	@SuppressWarnings({ "unused" })
	protected Object newInstance(UnusedPrivateParameter unused) {
		return new HelloResponse();
	}

	@Override
	public final UnknownFieldSet getUnknownFields() {
		return this.unknownFields;
	}

	private HelloResponse(CodedInputStream input,
			ExtensionRegistryLite extensionRegistry)
			throws InvalidProtocolBufferException {
		this();
		if (extensionRegistry == null) {
			throw new NullPointerException();
		}
		UnknownFieldSet.Builder unknownFields = UnknownFieldSet.newBuilder();
		try {
			boolean done = false;
			while (!done) {
				int tag = input.readTag();
				switch (tag) {
				case 0:
					done = true;
					break;
				case 10: {
					String s = input.readStringRequireUtf8();
					greeting_ = s;
					break;
				}
				default: {
					if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
						done = true;
					}
					break;
				}
				}
			}
		} catch (InvalidProtocolBufferException e) {
			throw e.setUnfinishedMessage(this);
		} catch (IOException e) {
			throw new InvalidProtocolBufferException(e).setUnfinishedMessage(this);
		} finally {
			this.unknownFields = unknownFields.build();
			makeExtensionsImmutable();
		}
	}

	public static final Descriptors.Descriptor getDescriptor() {
		return HelloServiceOuterClass.internal_static_com_carlos_torres_HelloResponse_descriptor;
	}

	@Override
	protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
		return HelloServiceOuterClass.internal_static_com_carlos_torres_HelloResponse_fieldAccessorTable
				.ensureFieldAccessorsInitialized(HelloResponse.class,
						HelloResponse.Builder.class);
	}

	public static final int GREETING_FIELD_NUMBER = 1;
	private volatile Object greeting_;

	/**
	 * <code>string greeting = 1;</code>
	 */
	public String getGreeting() {
		Object ref = greeting_;
		if (ref instanceof String) {
			return (String) ref;
		} else {
			ByteString bs = (ByteString) ref;
			String s = bs.toStringUtf8();
			greeting_ = s;
			return s;
		}
	}

	/**
	 * <code>string greeting = 1;</code>
	 */
	public ByteString getGreetingBytes() {
		Object ref = greeting_;
		if (ref instanceof String) {
			ByteString b = ByteString.copyFromUtf8((String) ref);
			greeting_ = b;
			return b;
		} else {
			return (ByteString) ref;
		}
	}

	private byte memoizedIsInitialized = -1;

	@Override
	public final boolean isInitialized() {
		byte isInitialized = memoizedIsInitialized;
		if (isInitialized == 1)
			return true;
		if (isInitialized == 0)
			return false;

		memoizedIsInitialized = 1;
		return true;
	}

	@Override
	public void writeTo(CodedOutputStream output) throws IOException {
		if (!getGreetingBytes().isEmpty()) {
			GeneratedMessageV3.writeString(output, 1, greeting_);
		}
		unknownFields.writeTo(output);
	}

	@Override
	public int getSerializedSize() {
		int size = memoizedSize;
		if (size != -1)
			return size;

		size = 0;
		if (!getGreetingBytes().isEmpty()) {
			size += GeneratedMessageV3.computeStringSize(1, greeting_);
		}
		size += unknownFields.getSerializedSize();
		memoizedSize = size;
		return size;
	}

	@Override
	public boolean equals(final Object obj) {
		if (obj == this) {
			return true;
		}
		if (!(obj instanceof HelloResponse)) {
			return super.equals(obj);
		}
		HelloResponse other = (HelloResponse) obj;

		if (!getGreeting().equals(other.getGreeting()))
			return false;
		if (!unknownFields.equals(other.unknownFields))
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		if (memoizedHashCode != 0) {
			return memoizedHashCode;
		}
		int hash = 41;
		hash = (19 * hash) + getDescriptor().hashCode();
		hash = (37 * hash) + GREETING_FIELD_NUMBER;
		hash = (53 * hash) + getGreeting().hashCode();
		hash = (29 * hash) + unknownFields.hashCode();
		memoizedHashCode = hash;
		return hash;
	}

	public static HelloResponse parseFrom(ByteBuffer data)
			throws InvalidProtocolBufferException {
		return PARSER.parseFrom(data);
	}

	public static HelloResponse parseFrom(ByteBuffer data,
			ExtensionRegistryLite extensionRegistry)
			throws InvalidProtocolBufferException {
		return PARSER.parseFrom(data, extensionRegistry);
	}

	public static HelloResponse parseFrom(ByteString data)
			throws InvalidProtocolBufferException {
		return PARSER.parseFrom(data);
	}

	public static HelloResponse parseFrom(ByteString data,
			ExtensionRegistryLite extensionRegistry)
			throws InvalidProtocolBufferException {
		return PARSER.parseFrom(data, extensionRegistry);
	}

	public static HelloResponse parseFrom(byte[] data)
			throws InvalidProtocolBufferException {
		return PARSER.parseFrom(data);
	}

	public static HelloResponse parseFrom(byte[] data,
			ExtensionRegistryLite extensionRegistry)
			throws InvalidProtocolBufferException {
		return PARSER.parseFrom(data, extensionRegistry);
	}

	public static HelloResponse parseFrom(InputStream input) throws IOException {
		return GeneratedMessageV3.parseWithIOException(PARSER, input);
	}

	public static HelloResponse parseFrom(InputStream input,
			ExtensionRegistryLite extensionRegistry) throws IOException {
		return GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
	}

	public static HelloResponse parseDelimitedFrom(InputStream input)
			throws IOException {
		return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
	}

	public static HelloResponse parseDelimitedFrom(InputStream input,
			ExtensionRegistryLite extensionRegistry) throws IOException {
		return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
	}

	public static HelloResponse parseFrom(CodedInputStream input)
			throws IOException {
		return GeneratedMessageV3.parseWithIOException(PARSER, input);
	}

	public static HelloResponse parseFrom(CodedInputStream input,
			ExtensionRegistryLite extensionRegistry) throws IOException {
		return GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
	}

	@Override
	public Builder newBuilderForType() {
		return newBuilder();
	}

	public static Builder newBuilder() {
		return DEFAULT_INSTANCE.toBuilder();
	}

	public static Builder newBuilder(HelloResponse prototype) {
		return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
	}

	@Override
	public Builder toBuilder() {
		return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
	}

	@Override
	protected Builder newBuilderForType(GeneratedMessageV3.BuilderParent parent) {
		Builder builder = new Builder(parent);
		return builder;
	}

	/**
	 * Protobuf type {@code HelloResponse}
	 */
	public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements
			// @@protoc_insertion_point(builder_implements:HelloResponse)
			HelloResponseOrBuilder {
		public static final Descriptors.Descriptor getDescriptor() {
			return HelloServiceOuterClass.internal_static_com_carlos_torres_HelloResponse_descriptor;
		}

		@Override
		protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
			return HelloServiceOuterClass.internal_static_com_carlos_torres_HelloResponse_fieldAccessorTable
					.ensureFieldAccessorsInitialized(HelloResponse.class,
							HelloResponse.Builder.class);
		}

		// Construct using HelloResponse.newBuilder()
		private Builder() {
			maybeForceBuilderInitialization();
		}

		private Builder(GeneratedMessageV3.BuilderParent parent) {
			super(parent);
			maybeForceBuilderInitialization();
		}

		private void maybeForceBuilderInitialization() {
			if (GeneratedMessageV3.alwaysUseFieldBuilders) {
			}
		}

		@Override
		public Builder clear() {
			super.clear();
			greeting_ = "";

			return this;
		}

		@Override
		public Descriptors.Descriptor getDescriptorForType() {
			return HelloServiceOuterClass.internal_static_com_carlos_torres_HelloResponse_descriptor;
		}

		@Override
		public HelloResponse getDefaultInstanceForType() {
			return HelloResponse.getDefaultInstance();
		}

		@Override
		public HelloResponse build() {
			HelloResponse result = buildPartial();
			if (!result.isInitialized()) {
				throw newUninitializedMessageException(result);
			}
			return result;
		}

		@Override
		public HelloResponse buildPartial() {
			HelloResponse result = new HelloResponse(this);
			result.greeting_ = greeting_;
			onBuilt();
			return result;
		}

		@Override
		public Builder clone() {
			return super.clone();
		}

		@Override
		public Builder setField(Descriptors.FieldDescriptor field, Object value) {
			return super.setField(field, value);
		}

		@Override
		public Builder clearField(Descriptors.FieldDescriptor field) {
			return super.clearField(field);
		}

		@Override
		public Builder clearOneof(Descriptors.OneofDescriptor oneof) {
			return super.clearOneof(oneof);
		}

		@Override
		public Builder setRepeatedField(Descriptors.FieldDescriptor field, int index,
				Object value) {
			return super.setRepeatedField(field, index, value);
		}

		@Override
		public Builder addRepeatedField(Descriptors.FieldDescriptor field, Object value) {
			return super.addRepeatedField(field, value);
		}

		@Override
		public Builder mergeFrom(Message other) {
			if (other instanceof HelloResponse) {
				return mergeFrom((HelloResponse) other);
			} else {
				super.mergeFrom(other);
				return this;
			}
		}

		public Builder mergeFrom(HelloResponse other) {
			if (other == HelloResponse.getDefaultInstance())
				return this;
			if (!other.getGreeting().isEmpty()) {
				greeting_ = other.greeting_;
				onChanged();
			}
			this.mergeUnknownFields(other.unknownFields);
			onChanged();
			return this;
		}

		@Override
		public final boolean isInitialized() {
			return true;
		}

		@Override
		public Builder mergeFrom(CodedInputStream input,
				ExtensionRegistryLite extensionRegistry) throws IOException {
			HelloResponse parsedMessage = null;
			try {
				parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
			} catch (InvalidProtocolBufferException e) {
				parsedMessage = (HelloResponse) e.getUnfinishedMessage();
				throw e.unwrapIOException();
			} finally {
				if (parsedMessage != null) {
					mergeFrom(parsedMessage);
				}
			}
			return this;
		}

		private Object greeting_ = "";

		/**
		 * <code>string greeting = 1;</code>
		 */
		public String getGreeting() {
			Object ref = greeting_;
			if (!(ref instanceof String)) {
				ByteString bs = (ByteString) ref;
				String s = bs.toStringUtf8();
				greeting_ = s;
				return s;
			} else {
				return (String) ref;
			}
		}

		/**
		 * <code>string greeting = 1;</code>
		 */
		public ByteString getGreetingBytes() {
			Object ref = greeting_;
			if (ref instanceof String) {
				ByteString b = ByteString.copyFromUtf8((String) ref);
				greeting_ = b;
				return b;
			} else {
				return (ByteString) ref;
			}
		}

		/**
		 * <code>string greeting = 1;</code>
		 */
		public Builder setGreeting(String value) {
			if (value == null) {
				throw new NullPointerException();
			}

			greeting_ = value;
			onChanged();
			return this;
		}

		/**
		 * <code>string greeting = 1;</code>
		 */
		public Builder clearGreeting() {

			greeting_ = getDefaultInstance().getGreeting();
			onChanged();
			return this;
		}

		/**
		 * <code>string greeting = 1;</code>
		 */
		public Builder setGreetingBytes(ByteString value) {
			if (value == null) {
				throw new NullPointerException();
			}
			checkByteStringIsUtf8(value);

			greeting_ = value;
			onChanged();
			return this;
		}

		@Override
		public final Builder setUnknownFields(final UnknownFieldSet unknownFields) {
			return super.setUnknownFields(unknownFields);
		}

		@Override
		public final Builder mergeUnknownFields(final UnknownFieldSet unknownFields) {
			return super.mergeUnknownFields(unknownFields);
		}

		// @@protoc_insertion_point(builder_scope:HelloResponse)
	}

	// @@protoc_insertion_point(class_scope:HelloResponse)
	private static final HelloResponse DEFAULT_INSTANCE;
	static {
		DEFAULT_INSTANCE = new HelloResponse();
	}

	public static HelloResponse getDefaultInstance() {
		return DEFAULT_INSTANCE;
	}

	private static final Parser<HelloResponse> PARSER = new AbstractParser<HelloResponse>() {
		@Override
		public HelloResponse parsePartialFrom(CodedInputStream input,
				ExtensionRegistryLite extensionRegistry)
				throws InvalidProtocolBufferException {
			return new HelloResponse(input, extensionRegistry);
		}
	};

	public static Parser<HelloResponse> parser() {
		return PARSER;
	}

	@Override
	public Parser<HelloResponse> getParserForType() {
		return PARSER;
	}

	@Override
	public HelloResponse getDefaultInstanceForType() {
		return DEFAULT_INSTANCE;
	}

}
