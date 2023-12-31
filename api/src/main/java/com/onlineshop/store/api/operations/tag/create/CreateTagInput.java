package com.onlineshop.store.api.operations.tag.create;

import com.onlineshop.store.api.base.ProcessorInput;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreateTagInput implements ProcessorInput {

    @NotBlank
    private String title;
}
