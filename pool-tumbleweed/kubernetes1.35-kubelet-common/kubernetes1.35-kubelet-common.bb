SUMMARY = "Kubernetes kubelet daemon"
DESCRIPTION = "Manage a cluster of Linux containers as a single system to accelerate Dev and simplify Ops. \
kubelet daemon"
LICENSE = "Apache-2.0"

PV = "1.35.8"

RPM_NAME = "kubernetes1.35-kubelet-common-1.35.8-2.1.aarch64.rpm"
RPM_HASH = "a4142cc4164fa539d5af72acbb6b1ed794a4870f8cb8daf56ad8b0fb06f8c9370819b8b67c1618d732d9739de2240fd88bede018c52db821e2577044e90f9318"

RPROVIDES:${PN} += "kubernetes-kubelet-common \
kubernetes1.35-kubelet-common"

RDEPENDS:${PN} += "/usr/bin/sh \
cri-runtime \
kubernetes-kubelet1.35"

inherit rpm
