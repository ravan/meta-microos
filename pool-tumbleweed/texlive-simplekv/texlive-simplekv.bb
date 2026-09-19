SUMMARY = "A simple key/value system for TeX and LaTeX"
DESCRIPTION = "The package provides a simple key/value system for TeX and \
LaTeX."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.32svn77682"

RPM_NAME = "texlive-simplekv-2026.226.0.0.32svn77682-60.2.noarch.rpm"
RPM_HASH = "f19b54e3a0e0b574c9bfae6412ae1ce1e6e7db670441f05589bf295e7ef92a8bc6d39a65f0ad0f2094692bbb1d908109202591c78bae3d8c54a270285697bae2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-simplekv.sty \
tex-simplekv.tex \
texlive-simplekv"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
