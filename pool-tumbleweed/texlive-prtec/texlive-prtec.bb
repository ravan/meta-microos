SUMMARY = "A template for PRTEC conference papers"
DESCRIPTION = "This package provides a LaTeX class, a BibTeX style, and a \
LaTeX template to format conference papers for the Pacific Rim \
Thermal Engineering Conference (PRTEC). The .tex and .cls files \
are commented and should be self-explanatory. The package \
depends on newtx."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.07svn76790"

RPM_NAME = "texlive-prtec-2026.226.1.07svn76790-59.2.noarch.rpm"
RPM_HASH = "f3b8c38a4572bc968e81e3f73691861e1f59eb1ef429d1f555822e8c89b0f925d3f36d438eeeaa9d8b516f8710a2d6ece5da57cf03b22a911c5433a11cc6f92f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-prtec.cls \
texlive-prtec"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-array.sty \
tex-article.cls \
tex-bm.sty \
tex-booktabs.sty \
tex-caption.sty \
tex-dcolumn.sty \
tex-doi.sty \
tex-etoolbox.sty \
tex-fancyhdr.sty \
tex-fnpos.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-hologo.sty \
tex-hyperref.sty \
tex-ifthen.sty \
tex-mathtools.sty \
tex-metalogo.sty \
tex-multicol.sty \
tex-natbib.sty \
tex-newtxmath.sty \
tex-newtxtext.sty \
tex-parskip.sty \
tex-subcaption.sty \
tex-titlesec.sty \
tex-xcoffins.sty \
tex-xcolor.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
