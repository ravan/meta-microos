SUMMARY = "Floating algorithm environment with algorithmic keywords"
DESCRIPTION = "Algorithm2e is an environment for writing algorithms. An \
algorithm becomes a floating object (like figure, table, etc.). \
The package provides macros that allow you to create different \
keywords, and a set of predefined key words is provided; you \
can change the typography of the keywords. The package allows \
vertical lines delimiting a block of instructions in an \
algorithm, and defines different sorts of algorithms such as \
Procedure or Function; the name of these functions may be \
reused in the text or in other algorithms."
LICENSE = "LPPL-1.0"

PV = "2026.226.5.2svn77682"

RPM_NAME = "texlive-algorithm2e-2026.226.5.2svn77682-61.2.noarch.rpm"
RPM_HASH = "f76bcc165bcc69ff0b5303a65d87b959664c0833b993bf6cfe8e6c10d4425f722ec43949b3d4841d0b12dfa891716d1e3df2d138f70a4aa6e78ef278758f6527"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-algorithm2e.sty \
texlive-algorithm2e"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
tex-endfloat.sty \
tex-ifoddpage.sty \
tex-ifthen.sty \
tex-relsize.sty \
tex-tocbibind.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
