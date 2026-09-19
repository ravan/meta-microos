SUMMARY = "Kubernetes kubelet daemon"
DESCRIPTION = "Manage a cluster of Linux containers as a single system to accelerate Dev and simplify Ops. \
kubelet daemon"
LICENSE = "Apache-2.0"

PV = "1.37.0"

RPM_NAME = "kubernetes-kubelet-1.37.0-72.1.aarch64.rpm"
RPM_HASH = "434eb76c699116b74a97de9416c7704d12ed89ad8b69de13af5c85dd6be9bbd8db95ec7f4b479b6ad87d3b0315395e49d2e3e445d75b7c30fd5255fe593279d1"

RPROVIDES:${PN} += "kubernetes-kubelet"

RDEPENDS:${PN} += "kubernetes1.37-kubelet"

inherit rpm
