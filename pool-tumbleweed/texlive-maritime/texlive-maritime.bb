SUMMARY = "International maritime signal flags using TikZ"
DESCRIPTION = "This package provides LaTeX commands for drawing international \
maritime signal flags using TikZ (A-Z, NATO 0-9)."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn74037"

RPM_NAME = "texlive-maritime-2026.226.1.0svn74037-59.2.noarch.rpm"
RPM_HASH = "1e4a120bac38919589a52ca3c379ab1fedcfcc1ecd69d6b1f1a013d37d5dff900acf4dc2bce2e66c444a4a6beea1ee1f72f6ea0bca64717a45fab011a1b9378e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-maritime.sty \
texlive-maritime"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etex.sty \
tex-graphicx.sty \
tex-tikz.sty \
tex-xcolor.sty \
tex-xkeyval.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
