package com.onlineshop.store.api.operations.vendor.getall;

import com.onlineshop.store.api.base.ProcessorResult;
import com.onlineshop.store.api.model.VendorModel;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GetVendorsResult implements ProcessorResult {
    private List<VendorModel> vendorModels;
}
