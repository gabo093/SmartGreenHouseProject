// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: helloworld.proto

package my.project;

/**
 * Protobuf type {@code project.IrrigationScheculeRequest}
 */
public final class IrrigationScheculeRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:project.IrrigationScheculeRequest)
    IrrigationScheculeRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use IrrigationScheculeRequest.newBuilder() to construct.
  private IrrigationScheculeRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private IrrigationScheculeRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new IrrigationScheculeRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return my.project.MyProjectProto.internal_static_project_IrrigationScheculeRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return my.project.MyProjectProto.internal_static_project_IrrigationScheculeRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            my.project.IrrigationScheculeRequest.class, my.project.IrrigationScheculeRequest.Builder.class);
  }

  public static final int FREQUENCY_FIELD_NUMBER = 1;
  private int frequency_ = 0;
  /**
   * <code>int32 Frequency = 1;</code>
   * @return The frequency.
   */
  @java.lang.Override
  public int getFrequency() {
    return frequency_;
  }

  public static final int TIME_FIELD_NUMBER = 2;
  private int time_ = 0;
  /**
   * <code>int32 time = 2;</code>
   * @return The time.
   */
  @java.lang.Override
  public int getTime() {
    return time_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (frequency_ != 0) {
      output.writeInt32(1, frequency_);
    }
    if (time_ != 0) {
      output.writeInt32(2, time_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (frequency_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, frequency_);
    }
    if (time_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, time_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof my.project.IrrigationScheculeRequest)) {
      return super.equals(obj);
    }
    my.project.IrrigationScheculeRequest other = (my.project.IrrigationScheculeRequest) obj;

    if (getFrequency()
        != other.getFrequency()) return false;
    if (getTime()
        != other.getTime()) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + FREQUENCY_FIELD_NUMBER;
    hash = (53 * hash) + getFrequency();
    hash = (37 * hash) + TIME_FIELD_NUMBER;
    hash = (53 * hash) + getTime();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static my.project.IrrigationScheculeRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static my.project.IrrigationScheculeRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static my.project.IrrigationScheculeRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static my.project.IrrigationScheculeRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static my.project.IrrigationScheculeRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static my.project.IrrigationScheculeRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static my.project.IrrigationScheculeRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static my.project.IrrigationScheculeRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static my.project.IrrigationScheculeRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static my.project.IrrigationScheculeRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static my.project.IrrigationScheculeRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static my.project.IrrigationScheculeRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(my.project.IrrigationScheculeRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code project.IrrigationScheculeRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:project.IrrigationScheculeRequest)
      my.project.IrrigationScheculeRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return my.project.MyProjectProto.internal_static_project_IrrigationScheculeRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return my.project.MyProjectProto.internal_static_project_IrrigationScheculeRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              my.project.IrrigationScheculeRequest.class, my.project.IrrigationScheculeRequest.Builder.class);
    }

    // Construct using my.project.IrrigationScheculeRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      frequency_ = 0;
      time_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return my.project.MyProjectProto.internal_static_project_IrrigationScheculeRequest_descriptor;
    }

    @java.lang.Override
    public my.project.IrrigationScheculeRequest getDefaultInstanceForType() {
      return my.project.IrrigationScheculeRequest.getDefaultInstance();
    }

    @java.lang.Override
    public my.project.IrrigationScheculeRequest build() {
      my.project.IrrigationScheculeRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public my.project.IrrigationScheculeRequest buildPartial() {
      my.project.IrrigationScheculeRequest result = new my.project.IrrigationScheculeRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(my.project.IrrigationScheculeRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.frequency_ = frequency_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.time_ = time_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof my.project.IrrigationScheculeRequest) {
        return mergeFrom((my.project.IrrigationScheculeRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(my.project.IrrigationScheculeRequest other) {
      if (other == my.project.IrrigationScheculeRequest.getDefaultInstance()) return this;
      if (other.getFrequency() != 0) {
        setFrequency(other.getFrequency());
      }
      if (other.getTime() != 0) {
        setTime(other.getTime());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              frequency_ = input.readInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              time_ = input.readInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private int frequency_ ;
    /**
     * <code>int32 Frequency = 1;</code>
     * @return The frequency.
     */
    @java.lang.Override
    public int getFrequency() {
      return frequency_;
    }
    /**
     * <code>int32 Frequency = 1;</code>
     * @param value The frequency to set.
     * @return This builder for chaining.
     */
    public Builder setFrequency(int value) {

      frequency_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>int32 Frequency = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearFrequency() {
      bitField0_ = (bitField0_ & ~0x00000001);
      frequency_ = 0;
      onChanged();
      return this;
    }

    private int time_ ;
    /**
     * <code>int32 time = 2;</code>
     * @return The time.
     */
    @java.lang.Override
    public int getTime() {
      return time_;
    }
    /**
     * <code>int32 time = 2;</code>
     * @param value The time to set.
     * @return This builder for chaining.
     */
    public Builder setTime(int value) {

      time_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>int32 time = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearTime() {
      bitField0_ = (bitField0_ & ~0x00000002);
      time_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:project.IrrigationScheculeRequest)
  }

  // @@protoc_insertion_point(class_scope:project.IrrigationScheculeRequest)
  private static final my.project.IrrigationScheculeRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new my.project.IrrigationScheculeRequest();
  }

  public static my.project.IrrigationScheculeRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<IrrigationScheculeRequest>
      PARSER = new com.google.protobuf.AbstractParser<IrrigationScheculeRequest>() {
    @java.lang.Override
    public IrrigationScheculeRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<IrrigationScheculeRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<IrrigationScheculeRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public my.project.IrrigationScheculeRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

