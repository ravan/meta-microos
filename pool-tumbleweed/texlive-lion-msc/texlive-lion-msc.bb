SUMMARY = "LaTeX class for B.Sc. and M.Sc. reports at Leiden Institute of Physics (LION)"
DESCRIPTION = "LaTeX class for B.Sc. and M.Sc. reports at Leiden Institute of \
Physics (LION). The purpose of this class is twofold: It \
creates a uniform layout of the student theses from our \
department. More importantly it contains several fields on the \
front-page that the user needs to fill that are used in the \
university administration (name, student number and name of \
supervisor). Students are free to change the layout of the text \
but should leave the title page as it is."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.31svn75184"

RPM_NAME = "texlive-lion-msc-2026.226.0.0.31svn75184-61.2.noarch.rpm"
RPM_HASH = "8ae02c14dc5c7e251a8b2142244bad34781733f0ab070364aab54bf8cb8fc0bce5ec1291d69948f241c3ae1e581ad1fe373881a732939bf633f250c3a46da661"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lion-msc.cls \
texlive-lion-msc"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-amssymb.sty \
tex-babel.sty \
tex-calc.sty \
tex-caption.sty \
tex-datetime.sty \
tex-fancyhdr.sty \
tex-fncychap.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-mathpazo.sty \
tex-natbib.sty \
tex-report.cls \
tex-svg.sty \
tex-titling.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
