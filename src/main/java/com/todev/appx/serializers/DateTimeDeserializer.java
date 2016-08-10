package com.todev.appx.serializers;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import java.io.IOException;
import org.joda.time.DateTime;

public class DateTimeDeserializer extends JsonDeserializer<DateTime> {
  /**
   * Deserializes POSIX timestamp to {@link DateTime} type.
   *
   * @param p {@link JsonParser} used for deserialization.
   * @param ctxt {@link DeserializationContext} context of deserialization.
   * @return {@link DateTime} object that represents deserialized JSON value.
   * @throws IOException raised when malformed JSON value has been provided.
   */
  @Override
  public DateTime deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
    final String string = p.getText().trim();
    return DateTime.parse(string);
  }
}
