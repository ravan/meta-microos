SUMMARY = "Kubernetes kubelet daemon"
DESCRIPTION = "Manage a cluster of Linux containers as a single system to accelerate Dev and simplify Ops. \
kubelet daemon (current version)"
LICENSE = "Apache-2.0"

PV = "1.37.0"

RPM_NAME = "kubernetes1.37-kubelet-1.37.0-1.1.aarch64.rpm"
RPM_HASH = "1d1e409c06e3b4876872974daf7440122d82fd6bdf39d944b3c01fc37e305ff9d28dde72a74f19856d554c349f29f3a2d83930265acacc398d437e9bdb3108e5"

RPROVIDES:${PN} += "kubernetes-kubelet1.37 \
kubernetes1.37-kubelet"

RDEPENDS:${PN} += "cri-runtime \
kubernetes-kubelet-common \
libc.so.6 \
systemd"

inherit rpm
