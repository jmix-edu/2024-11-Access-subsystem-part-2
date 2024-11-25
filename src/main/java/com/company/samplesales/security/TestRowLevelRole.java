package com.company.samplesales.security;

import com.company.samplesales.entity.Product;
import io.jmix.security.model.RowLevelPolicyAction;
import io.jmix.security.model.RowLevelPredicate;
import io.jmix.security.role.annotation.PredicateRowLevelPolicy;
import io.jmix.security.role.annotation.RowLevelRole;
import org.apache.commons.lang3.BooleanUtils;

@RowLevelRole(name = "TestRowLevelRole", code = TestRowLevelRole.CODE)
public interface TestRowLevelRole {
    String CODE = "test-restrictions";

    @PredicateRowLevelPolicy(entityClass = Product.class, actions = RowLevelPolicyAction.READ)
    static RowLevelPredicate<Product> product() {
        return entity -> BooleanUtils.isNotTrue(entity.getSpecial());
    }
}