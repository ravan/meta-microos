SUMMARY = "CRI-O container runtime configuration for kubeadm"
DESCRIPTION = "This package provides the CRI-O container runtime configuration for kubeadm"
LICENSE = "Apache-2.0"

PV = "1.24.3"

RPM_NAME = "cri-o-kubeadm-criconfig-1.24.3-2.17.aarch64.rpm"
RPM_HASH = "a26fbfa430282eca4f7d59df9d0e83a27298290b18c9bb7e5ef208ac45ad825318c7c9f6469e6e33b6ca4becdd68b5eb1b6acc4895452b7015e75e705ebad1de"

RPROVIDES:${PN} += "cri-o-kubeadm-criconfig \
kubernetes-kubeadm-criconfig"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
kubernetes-kubeadm-provider"

inherit rpm
