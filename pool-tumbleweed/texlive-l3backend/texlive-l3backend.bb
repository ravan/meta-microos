SUMMARY = "LaTeX3 backend drivers"
DESCRIPTION = "This package forms parts of expl3, and contains the code used \
to interface with backends (drivers) across the expl3 codebase. \
The functions here are defined differently depending on the \
engine in use. As such, these are distributed separately from \
l3kernel to allow this code to be updated on an independent \
schedule."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn76924"

RPM_NAME = "texlive-l3backend-2026.226.svn76924-63.2.noarch.rpm"
RPM_HASH = "dd31b0254a0a22574ba25600eb6e0ec1cd4bbbd91df7916f114abcde3ad1911bfbef152be97743804f4c6febb0bb3e0534714552dd55596c9faa08520f907070"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-l3backend-dvipdfmx.def \
tex-l3backend-dvips.def \
tex-l3backend-dvisvgm.def \
tex-l3backend-luatex.def \
tex-l3backend-pdftex.def \
tex-l3backend-xetex.def \
texlive-l3backend"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
