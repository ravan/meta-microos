SUMMARY = "Controller for kubevirt"
DESCRIPTION = "The virt-controller package provides a controller for kubevirt"
LICENSE = "Apache-2.0"

PV = "1.9.0"

RPM_NAME = "kubevirt1.9-virt-controller-1.9.0-3.1.aarch64.rpm"
RPM_HASH = "ea14c90a2ca64edd638ef17fde230f5d3491a0b41c17cfa51d78b4b37028490fe0bdb5d8a3fa112f637c67f20510a68d11e50d4a257d7d2348e0ff463cff1553"

RPROVIDES:${PN} += "kubevirt-virt-controller \
kubevirt1.9-virt-controller"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
