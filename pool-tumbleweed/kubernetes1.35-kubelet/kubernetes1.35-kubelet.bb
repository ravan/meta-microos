SUMMARY = "Kubernetes kubelet daemon"
DESCRIPTION = "Manage a cluster of Linux containers as a single system to accelerate Dev and simplify Ops. \
kubelet daemon (current version)"
LICENSE = "Apache-2.0"

PV = "1.35.8"

RPM_NAME = "kubernetes1.35-kubelet-1.35.8-2.1.aarch64.rpm"
RPM_HASH = "63f557f41c13370d17ec2be6aee8367285c877575ed7f2628255f75199de0eae057fcfc1a67e5e9ad473c6bba7d142a4a06a473fcc0f51c71de7cf2459de7bfb"

RPROVIDES:${PN} += "kubernetes-kubelet1.35 \
kubernetes1.35-kubelet"

RDEPENDS:${PN} += "cri-runtime \
kubernetes-kubelet-common \
libc.so.6 \
systemd"

inherit rpm
