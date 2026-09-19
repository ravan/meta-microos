SUMMARY = "Typeset documents with ICMC/USP watermarks"
DESCRIPTION = "With this package you can typeset documents with ICMC/USP Sao \
Carlos watermarks. ICMC is acronym for 'Instituto de Ciencias \
Matematicas e de Computacao' of the 'Universidade de Sao Paulo' \
(USP), in the city of Sao Carlos-SP, Brazil."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0svn49740"

RPM_NAME = "texlive-timbreicmc-2026.226.2.0svn49740-59.2.noarch.rpm"
RPM_HASH = "fba69455a2869b6c5399f938d19f1b9dca5a97be4797659adaa3429890bcb6baa84f4e42a699c1be2f573ef1f58694f0633b6870375baa6a9a9250ca98db1b22"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-timbreicmc.sty \
texlive-timbreicmc"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-tikz.sty \
tex-xcolor.sty \
tex-xwatermark.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
