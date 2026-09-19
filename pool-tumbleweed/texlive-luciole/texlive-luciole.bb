SUMMARY = "Luciole OpenType fonts for LuaTeX and XeTeX"
DESCRIPTION = "This package provides four Unicode Math text fonts \
Luciole-*.ttf and a companion math font Luciole-Math.otf. These \
have been developed explicitly for visually impaired people and \
are the result of a two-year collaboration between the Centre \
Technique Regional pour la Deficience Visuelle (the Regional \
Technical Center for Visual Impairment) and the type-design \
studio typographies.fr. This project received a grant from the \
Swiss Ceres Foundation and support from the DIPHE laboratory at \
the Universite Lumiere Lyon 2."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.60svn77682"

RPM_NAME = "texlive-luciole-2026.226.0.0.60svn77682-59.2.noarch.rpm"
RPM_HASH = "17b77f31efc12073bdd84304e10a1cb9a921beca13eade8b0f9b8516902167710ba98ed30c58caea22e6c86efaf3c22719f25000dac162b645ef337f868fe3b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-luciole-math.sty \
texlive-luciole"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-iftex.sty \
tex-unicode-math.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-luciole-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
