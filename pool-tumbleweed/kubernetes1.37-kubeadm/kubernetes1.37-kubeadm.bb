SUMMARY = "Kubernetes kubeadm bootstrapping tool"
DESCRIPTION = "Manage a cluster of Linux containers as a single system to accelerate Dev and simplify Ops. \
kubeadm bootstrapping tool"
LICENSE = "Apache-2.0"

PV = "1.37.0"

RPM_NAME = "kubernetes1.37-kubeadm-1.37.0-1.1.aarch64.rpm"
RPM_HASH = "f326b1166a52b0de0e027bb139eab234cdfe5eaef216c79aaba45d5bb2343c8e631ff4db581dd6c14aaeee42972a69f5cf27a7ad62f664bf7a87d2645eed8222"

RPROVIDES:${PN} += "kubernetes-kubeadm-provider \
kubernetes1.37-kubeadm"

RDEPENDS:${PN} += "/usr/bin/sh \
cri-runtime \
cri-tools \
ebtables \
ethtool \
kubernetes-kubeadm-criconfig \
shadow \
socat"

inherit rpm
