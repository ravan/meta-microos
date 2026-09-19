SUMMARY = "Typesetting VDM in ASCII syntax"
DESCRIPTION = "The package is an extension for the listings package that \
provides a source code printer for LaTeX. This package defines \
new language definitions and listing environments for the three \
language dialects of the Vienna Development Method: VDM-SL, \
VDM-PP and VDM-RT. If one wants to typeset VDM with a \
mathematical syntax instead of the ASCII syntax used here one \
should use the vdm package instead"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn56905"

RPM_NAME = "texlive-vdmlisting-2026.226.1.1svn56905-60.2.noarch.rpm"
RPM_HASH = "ba208310140dbf92027d8ab1a01f4c5ee3ee640374b03733bae1d552edc1dd336e135a33bfc7a0b18fc3168e9cae37f8f2a1cfebf8f5a94e0d4697d3ce4d7744"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-vdmlisting.sty \
texlive-vdmlisting"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
tex-listings.sty \
tex-times.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
