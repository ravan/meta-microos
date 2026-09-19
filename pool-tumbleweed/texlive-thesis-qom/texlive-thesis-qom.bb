SUMMARY = "Thesis style of the University of Qom, Iran"
DESCRIPTION = "This package provides a class file for writing theses and \
dissertations according to the University of Qom Graduate \
Schools's guidelines for the electronic submission of master \
theses and PhD dissertations. The class should meet all the \
current requirements and is updated whenever the university \
guidelines change. The class needs XeLaTeX in conjunction with \
the following fonts: XB Niloofar, IranNastaliq, IRlotus, XB \
Zar, XB Titre, and Yas."
LICENSE = "LPPL-1.0"

PV = "2026.227.0.0.5svn63524"

RPM_NAME = "texlive-thesis-qom-2026.227.0.0.5svn63524-62.2.noarch.rpm"
RPM_HASH = "b76261d3c63054ed74f5ba99111c8c3d4155154aaec39f277b0633a8a3601ced9812aa6fbae6eed1ec7ac37a18f7d8c68ab90a3c2fd8a2ac02ad14a7b744f7d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-thesis-qom.cls \
texlive-thesis-qom"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-amssymb.sty \
tex-amsthm.sty \
tex-apptools.sty \
tex-array.sty \
tex-bidi-atbegshi.sty \
tex-biditools.sty \
tex-book.cls \
tex-booktabs.sty \
tex-emptypage.sty \
tex-enumitem.sty \
tex-fancyhdr.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-keyval.sty \
tex-makeidx.sty \
tex-multicol.sty \
tex-picture.sty \
tex-setspace.sty \
tex-tikz.sty \
tex-tocbibind.sty \
tex-tocloft.sty \
tex-xcolor.sty \
tex-xepersian.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
