SUMMARY = "Sans serif blackboard bold"
DESCRIPTION = "A geometric sans serif blackboard bold font, for use in \
mathematics; Metafont sources are provided, as well as macros \
for use with LaTeX. The Sauter font package has Metafont \
parameter source files for building the fonts at more sizes \
than you could reasonably imagine. See the blackboard sampler \
for a feel for the font's appearance."
LICENSE = "BSD-3-Clause"

PV = "2026.226.1.01svn77682"

RPM_NAME = "texlive-bbold-2026.226.1.01svn77682-61.2.noarch.rpm"
RPM_HASH = "ef2b92e104ee71e13458814ca1d03a7c037fafc8a7278f9bd280beed7444a8d501e5b912d4b95c68384edcaa03ea6f51df07e3bce76edd9d9d71fe472fa12bed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-Ubbold.fd \
tex-bbold.sty \
tex-bbold10.tfm \
tex-bbold12.tfm \
tex-bbold17.tfm \
tex-bbold5.tfm \
tex-bbold6.tfm \
tex-bbold7.tfm \
tex-bbold8.tfm \
tex-bbold9.tfm \
texlive-bbold"

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
