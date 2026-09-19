SUMMARY = "Class for typesetting articles for the ICSV conference"
DESCRIPTION = "This is an ad-hoc class for typesetting articles for the ICSV \
conference, based on the earler active-conf by the same author."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn15878"

RPM_NAME = "texlive-icsv-2026.226.0.0.2svn15878-60.2.noarch.rpm"
RPM_HASH = "4fa7dad341ba96518d0012875c652cea97ab52daec82cb6659b6a07bcbc195ecf717ab0cb8fc9a994cedc49c5a811e8cdbf20101940d333c9e91f0ed1efb893f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-icsv.cls \
texlive-icsv"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-amssymb.sty \
tex-array.sty \
tex-article.cls \
tex-bm.sty \
tex-calc.sty \
tex-caption.sty \
tex-fancyhdr.sty \
tex-fix-cm.sty \
tex-fixltx2e.sty \
tex-fontenc.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-helvet.sty \
tex-hyperref.sty \
tex-ifthen.sty \
tex-textcomp.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
