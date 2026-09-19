SUMMARY = "Font containing high quality icons of online academic profiles"
DESCRIPTION = "The academicons package provides access in (La)TeX to 146 high \
quality icons of online academic profiles included in the free \
'Academicons' font. This package works with both Xe(La)TeX or \
Lua(La)TeX by using fontspec to load the included font, as well \
as with pdf(La)TeX by loading a Type 1 converted format of the \
original font. The 'Academicons' font was designed by James \
Walsh and released (see http://jpswalsh.github.io/academicons/) \
under the open SIL Open Font License. This package is a \
redistribution of the free 'Academicons' font with specific \
bindings for (La)TeX. It is inspired and based on the \
fontawesome package. The generic \\aiicon macro takes as \
mandatory argument the [?]name[?] of the desired icon. Icons \
can also be accessed directly by their respective macro. For \
example, \\aiicon{googlescholar} yields the same result as \
\\aiGoogleScholar. The full list of icons with their respective \
names and direct commands can be found in the manual."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.9.6_2svn77682"

RPM_NAME = "texlive-academicons-2026.226.1.9.6_2svn77682-61.2.noarch.rpm"
RPM_HASH = "7489beecea6f46154dfc478d52d49e4384948950a0475498c621e7e26ef215e3e861b5b13e418f5d410c6ffd053728314a293908c522450b442a7ed837183e21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-academicons-generic.tex \
tex-academicons-pdftex.tex \
tex-academicons-xeluatex.tex \
tex-academicons.enc \
tex-academicons.map \
tex-academicons.sty \
tex-academicons.tfm \
tex-tuacademicons.fd \
tex-uacademicons.fd \
texlive-academicons"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fontspec.sty \
tex-iftex.sty \
tex-updmap.cfg \
texlive \
texlive-academicons-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
