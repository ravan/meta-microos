SUMMARY = "Drawing TQFT diagrams with TikZ/PGF"
DESCRIPTION = "The package defines some node shapes useful for drawing TQFT \
diagrams with TikZ/PGF. That is, it defines highly customisable \
shapes that look like cobordisms between circles, such as those \
used in TQFT and other mathematical diagrams."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.3svn71401"

RPM_NAME = "texlive-tqft-2026.226.2.3svn71401-59.2.noarch.rpm"
RPM_HASH = "2c09a04a3e489d3d907027957660e2d88588ded7ce68ff0c0be0a1b64412c024d7bab0c017e8bb92121b5cbfdc3bdc19184dac664b86b6f00c27b2c4625678eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikzlibrarytqft.code.tex \
tex-tqft.sty \
texlive-tqft"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pgf.sty \
tex-pgfkeys.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
