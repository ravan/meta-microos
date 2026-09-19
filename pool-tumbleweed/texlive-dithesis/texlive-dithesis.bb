SUMMARY = "A class for undergraduate theses at the University of Athens"
DESCRIPTION = "The class conforms to the requirements of the Department of \
Informatics and Telecommunications at the University of Athens \
regarding the preparation of undergraduate theses, as of Sep 1, \
2011. The class is designed for use with XeLaTeX; by default \
(on a Windows platform), the font Arial is used, but provision \
is made for use under Linux (with a different sans-serif font)."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn34295"

RPM_NAME = "texlive-dithesis-2026.226.0.0.2svn34295-59.2.noarch.rpm"
RPM_HASH = "ecea2efc9204388cabef56f95a1897cd9995fe57b100a745b8f954bb6a956a9302f0776f686f37ff0e3fcfcf0ca5f8b1e23f737ce90205986b735597e8f0a4ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-dithesis.cls \
texlive-dithesis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-fancyhdr.sty \
tex-float.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-parskip.sty \
tex-setspace.sty \
tex-subfig.sty \
tex-tabularx.sty \
tex-titlesec.sty \
tex-titletoc.sty \
tex-titling.sty \
tex-tocloft.sty \
tex-xifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
