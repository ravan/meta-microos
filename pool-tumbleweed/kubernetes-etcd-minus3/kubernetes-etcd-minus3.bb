SUMMARY = "Kubernetes etcd daemon for container images"
DESCRIPTION = "This subpackage contains the etcd binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "3.6.5"

RPM_NAME = "kubernetes-etcd-minus3-3.6.5-72.1.aarch64.rpm"
RPM_HASH = "a5371972f54b36eae52ee8e22bd27cb0ca64a0f8672d9dcf89813da46853dfb4d5ba4c23c7c76739b466b9e7b6b7a91a37f955fad06802d3aab35e1ca783f7ba"

RPROVIDES:${PN} += "kubernetes-etcd-minus3"

RDEPENDS:${PN} += "etcd-for-k8s1.34"

inherit rpm
