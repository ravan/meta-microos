SUMMARY = "Development files for the libpgf library"
DESCRIPTION = "This package contains header files and libraries needed for developing programs \
using the libpgf library."
LICENSE = "LGPL-2.1-or-later"

PV = "7.21.7"

RPM_NAME = "libpgf-devel-7.21.7-1.21.aarch64.rpm"
RPM_HASH = "6060cc0854b6bc12ad3f7a2957bcee392bc299fc4216877d71af4cf04f1af524e018bff59d4c2829e0016fa387956152e0d09d1d9c30fda89b3d4bd87ea27faa"

RPROVIDES:${PN} += "libpgf-devel \
pkgconfig-libpgf"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpgf7"

inherit rpm
