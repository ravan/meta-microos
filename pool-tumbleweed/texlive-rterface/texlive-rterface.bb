SUMMARY = "Access to R analysis from within a document"
DESCRIPTION = "The package mediates interaction between LaTeX and R; it allows \
LaTeX to set R's parameters, and provides code to read R \
output."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn30084"

RPM_NAME = "texlive-rterface-2026.226.svn30084-60.2.noarch.rpm"
RPM_HASH = "a4f88085c8a5d532b5426016ce000a4b94902de30a77d441809d8b091bc80b683880387a89930b56bce50d7eae761f37b5d94f8ecac943dcb9b3ad6b16af6122"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-rterface.sty \
texlive-rterface"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-newfile.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
