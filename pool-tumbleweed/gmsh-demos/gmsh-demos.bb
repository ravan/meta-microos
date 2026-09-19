SUMMARY = "A three-dimensional finite element mesh generator"
DESCRIPTION = "Gmsh is a 3D finite element grid generator with a build-in CAD engine \
and post-processor. \
 \
This package contains demos and tutorials."
LICENSE = "Apache-2.0 & GPL-2.0-or-later & (GPL-2.0-or-later | LGPL-3.0-or-later) & LGPL-2.1-or-later & MPL-2.0 & BSD-2-Clause & BSD-3-Clause & BSL-1.0 & CC0-1.0 & X11"

PV = "4.15.2"

RPM_NAME = "gmsh-demos-4.15.2-1.4.noarch.rpm"
RPM_HASH = "734173504f338ff473e8ac4c9cbaefc2ff4ad5f52e74177a13acfd90fcef8b8a58e29fc520d28bd99cb2a5d7c7a43645f3445fb2bad88f8664f45aa1d25df15f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gmsh-demos"

RDEPENDS:${PN} += ""

inherit rpm
