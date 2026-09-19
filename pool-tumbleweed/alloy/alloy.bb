SUMMARY = "OpenTelemetry Collector distribution with programmable pipelines"
DESCRIPTION = "Grafana Alloy is an open source OpenTelemetry Collector distribution with \
built-in Prometheus pipelines and support for metrics, logs, traces, and \
profiles. \
 \
What can Alloy do? \
* Programmable pipelines: Use a rich expression-based syntax for configuring \
  powerful observability pipelines. \
* OpenTelemetry Collector Distribution: Alloy is a distribution of \
  OpenTelemetry Collector and supports dozens of its components, alongside new \
  components that make use of Alloy's programmable pipelines. \
* Big tent: Alloy embraces Grafana's 'big tent' philosophy, where Alloy can be \
  used with other vendors or open source databases. It has components to \
  perfectly integrate with multiple telemetry ecosystems: \
  - OpenTelemetry Collector \
  - Prometheus \
  - Grafana Loki \
  - Grafana Pyroscope \
* Kubernetes-native: Use components to interact with native and custom \
  Kubernetes resources; no need to learn how to use a separate Kubernetes \
  operator. \
* Shareable pipelines: Use modules to share your pipelines with the world. \
* Automatic workload distribution: Configure Alloy instances to form a cluster \
  for automatic workload distribution. \
* Centralized configuration support: Alloy supports retrieving its \
  configuration from a server for centralized configuration management. \
* Debugging utilities: Use the built-in UI for visualizing and debugging \
  pipelines."
LICENSE = "Apache-2.0"

PV = "1.18.0"

RPM_NAME = "alloy-1.18.0-1.1.aarch64.rpm"
RPM_HASH = "0cd7083386121f9aff6e9328e4095e47dbdec680264a7394a9126b0817f07db37ea4c06826aec672870226c86cba6482ba1086752b32a4a01773b68bbecda5ba"

RPROVIDES:${PN} += "alloy \
config-alloy"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
group-alloy \
ld-linux-aarch64.so.1 \
libc.so.6 \
user-alloy"

inherit rpm
