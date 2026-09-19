SUMMARY = "Handler component for kubevirt"
DESCRIPTION = "The virt-handler package provides a handler for kubevirt"
LICENSE = "Apache-2.0"

PV = "1.8.4"

RPM_NAME = "kubevirt1.8-virt-handler-1.8.4-5.1.aarch64.rpm"
RPM_HASH = "f59ff92c7b2fdf72752a735adfd35b37b52c2b90657d08c2cb3d7562525ce11fb2c6053fca262fbff93a0123c5ea5e5d85fbc1b2d99d4eb6e2e56894cc404cfb"

RPROVIDES:${PN} += "kubevirt-1.8-virt-handler \
kubevirt-virt-handler \
kubevirt1.8-virt-handler"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
