SUMMARY = "Synchronization controller for kubevirt"
DESCRIPTION = "The virt-synchronization-controller package provides a controller for \
decentralized migration"
LICENSE = "Apache-2.0"

PV = "1.8.4"

RPM_NAME = "kubevirt1.8-virt-synchronization-controller-1.8.4-5.1.aarch64.rpm"
RPM_HASH = "f75cae4f18901d90f18f9626f45c31e0cf79c55e02083a62169248c64fab28ffdf537c1dadec44b0d88e0760bcf8ede106b1adbbed1c7cb7ffb38c4d5de8cf5b"

RPROVIDES:${PN} += "kubevirt-1.8-virt-synchronization-controller \
kubevirt-virt-synchronization-controller \
kubevirt1.8-virt-synchronization-controller"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
