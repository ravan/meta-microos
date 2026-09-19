SUMMARY = "Kubernetes kubeadm bootstrapping tool"
DESCRIPTION = "Manage a cluster of Linux containers as a single system to accelerate Dev and simplify Ops. \
kubeadm bootstrapping tool"
LICENSE = "Apache-2.0"

PV = "1.35.8"

RPM_NAME = "kubernetes1.35-kubeadm-1.35.8-2.1.aarch64.rpm"
RPM_HASH = "d4e3487337a95cab8718afd810e720f2d282909b33a06e2a47842843329332b4f2defa4cfd80343cc22b5ab7214f456ba61f673a80e4df9804734996b9ab3a6e"

RPROVIDES:${PN} += "kubernetes-kubeadm-provider \
kubernetes1.35-kubeadm"

RDEPENDS:${PN} += "/usr/bin/sh \
cri-runtime \
cri-tools \
ebtables \
ethtool \
kubernetes-kubeadm-criconfig \
shadow \
socat"

inherit rpm
