SUMMARY = "Finite-state C library development files and headers"
DESCRIPTION = "Finite-state C library development files and headers for foma."
LICENSE = "Apache-2.0"

PV = "0.10.0+git22"

RPM_NAME = "foma-devel-0.10.0+git22-1.9.aarch64.rpm"
RPM_HASH = "7331eda7ba60119b558092665d9e9fdc9bc5b56d315853ff7d0105926e73ac0ec38e58d6b010910ab4a765ddc359b2f969db618c532ef75745aa4c9ab2d24b09"

RPROVIDES:${PN} += "foma-devel \
pkgconfig-libfoma"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfoma0"

inherit rpm
