SUMMARY = "Kubernetes client tools common files"
DESCRIPTION = "Kubernetes client tools common files"
LICENSE = "Apache-2.0"

PV = "1.35.8"

RPM_NAME = "kubernetes1.35-client-common-1.35.8-2.1.aarch64.rpm"
RPM_HASH = "bbec5bb7997a2a2aec1c06192ad8bc80ebab51d516b6ae5a65c3e7d3427399b3dbaa808e8ad35c029d011155b0f4781034386858b5601f0b83cb7456b6bb09b8"

RPROVIDES:${PN} += "kubernetes-client-common \
kubernetes1.35-client-common"

RDEPENDS:${PN} += "/usr/bin/sh \
kubernetes1.35-client"

inherit rpm
