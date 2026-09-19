SUMMARY = "Assemble multiple logical pages onto a physical page"
DESCRIPTION = "This package replaces and extends the pgfpages sub-package of \
the PGF system. It provides the capability to arrange multiple \
'logical' pages on multiple 'physical' pages, for example as \
for arranging pages to make booklets."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.20svn54770"

RPM_NAME = "texlive-pgfmorepages-2026.226.1.20svn54770-58.2.noarch.rpm"
RPM_HASH = "0a82ba4173a59b84a0fb4876b38b9b644394f7201d32c9e108b8f346d19767a3ed47e93485c5dabc921a969cadecce26566965354d696c4fd705eeabb9b7fe05"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pgfmorepages.sty \
tex-pgfmorepageslayouts.code.tex \
texlive-pgfmorepages"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-pgfcore.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
