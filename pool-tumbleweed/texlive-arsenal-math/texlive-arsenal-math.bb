SUMMARY = "Arsenal Math OpenType fonts"
DESCRIPTION = "Arsenal Math is a math companion font for the Arsenal text \
font. It is based on KpMath-Sans, with Latin characters, \
numerals and a few symbols from the Arsenal font. XeTeX or \
LuaTeX is required to use these OpenType math fonts."
LICENSE = "OFL-1.1"

PV = "2026.226.0.0.9.3svn77682"

RPM_NAME = "texlive-arsenal-math-2026.226.0.0.9.3svn77682-60.2.noarch.rpm"
RPM_HASH = "c4e195fad9cc6ab28bdfcd48c58d796e167cc93e1d71d6de2359824c03331ed3ebc3004dc29791235933babdc7b4a9246db335b8cedfd90996feacfd97aa9ab7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-arsenal-math.sty \
texlive-arsenal-math"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fontspec.sty \
tex-unicode-math.sty \
texlive \
texlive-arsenal-math-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
