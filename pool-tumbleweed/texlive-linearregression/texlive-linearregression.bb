SUMMARY = "Calculate and display linear regressions"
DESCRIPTION = "This package provides the definition of some document-level \
commands (and some auxiliary functions) that perform the linear \
regression on a set of data and present the data and the \
results in tabular and in graphic form."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn76924"

RPM_NAME = "texlive-linearregression-2026.226.svn76924-61.2.noarch.rpm"
RPM_HASH = "8853e7a6ec6cfdaf963fd3df9513c0eeada45a8ed602f557ad16c6f241f6973debebaab997f8b11f0ec140e71af6e826389ac1f08a7f7d12494561c610bc711c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-linearregression.sty \
texlive-linearregression"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pict2e.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
