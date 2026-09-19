SUMMARY = "Kubernetes coredns daemon for container images"
DESCRIPTION = "This subpackage contains the coredns binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.12.1"

RPM_NAME = "kubernetes-coredns-minus3-1.12.1-72.1.aarch64.rpm"
RPM_HASH = "0472dfb390fd0a6dea5db89c00d0b286973ab4447b9d3d3155eff79358a6b77bad1811ef6d7b5e3a8ef7f0d34223f6c37ceefc9d6cb3265cf68f293426ccadb5"

RPROVIDES:${PN} += "kubernetes-coredns-minus3"

RDEPENDS:${PN} += "coredns-for-k8s1.34"

inherit rpm
