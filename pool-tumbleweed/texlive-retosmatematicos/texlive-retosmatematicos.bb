SUMMARY = "LaTeX template for the Telegram group 'Retos Matematicos'"
DESCRIPTION = "This package provides the class RetoMatematico.cls, which is \
used to typeset the final solutions of the mathematical \
challenges published in the Telegram group Retos Matematicos \
(by Jose Manuel Sanchez Munoz). Among its features, the class \
sets the document size to letter paper, switches the font to \
Palatino Linotype (via the mathpazo package), and places \
information such as the group's ISSN and link in the page \
margins. Further details and usage examples are available in \
the package documentation."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1.1svn76358"

RPM_NAME = "texlive-retosmatematicos-2026.226.1.1.1svn76358-60.4.noarch.rpm"
RPM_HASH = "94edc10f211b92a225417959ea35f5d65e41b340bc1b8985454066646b78db493bdadff316b7272c98da50966e0b4e717f137b6ff9c580add2af2c7f662dd989"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-RetoExtra.sty \
tex-RetoMatematico.cls \
tex-RetoPSTricks.cls \
tex-RetoTikZ.cls \
texlive-retosmatematicos"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsfonts.sty \
tex-amsmath.sty \
tex-amssymb.sty \
tex-amsthm.sty \
tex-article.cls \
tex-auto-pst-pdf.sty \
tex-avant.sty \
tex-babel.sty \
tex-cancel.sty \
tex-ccicons.sty \
tex-cleveref.sty \
tex-colortbl.sty \
tex-empheq.sty \
tex-enumitem.sty \
tex-esvect.sty \
tex-eurosym.sty \
tex-fancyvrb.sty \
tex-fontenc.sty \
tex-hyperref.sty \
tex-inputenc.sty \
tex-lipsum.sty \
tex-mathpazo.sty \
tex-mathrsfs.sty \
tex-mathtools.sty \
tex-minted.sty \
tex-multicol.sty \
tex-natbib.sty \
tex-pgf.sty \
tex-pgfplots.sty \
tex-polynom.sty \
tex-pst-eucl.sty \
tex-pstricks-add.sty \
tex-qrcode.sty \
tex-scalerel.sty \
tex-setspace.sty \
tex-siunitx.sty \
tex-standalone.cls \
tex-systeme.sty \
tex-tcolorbox.sty \
tex-tikz.sty \
tex-titlesec.sty \
tex-titling.sty \
tex-upgreek.sty \
tex-wrapfig.sty \
tex-xcolor.sty \
tex-xfrac.sty \
tex-xkeyval.sty \
tex-xparse.sty \
tex-yhmath.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
