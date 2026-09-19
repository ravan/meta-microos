SUMMARY = "Kubernetes client tools common files"
DESCRIPTION = "Kubernetes client tools common files"
LICENSE = "Apache-2.0"

PV = "1.36.4"

RPM_NAME = "kubernetes1.36-client-common-1.36.4-2.1.aarch64.rpm"
RPM_HASH = "0ad23686a1aff4af9e26ef6ea984222ed455f79b2499ff80d126d96976906b4fe01e2d220f6e77f410738fad4dd6240aa8edcbbca514fc82f4e55cc7ce0d5f07"

RPROVIDES:${PN} += "kubernetes-client-common \
kubernetes1.36-client-common"

RDEPENDS:${PN} += "/usr/bin/sh \
kubernetes1.36-client"

inherit rpm
