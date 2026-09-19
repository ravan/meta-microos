SUMMARY = "Kubernetes kubeadm bootstrapping tool"
DESCRIPTION = "Manage a cluster of Linux containers as a single system to accelerate Dev and simplify Ops. \
kubeadm bootstrapping tool"
LICENSE = "Apache-2.0"

PV = "1.37.0"

RPM_NAME = "kubernetes-kubeadm-1.37.0-72.1.aarch64.rpm"
RPM_HASH = "e75fb3059a0b5b44f06d094196c36d9c0ce57277e0fcfdd360080328d90ecd4c3cb359da18a4da3bf728ea373c23d9fba952786810ea0e203813c35d330e6594"

RPROVIDES:${PN} += "kubernetes-kubeadm"

RDEPENDS:${PN} += "kubernetes1.36-kubelet \
kubernetes1.37-kubeadm \
kubernetes1.37-kubelet"

inherit rpm
