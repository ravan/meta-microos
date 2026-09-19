SUMMARY = "Kubernetes kubelet daemon"
DESCRIPTION = "Manage a cluster of Linux containers as a single system to accelerate Dev and simplify Ops. \
kubelet daemon"
LICENSE = "Apache-2.0"

PV = "1.36.4"

RPM_NAME = "kubernetes1.36-kubelet-common-1.36.4-2.1.aarch64.rpm"
RPM_HASH = "5919d65a81296de0ee3d127c59840e5971d65848da56ec601b4dfed72508a98e78fc8a986b34d35e38d1a2aac2ee2a153dbfbc5b0c3f7ff1eeeb3c2501cbf4e6"

RPROVIDES:${PN} += "kubernetes-kubelet-common \
kubernetes1.36-kubelet-common"

RDEPENDS:${PN} += "/usr/bin/sh \
cri-runtime \
kubernetes-kubelet1.36"

inherit rpm
