SUMMARY = "Problem sheet class"
DESCRIPTION = "This class is designed to simplify the typesetting of problem \
sheets with Mathematics and Computer Science content. It is \
currently customised towards teaching in French (and the \
examples are in French)."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn24830"

RPM_NAME = "texlive-pbsheet-2026.226.0.0.1svn24830-58.2.noarch.rpm"
RPM_HASH = "c55b2ca01342c30ece84fab0ed0b5a544c8d2fa0746af3b230ca8232358521a104100924fcdc4c6d03f589b420ffad864279175a0df504eb0c01b809edbbe4b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pbsheet.cls \
texlive-pbsheet"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-aeguill.sty \
tex-amsfonts.sty \
tex-amsmath.sty \
tex-amssymb.sty \
tex-amsthm.sty \
tex-babel.sty \
tex-color.sty \
tex-fontenc.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-inputenc.sty \
tex-latexsym.sty \
tex-listings.sty \
tex-moreverb.sty \
tex-rotating.sty \
tex-url.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
