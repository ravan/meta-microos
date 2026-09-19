SUMMARY = "Kubernetes etcd daemon for container images"
DESCRIPTION = "This subpackage contains the etcd binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "3.7.0"

RPM_NAME = "kubernetes-etcd-3.7.0-72.1.aarch64.rpm"
RPM_HASH = "328b666d19beaf978d3540876fd5bf0801cf0d7dfe81f7b5eee3b8f37f67b25480b4bfc8a6f6e33883b56ccccfdeb3ff4e68cce2f613f5a8ce577790c1b0606f"

RPROVIDES:${PN} += "kubernetes-etcd"

RDEPENDS:${PN} += "etcd-for-k8s1.37"

inherit rpm
