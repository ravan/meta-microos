SUMMARY = "Beijing University of Chemical Technology Thesis Template"
DESCRIPTION = "This package provides a LaTeX class and template for Beijing \
University of Chemical Technology, supporting bachelor, master, \
and doctor theses."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0svn67818"

RPM_NAME = "texlive-buctthesis-2026.226.2.0svn67818-59.2.noarch.rpm"
RPM_HASH = "6449cf2cc685f24eb53db0d8a67174ee94ea2c390d91e479a577387e1c7fe324c3c673dff728c0c420e1789ec57f0a085c0f84121310bc86403f15e32ff01ce6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-buctthesis.cls \
texlive-buctthesis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-amssymb.sty \
tex-amsthm.sty \
tex-bicaption.sty \
tex-booktabs.sty \
tex-calc.sty \
tex-caption.sty \
tex-enumitem.sty \
tex-fancyhdr.sty \
tex-fgruler.sty \
tex-float.sty \
tex-footmisc.sty \
tex-gbt7714.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-ifxetex.sty \
tex-kvoptions.sty \
tex-lineno.sty \
tex-listings.sty \
tex-longtable.sty \
tex-mhchem.sty \
tex-multirow.sty \
tex-pdfpages.sty \
tex-pifont.sty \
tex-siunitx.sty \
tex-subcaption.sty \
tex-tabularx.sty \
tex-textpos.sty \
tex-threeparttable.sty \
tex-tikz.sty \
tex-titletoc.sty \
tex-unicode-math.sty \
tex-xcolor.sty \
tex-xeCJKfntef.sty \
tex-xifthen.sty \
tex-xpatch.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
