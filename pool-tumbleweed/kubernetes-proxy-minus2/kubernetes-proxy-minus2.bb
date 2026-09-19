SUMMARY = "Kubernetes proxy for container image"
DESCRIPTION = "This subpackage contains the kube-proxy binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.35.8"

RPM_NAME = "kubernetes-proxy-minus2-1.35.8-72.1.aarch64.rpm"
RPM_HASH = "d3f2a7c8d41da649757919b78f73d54e879b476725e4c90755678c5db97f5eac256fb585cde8be09cffcb962a0be14c0c6d3b2508816a135aa9bdcda4f84ebaf"

RPROVIDES:${PN} += "kubernetes-proxy-minus2"

RDEPENDS:${PN} += "kubernetes1.35-proxy"

inherit rpm
