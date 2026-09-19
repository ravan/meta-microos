SUMMARY = "A three-dimensional finite element mesh generator"
DESCRIPTION = "Gmsh is a 3D finite element grid generator with a build-in CAD engine \
and post-processor. \
 \
This package contains the header files needed for development."
LICENSE = "Apache-2.0 & GPL-2.0-or-later & (GPL-2.0-or-later | LGPL-3.0-or-later) & LGPL-2.1-or-later & MPL-2.0 & BSD-2-Clause & BSD-3-Clause & BSL-1.0 & CC0-1.0 & X11"

PV = "4.15.2"

RPM_NAME = "gmsh-devel-4.15.2-1.4.aarch64.rpm"
RPM_HASH = "53c8d5c55acb4be2ee9bdf0bde1bc949c9604f89ead9babbaac98769f1228a5eaf192a4f3bc83d578f30d580e31a4b1cfb220e655833f62d5b16499c83d3ef0f"

RPROVIDES:${PN} += "gmsh-devel"

RDEPENDS:${PN} += "libgmsh4-15"

inherit rpm
