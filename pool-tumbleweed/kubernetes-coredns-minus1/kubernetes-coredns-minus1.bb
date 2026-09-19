SUMMARY = "Kubernetes coredns daemon for container images"
DESCRIPTION = "This subpackage contains the coredns binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.14.2"

RPM_NAME = "kubernetes-coredns-minus1-1.14.2-72.1.aarch64.rpm"
RPM_HASH = "a4f7abebdae08e2e7c5a4db37d1c8a6f63c0c43a5905e153b5bc21fbb71545c1a1a07c356b17d0e6a83183fcb70199a14fe2880eb0aa752060034c5db5921da1"

RPROVIDES:${PN} += "kubernetes-coredns-minus1"

RDEPENDS:${PN} += "coredns-for-k8s1.36"

inherit rpm
