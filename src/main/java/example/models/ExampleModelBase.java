package example.models;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "version") // "property" is the JSON field that declares the type - it can be named anything
@JsonSubTypes({
    @JsonSubTypes.Type(value = ExampleModelVersion1.class, name = "version1"),
    @JsonSubTypes.Type(value = ExampleModelVersion2.class, name = "version2")
})
/**
 * The base class doesn't need any fields. It's purpose is to declare the Jackson annotations
 * used to do the polymorphic dispatch
 */
public abstract class ExampleModelBase {
    // any common unchanging values go here
}
