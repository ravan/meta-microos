SUMMARY = "Predefined environments for typesetting LaTeX code with minted"
DESCRIPTION = "With package minted one can typeset LaTeX code with unicode \
characters. This package minted-code defines several \
environments to simplify the application."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.01svn76529"

RPM_NAME = "texlive-minted-code-2026.226.0.0.01svn76529-61.2.noarch.rpm"
RPM_HASH = "49e3e0d886923e16bcaee4343f32eadc9cc7747fd55e72ba8ee573d3a3d74f978fc0c994ddbef1fd6a15062060875e291f4e7c345df8c568785ea7e74eace8e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-minted-code.sty \
texlive-minted-code"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-minted.sty \
tex-tcolorbox.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
