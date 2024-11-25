package com.company.samplesales.view.orderline;

import com.company.samplesales.entity.OrderLine;
import com.company.samplesales.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.StandardDetailView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "orderLines/:id", layout = MainView.class)
@ViewController(id = "OrderLine.detail")
@ViewDescriptor(path = "order-line-detail-view.xml")
@EditedEntityContainer("orderLineDc")
public class OrderLineDetailView extends StandardDetailView<OrderLine> {
}