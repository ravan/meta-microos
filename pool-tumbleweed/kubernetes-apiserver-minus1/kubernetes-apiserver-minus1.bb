SUMMARY = "Kubernetes apiserver for container image"
DESCRIPTION = "This subpackage contains the kube-apiserver binary for Kubic images"
LICENSE = "Apache-2.0"

PV = "1.36.4"

RPM_NAME = "kubernetes-apiserver-minus1-1.36.4-72.1.aarch64.rpm"
RPM_HASH = "ebda931512686a4f5442efd869495cc1e3530e5bc6e3fa3537683c2df6100461ed20f6e3bef956756582988caeaceaa4022a6cc7a00f74bea152f26fa71f1990"

RPROVIDES:${PN} += "kubernetes-apiserver-minus1"

RDEPENDS:${PN} += "kubernetes1.36-apiserver"

inherit rpm
