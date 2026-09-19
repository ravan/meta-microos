SUMMARY = "Kubevirt API server"
DESCRIPTION = "The virt-api package provides the kubernetes API extension for kubevirt"
LICENSE = "Apache-2.0"

PV = "1.9.0"

RPM_NAME = "kubevirt1.9-virt-api-1.9.0-3.1.aarch64.rpm"
RPM_HASH = "fd5f171f9264b3669bbfaff77564671d7e9f708fe276eb9956b209be1e034ff57c2e31bac92df1c45ece2008365801cae7df81e64ee61ddbb9a91b1e6dd540de"

RPROVIDES:${PN} += "kubevirt-virt-api \
kubevirt1.9-virt-api"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
