SUMMARY = "Generate invoices for Belgian non-profit organizations"
DESCRIPTION = "This package provides templates and a sty file for generating \
invoices for Belgian non-profit organizations."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.1svn67840"

RPM_NAME = "texlive-modeles-factures-belges-assocs-2026.226.1.0.1svn67840-61.2.noarch.rpm"
RPM_HASH = "d7009bb77bc4d896e21fa299e8f4f6f7dba41732f67a24259fb36ac0a2924942601b66cb6591b75c99f12c92e848d7871f0e6e90329d2b9429c982a61f616084"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-modeles-factures-belges-associations.sty \
texlive-modeles-factures-belges-assocs"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amssymb.sty \
tex-array.sty \
tex-babel.sty \
tex-calctab.sty \
tex-color.sty \
tex-colortbl.sty \
tex-eurosym.sty \
tex-fancyhdr.sty \
tex-fontspec.sty \
tex-geometry.sty \
tex-hyperref.sty \
tex-ifthen.sty \
tex-inputenc.sty \
tex-lmodern.sty \
tex-mathrsfs.sty \
tex-mathtools.sty \
tex-multirow.sty \
tex-soul.sty \
tex-ulem.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
