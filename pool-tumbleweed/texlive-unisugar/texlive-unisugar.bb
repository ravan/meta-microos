SUMMARY = "Define syntactic sugar for Unicode LaTeX"
DESCRIPTION = "The package allows the user to define shorthand aliases for \
single Unicode characters, and also provides support for such \
aliases in RTL-text. The package requires an TeX-alike system \
that uses Unicode input in a native way: current examples are \
XeTeX and LuaTeX."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.92svn22357"

RPM_NAME = "texlive-unisugar-2026.226.0.0.92svn22357-60.2.noarch.rpm"
RPM_HASH = "bf8074576ed178ad7e62234395251f376df0d490958689a08d0fe52fddcb0cdaa843f4f0be1b0eea66fe21be936462a2adccceed61418ed5f21ce3f7ba92f6fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-unisugar.sty \
texlive-unisugar"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifxetex.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
