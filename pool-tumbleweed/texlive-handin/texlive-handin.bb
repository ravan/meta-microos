SUMMARY = "Light weight template for creating school submissions using LaTeX"
DESCRIPTION = "This package is for students creating school submissions using \
LaTeX. It is especially suitable for math, physics, statistics \
and the like. It can easily be used for creating exercises, \
too."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1.1svn48255"

RPM_NAME = "texlive-handin-2026.226.0.0.1.1svn48255-60.4.noarch.rpm"
RPM_HASH = "92fac3c0ccda251120c3f766f140fbfc89832c873237340a7bab72e486cc4cf70a746066092df2518ab014b675c2c6c8744881a622d7444e588035c4fd9db18f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-handin.sty \
texlive-handin"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-bm.sty \
tex-esint.sty \
tex-etoolbox.sty \
tex-fancyhdr.sty \
tex-fontenc.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-iflang.sty \
tex-inputenc.sty \
tex-lastpage.sty \
tex-mathtools.sty \
tex-pgfkeys.sty \
tex-pgfopts.sty \
tex-scrextend.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
