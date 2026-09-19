SUMMARY = "A symbol loader"
DESCRIPTION = "The name is by way of being an acronym for 'Yet Another Grand \
Unified Symbols Loader'... The package allows the user to \
access a symbol without loading the package that usually \
provides it; this has the advantage of avoiding the name \
clashes that so commonly trouble those who load \
symbol-packages."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn29803"

RPM_NAME = "texlive-yagusylo-2026.226.1.2svn29803-59.4.noarch.rpm"
RPM_HASH = "2cb965544de4673826234aee182b337c0b3985e710932dcdbf6a1850b3ce028758f3d13f419a0fbd77b76e3d44aa0f8b6cbb36e112d02e59907db457af19bd93"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-yagusylo.cfg \
tex-yagusylo.sty \
texlive-yagusylo"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-suffix.sty \
tex-xargs.sty \
tex-xcolor.sty \
tex-xifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
