package com;

import com.codahale.metrics.*;
import com.codahale.metrics.jvm.ThreadStatesGaugeSet;
import com.sun.javafx.font.Metrics;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class MetricsDemo {

    public static List<byte[]> costs = new ArrayList<byte[]>();


    public static void main(String[] args) throws InterruptedException {
        MetricRegistry metricRegistry = new MetricRegistry();

        metricRegistry.register("jvm.thread", new ThreadStatesGaugeSet());

        Gauge<Integer> threadStatesGaugeSet = metricRegistry.getGauges(MetricFilter.startsWith("jvm.thread")).get("jvm.thread.count");


        System.out.println(threadStatesGaugeSet.getValue());

//        for (Map.Entry<String, Metric> metricEntry : metrics.entrySet()) {
//            System.out.println(metricEntry.getKey());
//            if (metricEntry.getValue() instanceof MetricSet) {
//                MetricSet metricSet = (MetricSet) metricEntry.getValue();
//                Map<String, Metric> innerMetric = metricSet.getMetrics();
//                for (Map.Entry<String, Metric> metricEntry1 : innerMetric.entrySet()) {
//                    System.out.println("    " + metricEntry1.getKey());
//                    System.out.println("    " + metricEntry1.getValue());
//                }
//            }
//        }
    }
}
