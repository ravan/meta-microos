SUMMARY = "Kubernetes client tools common files"
DESCRIPTION = "Kubernetes client tools common files"
LICENSE = "Apache-2.0"

PV = "1.34.11"

RPM_NAME = "kubernetes1.34-client-common-1.34.11-2.1.aarch64.rpm"
RPM_HASH = "b509171f301b7d4038b8e1e572f6a10e285979fbd93ad71c4a27fb93b4643408a3a7a5889bece7b9edc75661f6695a04e3713410936c2874f0fc3d7e433d9ab8"

RPROVIDES:${PN} += "kubernetes-client-common \
kubernetes1.34-client-common"

RDEPENDS:${PN} += "/usr/bin/sh \
kubernetes1.34-client"

inherit rpm
