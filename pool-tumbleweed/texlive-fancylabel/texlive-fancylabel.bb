SUMMARY = "Complex labelling with LaTeX"
DESCRIPTION = "The package provides a complex labelling scheme. It is designed \
to support the needs of the author's chemschemex package"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn46736"

RPM_NAME = "texlive-fancylabel-2026.226.1.1svn46736-59.2.noarch.rpm"
RPM_HASH = "a06ab7d0ec09771804b7096521539048922873b44ef171d906ef1742570f89284e971f41a5fe673d914e06b5940c2b3d90b8292de6f6b286def4064323736e79"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fancylabel.sty \
texlive-fancylabel"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-suffix.sty \
tex-xifthen.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
