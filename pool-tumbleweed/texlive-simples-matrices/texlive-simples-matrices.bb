SUMMARY = "Define matrices by given list of values"
DESCRIPTION = "Macros to define and write matrices whose coefficients are \
given row by row in a list of values separated by commas."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.1svn76924"

RPM_NAME = "texlive-simples-matrices-2026.226.1.0.1svn76924-60.2.noarch.rpm"
RPM_HASH = "96a304f0caacb7aaa0891b00b83af752e849d61ee28c0d3349eda42120fdee6f264bb0cd25dfbdac6f5621e2bf3c24220fe763fccf96b6f2a8689ce06fc7bf79"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-simples-matrices.sty \
texlive-simples-matrices"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-expl3.sty \
tex-l3keys2e.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
