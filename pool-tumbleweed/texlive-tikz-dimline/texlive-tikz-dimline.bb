SUMMARY = "Technical dimension lines using PGF/TikZ"
DESCRIPTION = "tikz-dimline helps drawing technical dimension lines in TikZ \
picture environments. Its usage is similar to some \
contributions posted on stackexchange."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn35805"

RPM_NAME = "texlive-tikz-dimline-2026.226.1.0svn35805-59.2.noarch.rpm"
RPM_HASH = "f4c1703ce6fd67b163e3c315270195bcaeb127c074606e7f33852b69056dc3321090061b8c4c26d09bfbec19c98134493ab5423261dc9db2a7849839de93623d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikz-dimline.sty \
texlive-tikz-dimline"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-pgfplots.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
