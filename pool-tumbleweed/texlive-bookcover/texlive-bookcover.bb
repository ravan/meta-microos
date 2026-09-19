SUMMARY = "A class for book covers and dust jackets"
DESCRIPTION = "This class helps typesetting book covers and dust jackets."
LICENSE = "LPPL-1.0"

PV = "2026.226.3.9svn77334"

RPM_NAME = "texlive-bookcover-2026.226.3.9svn77334-59.2.noarch.rpm"
RPM_HASH = "199af84105219cb3a35343bcebbf5871d61bc7d0e79c0b5506f7a057c0858123406ba300840a606554ae0ce18a980d0b00a932d998f511ab5103425e50067fbd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bookcover.cls \
texlive-bookcover"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-calc.sty \
tex-fgruler.sty \
tex-geometry.sty \
tex-kvoptions.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
