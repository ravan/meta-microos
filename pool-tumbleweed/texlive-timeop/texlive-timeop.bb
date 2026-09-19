SUMMARY = "Calculates and displays arithmetic operations with durations"
DESCRIPTION = "This package can be used to add and subtract time information."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1.1svn75112"

RPM_NAME = "texlive-timeop-2026.226.0.0.1.1svn75112-59.2.noarch.rpm"
RPM_HASH = "75ccbcb0945079fe6e63087d69cd88e9a70305bb83f045d2f348b9957d40b9aae79917f856df0d8bc4faee0b4578c6b0149c0a4ec7a2b0ac45cf070b38353efd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-timeop.sty \
texlive-timeop"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-listofitems.sty \
tex-simplekv.sty \
tex-tabularray.sty \
tex-tcolorbox.sty \
tex-xintexpr.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
