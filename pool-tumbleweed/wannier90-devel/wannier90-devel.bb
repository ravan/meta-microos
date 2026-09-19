SUMMARY = "Library for generating Wannier functions - headers and development files"
DESCRIPTION = "Wannier90 is a library for generating maximally-localized Wannier functions and \
using them to compute advanced electronic properties of materials with high \
efficiency and accuracy. \
 \
This package provides files needed for developing against wannier90."
LICENSE = "LGPL-2.1-or-later"

PV = "4.0.2"

RPM_NAME = "wannier90-devel-4.0.2-1.1.aarch64.rpm"
RPM_HASH = "a32491132b5123d1ba20e768f78d88a4e0273a2c4b92f493e3fcea8d4131b0887c84339d3be96d60bc04d37a1e112d07331d21323022838e98fb5486382507f0"

RPROVIDES:${PN} += "cmake-Wannier90 \
pkgconfig-wannier90 \
wannier90-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
