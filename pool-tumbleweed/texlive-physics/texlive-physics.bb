SUMMARY = "Macros supporting the Mathematics of Physics"
DESCRIPTION = "The package defines simple and flexible macros for typesetting \
equations in the languages of vector calculus and linear \
algebra, using Dirac notation."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3svn74247"

RPM_NAME = "texlive-physics-2026.226.1.3svn74247-58.2.noarch.rpm"
RPM_HASH = "621a9343e2174ec71013a0ebf5a452e2b3a8fce3c686f0313f5a5edbd24db37b720410c03da8384489953551e40c26554724fc0a42c453df26b6877b229b04ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-physics.sty \
texlive-physics"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
