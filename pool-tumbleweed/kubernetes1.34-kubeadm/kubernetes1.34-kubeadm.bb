SUMMARY = "Kubernetes kubeadm bootstrapping tool"
DESCRIPTION = "Manage a cluster of Linux containers as a single system to accelerate Dev and simplify Ops. \
kubeadm bootstrapping tool"
LICENSE = "Apache-2.0"

PV = "1.34.11"

RPM_NAME = "kubernetes1.34-kubeadm-1.34.11-2.1.aarch64.rpm"
RPM_HASH = "5623a5956b9b064ceea09d73e461fecfebb7697a3e2eba2b053b8078551df73a4a4c2b2fd1f80601384c1d288443a35dbc06d5432d49dc3260ef6b846378cc5b"

RPROVIDES:${PN} += "kubernetes-kubeadm-provider \
kubernetes1.34-kubeadm"

RDEPENDS:${PN} += "/usr/bin/sh \
cri-runtime \
cri-tools \
ebtables \
ethtool \
kubernetes-kubeadm-criconfig \
shadow \
socat"

inherit rpm
