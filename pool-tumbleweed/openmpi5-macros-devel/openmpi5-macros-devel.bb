SUMMARY = "Macros for openMPI version 5.0.10"
DESCRIPTION = "Macros for building RPM packages for OpenMPI version 5.0.10."
LICENSE = "BSD-3-Clause"

PV = "5.0.10"

RPM_NAME = "openmpi5-macros-devel-5.0.10-2.2.aarch64.rpm"
RPM_HASH = "c5c31b77786df06fb20bff83379ad01d25c7870f21ca41f5d469d935fcba2b76f118b12e70a481a4b2eb4585894f1443c416f35a4cee4fac1e565a32448506fd"

RPROVIDES:${PN} += "openmpi-macros-devel \
openmpi-macros-provider \
openmpi5-macros-devel \
rpm-macro-openmpi-devel-requires \
rpm-macro-openmpi-prefix \
rpm-macro-openmpi-requires \
rpm-macro-setup-openmpi"

RDEPENDS:${PN} += "openmpi5-devel"

inherit rpm
