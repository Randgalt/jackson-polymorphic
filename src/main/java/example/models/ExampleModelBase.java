package example.models;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "version")
@JsonSubTypes({
    @JsonSubTypes.Type(value = ExampleModelVersion1.class, name = "version1"),
    @JsonSubTypes.Type(value = ExampleModelVersion2.class, name = "version2")
})
public abstract class ExampleModelBase {
    // any common unchanging values go here
}
