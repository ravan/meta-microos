SUMMARY = "Kubernetes kubeadm bootstrapping tool"
DESCRIPTION = "Manage a cluster of Linux containers as a single system to accelerate Dev and simplify Ops. \
kubeadm bootstrapping tool"
LICENSE = "Apache-2.0"

PV = "1.36.4"

RPM_NAME = "kubernetes1.36-kubeadm-1.36.4-2.1.aarch64.rpm"
RPM_HASH = "920462bb1d433585e8d9e2bd2bf17598162b5ff06c54547a6188189a75c2adc0fcd26bc87daac6a032d496a546d48df630533cc3b55d7e1febdf05222dfc7dcc"

RPROVIDES:${PN} += "kubernetes-kubeadm-provider \
kubernetes1.36-kubeadm"

RDEPENDS:${PN} += "/usr/bin/sh \
cri-runtime \
cri-tools \
ebtables \
ethtool \
kubernetes-kubeadm-criconfig \
shadow \
socat"

inherit rpm
