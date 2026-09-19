SUMMARY = "Kubernetes kubelet daemon"
DESCRIPTION = "Manage a cluster of Linux containers as a single system to accelerate Dev and simplify Ops. \
kubelet daemon (current version)"
LICENSE = "Apache-2.0"

PV = "1.34.11"

RPM_NAME = "kubernetes1.34-kubelet-1.34.11-2.1.aarch64.rpm"
RPM_HASH = "12f5b52ab00058671811ec5a21e0163f331e69207e12be42e9ac4e7d5d8a05d33067dfdf7166c3ca4becacc4f15d018ee3d2a8e2f742e40ad2baef460a38716e"

RPROVIDES:${PN} += "kubernetes-kubelet1.34 \
kubernetes1.34-kubelet"

RDEPENDS:${PN} += "cri-runtime \
kubernetes-kubelet-common \
libc.so.6 \
systemd"

inherit rpm
