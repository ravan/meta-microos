SUMMARY = "Kubernetes etcd daemon for container images"
DESCRIPTION = "This subpackage contains the etcd binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "3.6.8"

RPM_NAME = "kubernetes-etcd-minus1-3.6.8-72.1.aarch64.rpm"
RPM_HASH = "94374591ca8cf517692a18b71237f1968c87161c37eaec81c6e9b35cc72d02016682ec3d394acee7f3a7868bca069bbcdad9928ec4ecb952e444e15266f131ab"

RPROVIDES:${PN} += "kubernetes-etcd-minus1"

RDEPENDS:${PN} += "etcd-for-k8s1.36"

inherit rpm
