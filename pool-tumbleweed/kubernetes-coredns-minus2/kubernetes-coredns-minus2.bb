SUMMARY = "Kubernetes coredns daemon for container images"
DESCRIPTION = "This subpackage contains the coredns binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.13.1"

RPM_NAME = "kubernetes-coredns-minus2-1.13.1-72.1.aarch64.rpm"
RPM_HASH = "0fec9c07f7baa148c5c0bba1b7556faee5a255984a00d80badfbbf03adc7c319274ba80bd5e1d745d9f0bc7342c1e71fc06f63c8c900ad443c0abec85db7fa91"

RPROVIDES:${PN} += "kubernetes-coredns-minus2"

RDEPENDS:${PN} += "coredns-for-k8s1.35"

inherit rpm
