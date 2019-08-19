package com.carlos.torres;

import java.io.IOException;

import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors.Descriptor;
import com.google.protobuf.Descriptors.FieldDescriptor;
import com.google.protobuf.Descriptors.OneofDescriptor;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.Parser;
import com.google.protobuf.UnknownFieldSet;

/**
 * Protobuf type {@code HelloRequest}
 */
public final class HelloRequest extends GeneratedMessageV3 implements
		// @@protoc_insertion_point(message_implements:HelloRequest)
		HelloRequestOrBuilder {
	
	private static final long serialVersionUID = 0L;

	private HelloRequest(GeneratedMessageV3.Builder<?> builder) {
		super(builder);
	}

	private HelloRequest() {
		firstName_ = "";
		lastName_ = "";
	}

	@Override
	protected Object newInstance(UnusedPrivateParameter unused) {
		return new HelloRequest();
	}

	@Override
	public final UnknownFieldSet getUnknownFields() {
		return this.unknownFields;
	}

	private HelloRequest(CodedInputStream input, ExtensionRegistryLite extensionRegistry) 
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
					firstName_ = s;
					break;
				}
				case 18: {
					String s = input.readStringRequireUtf8();
					lastName_ = s;
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

	public static final Descriptor getDescriptor() {
		return HelloServiceOuterClass.internal_static_com_carlos_torres_HelloRequest_descriptor;
	}

	@Override
	protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
		return HelloServiceOuterClass.internal_static_com_carlos_torres_HelloRequest_fieldAccessorTable
				.ensureFieldAccessorsInitialized(HelloRequest.class,
						HelloRequest.Builder.class);
	}

	public static final int FIRSTNAME_FIELD_NUMBER = 1;
	private volatile Object firstName_;

	/**
	 * <code>string firstName = 1;</code>
	 */
	public String getFirstName() {
		Object ref = firstName_;
		if (ref instanceof String) {
			return (String) ref;
		} else {
			ByteString bs = (ByteString) ref;
			String s = bs.toStringUtf8();
			firstName_ = s;
			return s;
		}
	}

	/**
	 * <code>string firstName = 1;</code>
	 */
	public ByteString getFirstNameBytes() {
		Object ref = firstName_;
		if (ref instanceof String) {
			ByteString b = ByteString.copyFromUtf8((String) ref);
			firstName_ = b;
			return b;
		} else {
			return (ByteString) ref;
		}
	}

	public static final int LASTNAME_FIELD_NUMBER = 2;
	private volatile Object lastName_;

	/**
	 * <code>string lastName = 2;</code>
	 */
	public String getLastName() {
		Object ref = lastName_;
		if (ref instanceof String) {
			return (String) ref;
		} else {
			ByteString bs = (ByteString) ref;
			String s = bs.toStringUtf8();
			lastName_ = s;
			return s;
		}
	}

	/**
	 * <code>string lastName = 2;</code>
	 */
	public ByteString getLastNameBytes() {
		Object ref = lastName_;
		if (ref instanceof String) {
			ByteString b = ByteString.copyFromUtf8((String) ref);
			lastName_ = b;
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
	public void writeTo(CodedOutputStream output) throws java.io.IOException {
		if (!getFirstNameBytes().isEmpty()) {
			GeneratedMessageV3.writeString(output, 1, firstName_);
		}
		if (!getLastNameBytes().isEmpty()) {
			GeneratedMessageV3.writeString(output, 2, lastName_);
		}
		unknownFields.writeTo(output);
	}

	@Override
	public int getSerializedSize() {
		int size = memoizedSize;
		if (size != -1)
			return size;

		size = 0;
		if (!getFirstNameBytes().isEmpty()) {
			size += GeneratedMessageV3.computeStringSize(1, firstName_);
		}
		if (!getLastNameBytes().isEmpty()) {
			size += GeneratedMessageV3.computeStringSize(2, lastName_);
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
		if (!(obj instanceof HelloRequest)) {
			return super.equals(obj);
		}
		HelloRequest other = (HelloRequest) obj;

		if (!getFirstName().equals(other.getFirstName()))
			return false;
		if (!getLastName().equals(other.getLastName()))
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
		hash = (37 * hash) + FIRSTNAME_FIELD_NUMBER;
		hash = (53 * hash) + getFirstName().hashCode();
		hash = (37 * hash) + LASTNAME_FIELD_NUMBER;
		hash = (53 * hash) + getLastName().hashCode();
		hash = (29 * hash) + unknownFields.hashCode();
		memoizedHashCode = hash;
		return hash;
	}

	public static HelloRequest parseFrom(java.nio.ByteBuffer data)
			throws InvalidProtocolBufferException {
		return PARSER.parseFrom(data);
	}

	public static HelloRequest parseFrom(java.nio.ByteBuffer data,
			ExtensionRegistryLite extensionRegistry)
			throws InvalidProtocolBufferException {
		return PARSER.parseFrom(data, extensionRegistry);
	}

	public static HelloRequest parseFrom(ByteString data)
			throws InvalidProtocolBufferException {
		return PARSER.parseFrom(data);
	}

	public static HelloRequest parseFrom(ByteString data,
			ExtensionRegistryLite extensionRegistry)
			throws InvalidProtocolBufferException {
		return PARSER.parseFrom(data, extensionRegistry);
	}

	public static HelloRequest parseFrom(byte[] data)
			throws InvalidProtocolBufferException {
		return PARSER.parseFrom(data);
	}

	public static HelloRequest parseFrom(byte[] data,
			ExtensionRegistryLite extensionRegistry)
			throws InvalidProtocolBufferException {
		return PARSER.parseFrom(data, extensionRegistry);
	}

	public static HelloRequest parseFrom(java.io.InputStream input) throws java.io.IOException {
		return GeneratedMessageV3.parseWithIOException(PARSER, input);
	}

	public static HelloRequest parseFrom(java.io.InputStream input,
			ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
		return GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
	}

	public static HelloRequest parseDelimitedFrom(java.io.InputStream input)
			throws java.io.IOException {
		return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
	}

	public static HelloRequest parseDelimitedFrom(java.io.InputStream input,
			ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
		return GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
	}

	public static HelloRequest parseFrom(CodedInputStream input)
			throws java.io.IOException {
		return GeneratedMessageV3.parseWithIOException(PARSER, input);
	}

	public static HelloRequest parseFrom(CodedInputStream input,
			ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
		return GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
	}

	@Override
	public Builder newBuilderForType() {
		return newBuilder();
	}

	public static Builder newBuilder() {
		return DEFAULT_INSTANCE.toBuilder();
	}

	public static Builder newBuilder(HelloRequest prototype) {
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
	 * Protobuf type {@code HelloRequest}
	 */
	public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements
			// @@protoc_insertion_point(builder_implements:HelloRequest)
			HelloRequestOrBuilder {
		public static final Descriptor getDescriptor() {
			return HelloServiceOuterClass.internal_static_com_carlos_torres_HelloRequest_descriptor;
		}

		@Override
		protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
			return HelloServiceOuterClass.internal_static_com_carlos_torres_HelloRequest_fieldAccessorTable
					.ensureFieldAccessorsInitialized(HelloRequest.class,
							HelloRequest.Builder.class);
		}

		// Construct using HelloRequest.newBuilder()
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
			firstName_ = "";

			lastName_ = "";

			return this;
		}

		@Override
		public Descriptor getDescriptorForType() {
			return HelloServiceOuterClass.internal_static_com_carlos_torres_HelloRequest_descriptor;
		}

		@Override
		public HelloRequest getDefaultInstanceForType() {
			return HelloRequest.getDefaultInstance();
		}

		@Override
		public HelloRequest build() {
			HelloRequest result = buildPartial();
			if (!result.isInitialized()) {
				throw newUninitializedMessageException(result);
			}
			return result;
		}

		@Override
		public HelloRequest buildPartial() {
			HelloRequest result = new HelloRequest(this);
			result.firstName_ = firstName_;
			result.lastName_ = lastName_;
			onBuilt();
			return result;
		}

		@Override
		public Builder clone() {
			return super.clone();
		}

		@Override
		public Builder setField(FieldDescriptor field, Object value) {
			return super.setField(field, value);
		}

		@Override
		public Builder clearField(FieldDescriptor field) {
			return super.clearField(field);
		}

		@Override
		public Builder clearOneof(OneofDescriptor oneof) {
			return super.clearOneof(oneof);
		}

		@Override
		public Builder setRepeatedField(FieldDescriptor field, int index,
				Object value) {
			return super.setRepeatedField(field, index, value);
		}

		@Override
		public Builder addRepeatedField(FieldDescriptor field, Object value) {
			return super.addRepeatedField(field, value);
		}

		@Override
		public Builder mergeFrom(Message other) {
			if (other instanceof HelloRequest) {
				return mergeFrom((HelloRequest) other);
			} else {
				super.mergeFrom(other);
				return this;
			}
		}

		public Builder mergeFrom(HelloRequest other) {
			if (other == HelloRequest.getDefaultInstance())
				return this;
			if (!other.getFirstName().isEmpty()) {
				firstName_ = other.firstName_;
				onChanged();
			}
			if (!other.getLastName().isEmpty()) {
				lastName_ = other.lastName_;
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
				ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
			HelloRequest parsedMessage = null;
			try {
				parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
			} catch (InvalidProtocolBufferException e) {
				parsedMessage = (HelloRequest) e.getUnfinishedMessage();
				throw e.unwrapIOException();
			} finally {
				if (parsedMessage != null) {
					mergeFrom(parsedMessage);
				}
			}
			return this;
		}

		private Object firstName_ = "";

		/**
		 * <code>string firstName = 1;</code>
		 */
		public String getFirstName() {
			Object ref = firstName_;
			if (!(ref instanceof String)) {
				ByteString bs = (ByteString) ref;
				String s = bs.toStringUtf8();
				firstName_ = s;
				return s;
			} else {
				return (String) ref;
			}
		}

		/**
		 * <code>string firstName = 1;</code>
		 */
		public ByteString getFirstNameBytes() {
			Object ref = firstName_;
			if (ref instanceof String) {
				ByteString b = ByteString.copyFromUtf8((String) ref);
				firstName_ = b;
				return b;
			} else {
				return (ByteString) ref;
			}
		}

		/**
		 * <code>string firstName = 1;</code>
		 */
		public Builder setFirstName(String value) {
			if (value == null) {
				throw new NullPointerException();
			}

			firstName_ = value;
			onChanged();
			return this;
		}

		/**
		 * <code>string firstName = 1;</code>
		 */
		public Builder clearFirstName() {

			firstName_ = getDefaultInstance().getFirstName();
			onChanged();
			return this;
		}

		/**
		 * <code>string firstName = 1;</code>
		 */
		public Builder setFirstNameBytes(ByteString value) {
			if (value == null) {
				throw new NullPointerException();
			}
			checkByteStringIsUtf8(value);

			firstName_ = value;
			onChanged();
			return this;
		}

		private Object lastName_ = "";

		/**
		 * <code>string lastName = 2;</code>
		 */
		public String getLastName() {
			Object ref = lastName_;
			if (!(ref instanceof String)) {
				ByteString bs = (ByteString) ref;
				String s = bs.toStringUtf8();
				lastName_ = s;
				return s;
			} else {
				return (String) ref;
			}
		}

		/**
		 * <code>string lastName = 2;</code>
		 */
		public ByteString getLastNameBytes() {
			Object ref = lastName_;
			if (ref instanceof String) {
				ByteString b = ByteString.copyFromUtf8((String) ref);
				lastName_ = b;
				return b;
			} else {
				return (ByteString) ref;
			}
		}

		/**
		 * <code>string lastName = 2;</code>
		 */
		public Builder setLastName(String value) {
			if (value == null) {
				throw new NullPointerException();
			}

			lastName_ = value;
			onChanged();
			return this;
		}

		/**
		 * <code>string lastName = 2;</code>
		 */
		public Builder clearLastName() {

			lastName_ = getDefaultInstance().getLastName();
			onChanged();
			return this;
		}

		/**
		 * <code>string lastName = 2;</code>
		 */
		public Builder setLastNameBytes(ByteString value) {
			if (value == null) {
				throw new NullPointerException();
			}
			checkByteStringIsUtf8(value);

			lastName_ = value;
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

		// @@protoc_insertion_point(builder_scope:HelloRequest)
	}

	// @@protoc_insertion_point(class_scope:HelloRequest)
	private static final HelloRequest DEFAULT_INSTANCE;
	static {
		DEFAULT_INSTANCE = new HelloRequest();
	}

	public static HelloRequest getDefaultInstance() {
		return DEFAULT_INSTANCE;
	}

	private static final Parser<HelloRequest> PARSER = new AbstractParser<HelloRequest>() {
		@Override
		public HelloRequest parsePartialFrom(CodedInputStream input,
				ExtensionRegistryLite extensionRegistry)
				throws InvalidProtocolBufferException {
			return new HelloRequest(input, extensionRegistry);
		}
	};

	public static Parser<HelloRequest> parser() {
		return PARSER;
	}

	@Override
	public Parser<HelloRequest> getParserForType() {
		return PARSER;
	}

	@Override
	public HelloRequest getDefaultInstanceForType() {
		return DEFAULT_INSTANCE;
	}

}
