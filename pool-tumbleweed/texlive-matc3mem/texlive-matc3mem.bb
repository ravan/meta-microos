SUMMARY = "Class for MatematicaC3 textbooks"
DESCRIPTION = "The class is a development of memoir, with additions \
(specifically, mathematical extensions) that provide support \
for writing the books for the Matematica C3 project to produce \
free mathematical textbooks for use in Italian high schools."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn35773"

RPM_NAME = "texlive-matc3mem-2026.226.1.1svn35773-59.2.noarch.rpm"
RPM_HASH = "bbe0779cd3f2f9dd37fd26064aad23815246babe02cf1db2e250cb33610865bdc59c835cc0b0fcdb706134135c76e18288cd15f7f959b5e76dc91041f6f0249a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-matc3mem.cls \
texlive-matc3mem"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsthm.sty \
tex-shadethm.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
