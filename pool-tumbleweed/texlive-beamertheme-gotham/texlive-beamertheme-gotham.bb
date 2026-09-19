SUMMARY = "A modern, minimal-ish, versatile and extendable yet robust theme for Beamer"
DESCRIPTION = "This package provides a modern, minimal-ish, versatile, LaTeX3 \
and extendable yet robust Beamer theme with some lines of code \
gathered or borrowed from other themes. It uses the l3build \
system to both build and verify (Test-Driven Development) the \
delivered code. 'Gotham' tries to bring higher flexibility \
thanks to LaTeX3 implementation on top of the good-looking \
Metropolis theme."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2.4.asvn77201"

RPM_NAME = "texlive-beamertheme-gotham-2026.226.1.2.4.asvn77201-61.2.noarch.rpm"
RPM_HASH = "196de9dfa323341a7c574ff965c8989d92ee36b85ad767336f18b51c2deac2d7a4d57ce7c340dfdbc4dfee3598071868e1361468b1ca8d83787e9ddc474f9d57"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-beamercolorthemegotham.sty \
tex-beamerfontthemegotham.sty \
tex-beamerinnerthemegotham.sty \
tex-beamerouterthemegotham.sty \
tex-beamerthemegotham.sty \
texlive-beamertheme-gotham"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-expl3.sty \
tex-fontspec.sty \
tex-ifluatex.sty \
tex-ifxetex.sty \
tex-tikz.sty \
tex-xcolor.sty \
tex-xfp.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
