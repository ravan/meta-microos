SUMMARY = "GAP: Finite Incidence Geometry"
DESCRIPTION = "FinInG is a package for computation in Finite Incidence Geometry. It \
provides users with the basic tools to work in various areas of \
finite geometry from the realms of projective spaces to the flat \
lands of generalised polygons. The algebraic power of GAP is \
employed, particularly in its facility with matrix and permutation \
groups."
LICENSE = "GPL-2.0-or-later"

PV = "1.5.6"

RPM_NAME = "gap-fining-1.5.6-1.9.noarch.rpm"
RPM_HASH = "f440a1b7960b9befaca16a0f82acce478e22e0fe2497a873ffb10b5571c67da6fd09b5ca029826d951b30d8de4049516a4ba477280393381aad5ff60134b09a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gap-fining"

RDEPENDS:${PN} += "/usr/bin/sh \
gap-core \
gap-cvec \
gap-forms \
gap-gapdoc \
gap-genss \
gap-grape \
gap-orb"

inherit rpm
