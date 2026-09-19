SUMMARY = "Macros for openMPI version 4.1.8"
DESCRIPTION = "Macros for building RPM packages for OpenMPI version 4.1.8."
LICENSE = "BSD-3-Clause"

PV = "4.1.8"

RPM_NAME = "openmpi4-macros-devel-4.1.8-4.7.aarch64.rpm"
RPM_HASH = "bcbba52704578e68e695d39088ab6a685236d41bc22034aeb38e114dc287d646099972a2d9b1d551907ba98d05149b07260ef579e7c5bce14a34ab076a94a615"

RPROVIDES:${PN} += "openmpi-macros-provider \
openmpi4-macros-devel \
rpm-macro-openmpi-devel-requires \
rpm-macro-openmpi-prefix \
rpm-macro-openmpi-requires \
rpm-macro-setup-openmpi"

RDEPENDS:${PN} += "openmpi4-devel"

inherit rpm
