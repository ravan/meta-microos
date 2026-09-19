SUMMARY = "Creating (chemical) exercise sheets"
DESCRIPTION = "The package provides environments and commands that the author \
needed when preparing exercise sheets and other teaching \
material. In particular, the package supports the creation of \
exercise sheets, with separating printing of solutions"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn21632"

RPM_NAME = "texlive-chemexec-2026.226.1.0svn21632-60.2.noarch.rpm"
RPM_HASH = "7c593c68d2c66deb725f45f39a42b05815709c3016852c09881bad9e8a6e3521bf3fcb1a2077b2f6af3ed2ba8e67b90255d139bca7e103565430c944cda06e6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-chemexec.sty \
texlive-chemexec"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-accents.sty \
tex-amsmath.sty \
tex-calc.sty \
tex-framed.sty \
tex-ifthen.sty \
tex-mhchem.sty \
tex-tikz.sty \
tex-ulem.sty \
tex-xcolor.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
