SUMMARY = "Kubernetes client tools common files"
DESCRIPTION = "Kubernetes client tools common files"
LICENSE = "Apache-2.0"

PV = "1.37.0"

RPM_NAME = "kubernetes1.37-client-common-1.37.0-1.1.aarch64.rpm"
RPM_HASH = "2dfdea40f5ec8ae69d074dfb30582a35c3d8d33f954cac4773e7a9b8c4f21f627f71cd98aa4c7e0d2d243f49071772cf4457fedb3700e8a05e2bd14aaeb20399"

RPROVIDES:${PN} += "kubernetes-client-common \
kubernetes1.37-client-common"

RDEPENDS:${PN} += "/usr/bin/sh \
kubernetes1.37-client"

inherit rpm
