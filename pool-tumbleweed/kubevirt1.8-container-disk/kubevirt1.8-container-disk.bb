SUMMARY = "Container disk for kubevirt"
DESCRIPTION = "The containter-disk package provides a container disk functionality for kubevirt"
LICENSE = "Apache-2.0"

PV = "1.8.4"

RPM_NAME = "kubevirt1.8-container-disk-1.8.4-5.1.aarch64.rpm"
RPM_HASH = "37e320be3e8dbb9d3566c02d3a0bb7b7036ff4d2e4fcdac32cc42b8dcd4cafe3fee8fd06aa7501bcfd050c319cb76705444d8f990c059f3771fcddf69d4c6b18"

RPROVIDES:${PN} += "kubevirt-1.8-container-disk \
kubevirt-container-disk \
kubevirt1.8-container-disk"

RDEPENDS:${PN} += ""

inherit rpm
