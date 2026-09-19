SUMMARY = "Typeset business cards"
DESCRIPTION = "This is an adaption for current LaTeX of a LaTeX 2.09 style by \
Silvano Balemi. It produces cards at the normal US card size, \
76.2mm x 50.8mm."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.1svn15878"

RPM_NAME = "texlive-bizcard-2026.226.1.1svn15878-59.2.noarch.rpm"
RPM_HASH = "3947ff06f3029fc749a83249dbc67ed34d41ee03e77cbcdfb40b746b531d0031516badbabfeafd91f71eacfd6039fad3ad5630ac92e4d36c8b788bf75b3651a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bizcard.sty \
texlive-bizcard"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-geometry.sty \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
