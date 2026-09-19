SUMMARY = "Custom extensible arrows over math expressions"
DESCRIPTION = "A LaTeX package to create custom arrows over math expressions, \
mainly for vectors (but arrows can as well be drawn below). \
Arrows stretch with content, scale with math styles, and have a \
correct kerning when a subscript follows. Some predefined \
commands are also provided."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.5svn76641"

RPM_NAME = "texlive-overarrows-2026.226.1.5svn76641-61.2.noarch.rpm"
RPM_HASH = "74782bff8580cb11bfa51694060ee517fbd35b381dcba24d27425ba65f94220ca4c24e60e73feaecc14d822fae30cc0b462536890d7a101bbcacca6a75b1ac4e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-overarrows.sty \
texlive-overarrows"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-esvect.sty \
tex-etoolbox.sty \
tex-old-arrows.sty \
tex-pgfkeys.sty \
tex-pict2e.sty \
tex-pstricks-add.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
