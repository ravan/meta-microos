SUMMARY = "Kubernetes kubelet daemon"
DESCRIPTION = "Manage a cluster of Linux containers as a single system to accelerate Dev and simplify Ops. \
kubelet daemon (current version)"
LICENSE = "Apache-2.0"

PV = "1.36.4"

RPM_NAME = "kubernetes1.36-kubelet-1.36.4-2.1.aarch64.rpm"
RPM_HASH = "3c0e7387736051a48b14578366aec010dacaa3a54566545de75e39cccbbd832b12ae90a44ce2c1598db7c2eab84fe4dc1fd7010b11ccd45a5150e0a31065665f"

RPROVIDES:${PN} += "kubernetes-kubelet1.36 \
kubernetes1.36-kubelet"

RDEPENDS:${PN} += "cri-runtime \
kubernetes-kubelet-common \
libc.so.6 \
systemd"

inherit rpm
