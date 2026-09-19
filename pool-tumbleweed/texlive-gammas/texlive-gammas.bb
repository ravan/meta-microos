SUMMARY = "Template for the GAMM Archive for Students"
DESCRIPTION = "This is the official document class for typesetting journal \
articles for GAMM Archive for Students (GAMMAS), the \
open-access online yournal run by the GAMM Juniors (GAMM = \
Gesellschaft fur angewandte Mathematik und Mechanik)."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn56403"

RPM_NAME = "texlive-gammas-2026.226.1.1svn56403-60.2.noarch.rpm"
RPM_HASH = "e953a19174a98a3c1913022f8df31e18b3ccf9b1a07a999becf653ee23349a75b41ffaa8905b251b031cc9062c9ac284bd72576af98d8ed78334868965cb2a0a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gammas.cls \
texlive-gammas"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-amssymb.sty \
tex-amsthm.sty \
tex-anyfontsize.sty \
tex-babel.sty \
tex-biblatex.sty \
tex-booktabs.sty \
tex-caption.sty \
tex-cleveref.sty \
tex-csquotes.sty \
tex-enumitem.sty \
tex-fontenc.sty \
tex-fourier.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-ifthen.sty \
tex-inputenc.sty \
tex-lineno.sty \
tex-listings.sty \
tex-lmodern.sty \
tex-mathrsfs.sty \
tex-mathtools.sty \
tex-microtype.sty \
tex-natbib.sty \
tex-pgfplots.sty \
tex-scrartcl.cls \
tex-scrlayer-scrpage.sty \
tex-siunitx.sty \
tex-subdepth.sty \
tex-tikz.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
