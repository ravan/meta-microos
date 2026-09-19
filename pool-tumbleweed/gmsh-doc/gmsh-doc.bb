SUMMARY = "A three-dimensional finite element mesh generator"
DESCRIPTION = "Gmsh is a 3D finite element grid generator with a build-in CAD engine \
and post-processor. \
 \
This package contains the documentation for gmsh."
LICENSE = "Apache-2.0 & GPL-2.0-or-later & (GPL-2.0-or-later | LGPL-3.0-or-later) & LGPL-2.1-or-later & MPL-2.0 & BSD-2-Clause & BSD-3-Clause & BSL-1.0 & CC0-1.0 & X11"

PV = "4.15.2"

RPM_NAME = "gmsh-doc-4.15.2-1.4.noarch.rpm"
RPM_HASH = "0f934c3fc890002de15518b70befa986db446b11a170417ee7668dfbe910794ec50d84afd1e68097f406da0ef7e472bfa405624295b3a4ce5aec83776eab8f00"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gmsh-doc"

RDEPENDS:${PN} += ""

inherit rpm
