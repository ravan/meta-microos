SUMMARY = "Drawing of Vectorian ornaments with PGF/TikZ"
DESCRIPTION = "This package allows the drawing of Vectorian ornaments (196) \
with PGF/TikZ. The documentation presents the syntax and \
parameters of the macro 'pgfornament'."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3svn72029"

RPM_NAME = "texlive-pgfornament-2026.226.1.3svn72029-58.2.noarch.rpm"
RPM_HASH = "511e2e705023605811eb94ad80c951b89880a45f799f3c3b3129c26790c93470f7dc175aa1e494d4b47716b5f955685e8290197f0031dc334c7b41ac355e6f34"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pgflibraryam.code.tex \
tex-pgflibrarypgfhan.code.tex \
tex-pgflibraryvectorian.code.tex \
tex-pgfornament.sty \
tex-tikzrput.sty \
texlive-pgfornament"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-iftex.sty \
tex-pgfopts.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
