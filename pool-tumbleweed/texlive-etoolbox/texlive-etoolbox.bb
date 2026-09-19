SUMMARY = "E-TeX tools for LaTeX"
DESCRIPTION = "The package is a toolbox of programming facilities geared \
primarily towards LaTeX class and package authors. It provides \
LaTeX frontends to some of the new primitives provided by e-TeX \
as well as some generic tools which are not strictly related to \
e-TeX but match the profile of this package. Note that the \
initial versions of this package were released under the name \
elatex. The package provides functions that seem to offer \
alternative ways of implementing some LaTeX kernel commands; \
nevertheless, the package will not modify any part of the LaTeX \
kernel."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.5msvn77682"

RPM_NAME = "texlive-etoolbox-2026.226.2.5msvn77682-59.2.noarch.rpm"
RPM_HASH = "c33b296ead1f7738cf55d9588e96955dab84bc0a094b139b5961e12585d2c0d581394c2b7ed419e40749c8eed9e610c015329117d33edb27e1298fa3d44d7814"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-etoolbox.def \
tex-etoolbox.sty \
texlive-etoolbox"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etex.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
