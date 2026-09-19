SUMMARY = "Draw elements of the diagram monoids"
DESCRIPTION = "This package allows you to draw elements of the diagram \
monoids, commonly referred to as diagrams. The package provides \
a lot of flexibility to draw most diagrams and can be \
customised as needed. It makes use of the TikZ and keyval \
packages."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.2svn77509"

RPM_NAME = "texlive-pmdraw-2026.226.2.2svn77509-59.2.noarch.rpm"
RPM_HASH = "760201b6ad5ddae6e7d7bdf9bf42cc64380c70b155a47b1b3a3c2b0b631cb288a488322c404ed07c282c4fe0a081ffdc1563d0f8e7a42e5fb2c3ff46db0bb558"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pmdraw.sty \
texlive-pmdraw"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tikz.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
