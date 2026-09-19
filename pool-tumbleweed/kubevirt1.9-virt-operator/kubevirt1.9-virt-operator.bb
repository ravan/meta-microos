SUMMARY = "Operator component for kubevirt"
DESCRIPTION = "The virt-opertor package provides an operator for kubevirt CRD"
LICENSE = "Apache-2.0"

PV = "1.9.0"

RPM_NAME = "kubevirt1.9-virt-operator-1.9.0-3.1.aarch64.rpm"
RPM_HASH = "eadad015a542772d5f0e8773de2f9daf770064d83ec5b8804fd77dd5949d675b4f3d0d274d18b1e43e48ab567c7e78d5becc6ae6ae32d2c572665b576ab926eb"

RPROVIDES:${PN} += "kubevirt-virt-operator \
kubevirt1.9-virt-operator"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
