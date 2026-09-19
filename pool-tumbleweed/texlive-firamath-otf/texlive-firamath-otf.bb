SUMMARY = "Use OpenType math font Fira Math"
DESCRIPTION = "The package offers XeTeX/LuaTeX support for the Sans Serif \
OpenType Fira Math Font."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.03bsvn77682"

RPM_NAME = "texlive-firamath-otf-2026.226.0.0.03bsvn77682-59.2.noarch.rpm"
RPM_HASH = "503c258b60a1d3ac2e699f92a78a8fd3b9d1df31d84a9cbd223ee7b08a185686f0e991f3c92633c30640e12e3cbd8c8027b93a769ab6afd8ce70d1f9ea22ecfe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-firamath-otf.sty \
texlive-firamath-otf"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-iftex.sty \
tex-textcomp.sty \
tex-unicode-math.sty \
tex-xfakebold.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-firamath \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
