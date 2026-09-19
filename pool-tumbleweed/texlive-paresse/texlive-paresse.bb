SUMMARY = "Define simple macros for greek letters"
DESCRIPTION = "The package defines macros using SS to type greek letters so \
that the user may (for example) type SSa to get the effect of \
$\\alpha$. However, it takes care only of letters which have a \
macro name like \\alpha or \\Omega."
LICENSE = "LPPL-1.0"

PV = "2026.226.5.0.2svn76924"

RPM_NAME = "texlive-paresse-2026.226.5.0.2svn76924-58.2.noarch.rpm"
RPM_HASH = "b0299e3f8c54da53106f52bd28cc4acfb36336fd15839b2437ecc53936616752be497dec3b893c867b38e46b8ac0c2a1065de1f5944cac50f6aaeae4044f2296"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-paresse-old.sty \
tex-paresse-utf8.sty \
tex-paresse.sty \
texlive-paresse"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-iftex.sty \
tex-l3keys2e.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
