SUMMARY = "Kubernetes kubelet daemon"
DESCRIPTION = "Manage a cluster of Linux containers as a single system to accelerate Dev and simplify Ops. \
kubelet daemon"
LICENSE = "Apache-2.0"

PV = "1.37.0"

RPM_NAME = "kubernetes1.37-kubelet-common-1.37.0-1.1.aarch64.rpm"
RPM_HASH = "93b002ebc9c94d0ee23ba793ce00edec7db377450b2b8141caac6cc2eed3dbd5fd8a38be0ac3c5a77b598ecd5bbd2b48b1b22f1aeaa9124ef38a3a3076e1a896"

RPROVIDES:${PN} += "kubernetes-kubelet-common \
kubernetes1.37-kubelet-common"

RDEPENDS:${PN} += "/usr/bin/sh \
cri-runtime \
kubernetes-kubelet1.37"

inherit rpm
