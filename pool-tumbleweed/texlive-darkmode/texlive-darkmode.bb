SUMMARY = "General Dark Mode Support for LaTeX-Documents"
DESCRIPTION = "This package provides an API for template and package \
developers to create dynamic color schemes for light- and \
darkmodes. For those unaware: We refer to dark mode when a \
document has a dark background with a light font and to light \
mode if it has a dark font with a light background."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.1svn76924"

RPM_NAME = "texlive-darkmode-2026.226.1.0.1svn76924-61.2.noarch.rpm"
RPM_HASH = "d2163639e51a473aa1b7910e6cac291ea811af5856b2e47bdee2fbb92f183c3feeb87c1e33aded31bc2e2ee89383db771c05d3ef300e9ab4d37dcbcd688a64ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-darkmode.sty \
texlive-darkmode"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-l3keys2e.sty \
tex-pagecolor.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
