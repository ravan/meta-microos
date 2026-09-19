SUMMARY = "GAP: Homological Algebra Programming"
DESCRIPTION = "'HAP' is a package for some basic calculations in the cohomology of \
finite and infinite groups."
LICENSE = "GPL-2.0-or-later"

PV = "1.79"

RPM_NAME = "gap-hap-1.79-1.1.noarch.rpm"
RPM_HASH = "7754b416f2a96821649d720cfad04f5e60d5269c908265bf7a6ea6dfcb4d6fd944748da1e3f5b1d54feb4eb4526a728c6cf3a0f04cbdd10c8e31a7a60dd55498"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gap-hap"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
ImageMagick \
gap-aclib \
gap-core \
gap-crystcat \
gap-fga \
gap-nq \
gap-polycyclic \
gap-polymaking \
graphviz \
polymake \
singular"

inherit rpm
