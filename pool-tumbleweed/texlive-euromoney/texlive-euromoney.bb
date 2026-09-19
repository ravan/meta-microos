SUMMARY = "Vectorial coins and banknotes in euro, with stacking option"
DESCRIPTION = "With this package you can insert vectorial coins and banknotes \
in euro, with stacking option. Three designs are available: \
full color, simple color, and simple B&W. The PDF files were \
obtained by converting svg files found at openclipart (CC0 1.0 \
UNIVERSAL), by user frankes."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1.1svn73069"

RPM_NAME = "texlive-euromoney-2026.226.0.0.1.1svn73069-59.2.noarch.rpm"
RPM_HASH = "e2b32065a2243a018188169c7a361164e200d6b8d2ae2ee0536f73569be7ee3461c8387634e9c4d48c0c26f81c35a0ceb413e094b596e7f5da59929828dbde9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-euromoney.sty \
texlive-euromoney"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphicx.sty \
tex-listofitems.sty \
tex-simplekv.sty \
tex-tikz.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
