SUMMARY = "Kubevirt API server"
DESCRIPTION = "The virt-api package provides the kubernetes API extension for kubevirt"
LICENSE = "Apache-2.0"

PV = "1.8.4"

RPM_NAME = "kubevirt1.8-virt-api-1.8.4-5.1.aarch64.rpm"
RPM_HASH = "e8214b4bb4eeca64dfbbb442b86a24c0469e2b89bf4aa42a1532d9072a86de010f39a3bb44a7e4940b6a83fb15587c18717d22dddca62f8fc77946a4143e1878"

RPROVIDES:${PN} += "kubevirt-1.8-virt-api \
kubevirt-virt-api \
kubevirt1.8-virt-api"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
