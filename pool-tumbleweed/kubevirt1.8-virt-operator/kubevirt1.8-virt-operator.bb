SUMMARY = "Operator component for kubevirt"
DESCRIPTION = "The virt-opertor package provides an operator for kubevirt CRD"
LICENSE = "Apache-2.0"

PV = "1.8.4"

RPM_NAME = "kubevirt1.8-virt-operator-1.8.4-5.1.aarch64.rpm"
RPM_HASH = "91b15efde46f9ddcdcd9a8b14fe9d9f3f39463fa65ef9e227d81fd500cdedaaae22583918623d00f7ad411a393415642570385fe669ae5964cd6294c1e863344"

RPROVIDES:${PN} += "kubevirt-1.8-virt-operator \
kubevirt-virt-operator \
kubevirt1.8-virt-operator"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
