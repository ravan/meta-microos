SUMMARY = "Kubernetes coredns daemon for container images"
DESCRIPTION = "This subpackage contains the coredns binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.14.6"

RPM_NAME = "kubernetes-coredns-1.14.6-72.1.aarch64.rpm"
RPM_HASH = "d231f06674f83941629e27ace0364b1b6d5343f0e3937db0d783386a8610859b7be499bf31014a47508533c1e4f7ef2027e15478e42c8655df0625e0b8fa0c55"

RPROVIDES:${PN} += "kubernetes-coredns"

RDEPENDS:${PN} += "coredns-for-k8s1.37"

inherit rpm
