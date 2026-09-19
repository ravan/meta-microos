SUMMARY = "Kubernetes kubelet daemon"
DESCRIPTION = "Manage a cluster of Linux containers as a single system to accelerate Dev and simplify Ops. \
kubelet daemon"
LICENSE = "Apache-2.0"

PV = "1.34.11"

RPM_NAME = "kubernetes1.34-kubelet-common-1.34.11-2.1.aarch64.rpm"
RPM_HASH = "95c8fe27e09b687e3f85f790cd8fe01c0c6b732221ccc1acdd05fc76e6163dfcb5eb70b6b6a8c5635c7297d240e0e3b533587d9f10592adcfa015a22d9faa352"

RPROVIDES:${PN} += "kubernetes-kubelet-common \
kubernetes1.34-kubelet-common"

RDEPENDS:${PN} += "/usr/bin/sh \
cri-runtime \
kubernetes-kubelet1.34"

inherit rpm
