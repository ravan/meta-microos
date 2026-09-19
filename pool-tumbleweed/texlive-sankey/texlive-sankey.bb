SUMMARY = "Draw Sankey diagrams with TikZ"
DESCRIPTION = "This package provides macros and an environment for creating \
Sankey diagrams, i.e. flow diagrams in which the width of the \
arrows is proportional to the flow rate."
LICENSE = "LPPL-1.0"

PV = "2026.226.3.0.2svn73396"

RPM_NAME = "texlive-sankey-2026.226.3.0.2svn73396-60.2.noarch.rpm"
RPM_HASH = "c2832fcafa72ba95c572d533eea8065de0f55859f98a03d029c94d3d329bb4993ea533107112c98d4c1bb2e41a4ece2499ce5151fce6aff399fa192983b1b508"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-sankey-doc-preamble.sty \
tex-sankey.sty \
tex-tikzlibrarydubins.code.tex \
texlive-sankey"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-accsupp.sty \
tex-babel.sty \
tex-bookmark.sty \
tex-cmap.sty \
tex-dtx-attach.sty \
tex-dtxdescribe.sty \
tex-embedfile.sty \
tex-enumitem.sty \
tex-etoc.sty \
tex-etoolbox.sty \
tex-fancyvrb.sty \
tex-fontenc.sty \
tex-footnote.sty \
tex-geometry.sty \
tex-hypdoc.sty \
tex-inconsolata.sty \
tex-inputenc.sty \
tex-listings.sty \
tex-lmodern.sty \
tex-microtype.sty \
tex-parskip.sty \
tex-siunitx.sty \
tex-tikz.sty \
tex-varioref.sty \
tex-xcolor.sty \
tex-xfp.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
