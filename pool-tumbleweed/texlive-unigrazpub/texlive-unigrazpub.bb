SUMMARY = "LaTeX templates for University of Graz Library Publishing Services"
DESCRIPTION = "This package provides a LaTeX class matching the preparation \
guidelines of the Library Publishing Services of University of \
Graz. The bundle also includes a comprehensive set of example \
files for books and collections."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.00svn76924"

RPM_NAME = "texlive-unigrazpub-2026.226.1.00svn76924-60.2.noarch.rpm"
RPM_HASH = "ca6b1be07ce1183f054a54191ef1c84d87035f222878e9123abeab82ea29a3766ac4b3d951ea638d4281c484065a12a5644c014a8c4a2592870ee1be18239705"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-unigrazpub.cls \
texlive-unigrazpub"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-anyfontsize.sty \
tex-biblatex-chicago.sty \
tex-csquotes.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-l3keys2e.sty \
tex-ragged2e.sty \
tex-roboto.sty \
tex-scrbook.cls \
tex-scrlayer-scrpage.sty \
tex-sourceserifpro.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
