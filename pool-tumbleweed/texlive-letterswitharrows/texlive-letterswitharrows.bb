SUMMARY = "Draw arrows over math letters"
DESCRIPTION = "This package provides LaTeX math-mode commands for setting left \
and right arrows over mathematical symbols so that the arrows \
dynamically scale with the symbols. While it is possible to set \
arrows over longer strings of symbols, the focus lies on single \
characters."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-letterswitharrows-2026.226.svn77682-61.2.noarch.rpm"
RPM_HASH = "e4073333f9b39ec00ba9f4fb0f21ea768a47cd160043a4c4a62fa0a2321e181833cf8d3655c021510c3bf30e59e3f0f2c0cea79e723b2007c5c00c57719f1ee4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-letterswitharrows.sty \
texlive-letterswitharrows"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-l3keys2e.sty \
tex-mathtools.sty \
tex-pgf.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
