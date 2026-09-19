SUMMARY = "MetaPost macros for 3D"
DESCRIPTION = "These macros allow the production of three-dimensional schemes \
containing: angles, circles, cylinders, cones and spheres, \
among other things."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.8.8svn35346"

RPM_NAME = "texlive-featpost-2026.226.0.0.8.8svn35346-59.2.noarch.rpm"
RPM_HASH = "4efa10c85e2ffb3c90d149c06748c3c5d187c32612b1cee29d6eca7a1cd34f96df953bb253ebf747b81f773b33c7c6bf50a8b6d69aa29c14a5222f3d652c88b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-featpost"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
