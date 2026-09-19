SUMMARY = "Print Tibetan text in the classic pecha layout style"
DESCRIPTION = "The pecha class provides an environment for writing Tibetan on \
LaTeX2e in the traditional Tibetan Pecha layout used for \
spiritual or philosophical texts, using the cTib4TeX package by \
Oliver Corff. It provides features like headers in different \
languages, page numbering in Tibetan and more."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.1svn15878"

RPM_NAME = "texlive-pecha-2026.226.0.0.1svn15878-58.2.noarch.rpm"
RPM_HASH = "16920eeffe341e01f00aa17fcc78403da9f2c9544d8745adf62bb042016f6cc869d8a9bef9cacaffd6a35bfc5a63b3d10ae11c4338255f866f5e2224c76d2415"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ctibmantra.sty \
tex-pecha.cls \
texlive-pecha"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-ctib.sty \
tex-relsize.sty \
tex-rotating.sty \
tex-times.sty \
tex-twoopt.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
