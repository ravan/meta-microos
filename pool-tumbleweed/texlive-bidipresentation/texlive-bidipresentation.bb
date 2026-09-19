SUMMARY = "Experimental bidi presentation"
DESCRIPTION = "A great portion of the code is borrowed from the texpower \
bundle, with modifications to get things working properly in \
both right to left and left to right modes."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3svn35267"

RPM_NAME = "texlive-bidipresentation-2026.226.0.0.3svn35267-61.2.noarch.rpm"
RPM_HASH = "de8f0137acc46fb28be4bd44b7e54c9c134dc2d16471694b376989356ab4bec94e82c3ca7058eaa64e5b5a8e44bf4168a06645e969170d1b7fff38bb058b759c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bidiprescolors.cfg \
tex-bidipresentation.cls \
texlive-bidipresentation"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-calc.sty \
tex-color.sty \
tex-fancyhdr.sty \
tex-geometry.sty \
tex-hyperref.sty \
tex-ifthen.sty \
tex-keyval.sty \
tex-scrlfile.sty \
tex-xecolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
