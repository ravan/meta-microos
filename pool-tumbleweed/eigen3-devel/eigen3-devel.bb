SUMMARY = "C++ Template Library for Linear Algebra"
DESCRIPTION = "Eigen is a C++ template library for linear algebra: matrices, vectors, \
numerical solvers, and related algorithms."
LICENSE = "BSD-3-Clause & LGPL-2.1-only & MPL-2.0 & LGPL-2.1-or-later"

PV = "5.0.1"

RPM_NAME = "eigen3-devel-5.0.1-1.3.noarch.rpm"
RPM_HASH = "00fde249030a4c13737a281da6e520f8e4af4e33673988881ce1aac1569ff905c7581f870e0a6c185b84295b0072dfbc70d3aec35aec94f827b6971a7918fce5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "eigen3-devel \
libeigen3-devel \
pkgconfig-eigen3"

RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
