SUMMARY = "Kubernetes in Kubernetes"
DESCRIPTION = "A Kubernetes in Kubernetes tool, k3k provides a way to run multiple embedded \
isolated k3s clusters on your kubernetes cluster."
LICENSE = "Apache-2.0"

PV = "1.2.0"

RPM_NAME = "k3kcli-1.2.0-1.1.aarch64.rpm"
RPM_HASH = "c5e832d87699cb78fb6951c1b2ef91afdd2c75d1370f28e3b306b0a3bec7a809bf552b2513547fdbb230d419f5cd4566e4ea355eda95287e4b1d26d792e9dd8c"

RPROVIDES:${PN} += "k3kcli"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
