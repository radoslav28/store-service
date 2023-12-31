package com.onlineshop.store.api.operations.item.update;

import com.onlineshop.store.api.base.ProcessorResult;
import com.onlineshop.store.api.model.MultimediaModel;
import com.onlineshop.store.api.model.TagModel;
import com.onlineshop.store.api.model.VendorModel;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UpdateItemResult implements ProcessorResult {
    private String id;
    private String title;
    private String description;
    private VendorModel vendor;
    private List<MultimediaModel> multimedia;
    private List<TagModel> tags;
}
