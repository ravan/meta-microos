SUMMARY = "Molecular dynamics package"
DESCRIPTION = "GROMACS is a package to perform molecular dynamics computer \
simulations. \
 \
This package contains development libraries and header for GROMACS"
LICENSE = "Apache-2.0 & LGPL-2.1-or-later & BSD-3-Clause"

PV = "2026.1"

RPM_NAME = "gromacs-devel-2026.1-2.1.aarch64.rpm"
RPM_HASH = "7568551bbfab46dbe19d3b7d6a2b8cc439d9c6ac5a7755d151d9d53c6da9f36b52f76fb51ee6794fe649cd23525623242d7ed08faf4cbcfb40385669faf24256"

RPROVIDES:${PN} += "cmake-gmxapi \
cmake-gromacs \
gromacs-devel \
pkgconfig-libgromacs"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gromacs \
libgmxapi0 \
libgromacs11 \
libnblib-gmx0 \
pkgconfig-fftw3f"

inherit rpm
