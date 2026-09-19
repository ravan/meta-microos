SUMMARY = "Lato-based OpenType Math font for LuaTeX and XeTeX"
DESCRIPTION = "This package provides a Unicode Math font LeteSansMath.otf \
meant to be used together with Lato sans-serif TrueType Text \
fonts in LuaLaTeX or XeLaTeX documents. Note: 'Lato' means \
'Summer' in Polish, same as 'l'ete' in French."
LICENSE = "OFL-1.1"

PV = "2026.226.0.0.50svn77682"

RPM_NAME = "texlive-lete-sans-math-2026.226.0.0.50svn77682-61.2.noarch.rpm"
RPM_HASH = "0e3c64d1d6636da823e10700891d3359491d2753204674c24aa14440fd3bb944f008448f8a389ec8f9fae23af009582fbe69211c52924ca7de465f78d06f4877"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lete-sans-math.sty \
texlive-lete-sans-math"

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
texlive-lete-sans-math-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
