SUMMARY = "A three-dimensional finite element mesh generator"
DESCRIPTION = "Gmsh is a 3D finite element grid generator with a build-in CAD engine \
and post-processor."
LICENSE = "Apache-2.0 & GPL-2.0-or-later & (GPL-2.0-or-later | LGPL-3.0-or-later) & LGPL-2.1-or-later & MPL-2.0 & BSD-2-Clause & BSD-3-Clause & BSL-1.0 & CC0-1.0 & X11"

PV = "4.15.2"

RPM_NAME = "gmsh-4.15.2-1.4.aarch64.rpm"
RPM_HASH = "8cdd47e3b0d7fd7374f05ed5c9efc2b0f1ad6756c50fa398925ed9538d98931b4eba4f37d902296e38211ecc17998f3f9cac7046fe0c35d199fcd300eedd46c4"

RPROVIDES:${PN} += "gmsh"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
libc.so.6 \
libgmsh.so.4.15"

inherit rpm
