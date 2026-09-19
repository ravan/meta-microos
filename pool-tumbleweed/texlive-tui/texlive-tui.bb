SUMMARY = "Thesis style for the University of the Andes, Colombia"
DESCRIPTION = "Doctoral Dissertations from the Faculty of Engineering at the \
Universidad de los Andes, Bogota, Colombia. The class is \
implemented as an extension of the memoir class. Clase de Tesis \
doctorales para ingenieria, Universidad de los Andes, Bogota."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.9svn27253"

RPM_NAME = "texlive-tui-2026.226.1.9svn27253-59.2.noarch.rpm"
RPM_HASH = "544e7191c0eecdd316afe6c235b149cc62f2eaf2d0d0ab85ec5fbac8a256da4a5b85d9aadb488d7f7ed3ca4198eb43b6f9ea1a329c9a2ffea4f350a1e6d4c9c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tui.cls \
texlive-tui"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-MnSymbol.sty \
tex-amsmath.sty \
tex-amssymb.sty \
tex-amsthm.sty \
tex-babel.sty \
tex-breakurl.sty \
tex-courier.sty \
tex-csquotes.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-inputenc.sty \
tex-kpfonts.sty \
tex-kvoptions.sty \
tex-makeidx.sty \
tex-mathptmx.sty \
tex-memoir.cls \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
