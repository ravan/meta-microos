SUMMARY = "Horizontal banners in a puzzle style"
DESCRIPTION = "With this package it is possible to create a horizontal banner \
in the form of a puzzle. There are some predefined themes."
LICENSE = "LPPL-1.0"

PV = "2026.227.0.0.1.3svn75984"

RPM_NAME = "texlive-thematicpuzzle-2026.227.0.0.1.3svn75984-62.2.noarch.rpm"
RPM_HASH = "e87391c1d68ba1e4f311d019d85541de2e1c64c2e29578c3e65f9462b52c56ce9e54734daf6c4d59a899fae6302841e5028f37c6d22dc9c1f9ffb1abfbaaf4b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-thematicpuzzle.sty \
texlive-thematicpuzzle"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fontawesome5.sty \
tex-fontawesome6.sty \
tex-fontawesome7.sty \
tex-listofitems.sty \
tex-simplekv.sty \
tex-tikz.sty \
tex-xintexpr.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
