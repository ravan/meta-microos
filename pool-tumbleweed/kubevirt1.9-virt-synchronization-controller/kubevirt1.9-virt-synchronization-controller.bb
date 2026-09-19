SUMMARY = "Synchronization controller for kubevirt"
DESCRIPTION = "The virt-synchronization-controller package provides a controller for \
decentralized migration"
LICENSE = "Apache-2.0"

PV = "1.9.0"

RPM_NAME = "kubevirt1.9-virt-synchronization-controller-1.9.0-3.1.aarch64.rpm"
RPM_HASH = "28efc3a48e8cac4ec519790279a3d6d0865458b1874643bdb69cb90e8eb2b2a895ac074f709d6b4455a63176efb6167f559341f3c531ee1a6824c9c857898c88"

RPROVIDES:${PN} += "kubevirt-virt-synchronization-controller \
kubevirt1.9-virt-synchronization-controller"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
