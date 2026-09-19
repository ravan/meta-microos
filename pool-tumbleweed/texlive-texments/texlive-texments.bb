SUMMARY = "Using the Pygments highlighter in LaTeX"
DESCRIPTION = "A package which allows to use the Pygments highlighter inside \
LaTeX documents. Pygments supports syntax colouring of over 50 \
types of files, and ships with multiple colour schemes."
LICENSE = "LPPL-1.0"

PV = "2026.227.0.0.2.0svn15878"

RPM_NAME = "texlive-texments-2026.227.0.0.2.0svn15878-62.2.noarch.rpm"
RPM_HASH = "c117503b819343a092bcfd7480c27b99f394f205827f292ea8682e57835d3a42b5c66b565c96a94cb6428b1a407f5add005f2658d36d98c2c8772b38e6dd7fac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-texments.sty \
texlive-texments"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
tex-fancyvrb.sty \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
