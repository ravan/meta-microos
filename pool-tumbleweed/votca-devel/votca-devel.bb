SUMMARY = "Development headers and libraries for votca"
DESCRIPTION = " \
VOTCA is a software package which focuses on the analysis of molecular \
dynamics data, the development of systematic coarse-graining techniques as \
well as methods used for simulating microscopic charge (and exciton) transport \
in disordered semiconductors. \
 \
This package contains development headers and libraries for votca."
LICENSE = "Apache-2.0"

PV = "2026"

RPM_NAME = "votca-devel-2026-1.7.aarch64.rpm"
RPM_HASH = "eb77464fac4ddd221a626c7ae587651a29b879410f0e9b63b26230cb5ab80e36581009855fcffae310a7915e482e4f63134eb58a6f2cdd82f631f59e5522ac07"

RPROVIDES:${PN} += "cmake-VOTCA-CSG \
cmake-VOTCA-TOOLS \
cmake-VOTCA-XTP \
votca-csg-devel \
votca-devel \
votca-tools-devel \
votca-xtp-devel"

RDEPENDS:${PN} += "eigen3-devel \
fftw3-devel \
libexpat-devel \
libvotca2026 \
votca"

inherit rpm
