SUMMARY = "Query node allocations/utilizations in kubectl"
DESCRIPTION = "kubectl node-resource is a kubectl plugin that provides insights into \
Kubernetes node resource allocation (based on pod requests) and actual \
utilization (based on metrics-server data). \
 \
It helps administrators and developers understand how resources are being \
consumed across their cluster's nodes and node pools."
LICENSE = "Apache-2.0"

PV = "0.3.0"

RPM_NAME = "kubectl-node_resource-0.3.0-1.8.aarch64.rpm"
RPM_HASH = "e41478b44ea4216dcca24b0db243ee017c524f5737627cafd7a649b7cb586e17dbbb19c30f8ae9f70fb6c82e2b02b424f90ad7b4e1499d4de1018559b822d3e3"

RPROVIDES:${PN} += "kubectl-node-resource"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
