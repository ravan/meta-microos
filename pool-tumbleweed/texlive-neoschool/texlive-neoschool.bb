SUMMARY = "LaTeX class for teachers"
DESCRIPTION = "This package provides secondary school teachers with a \
comprehensive set of tools for creating educational documents \
such as assessments, course materials, exercise sheets with \
solutions, and more. It includes eight predefined color themes, \
various class options for layout and typography, specialized \
environments, dedicated commands, and multiple preformatted \
header styles tailored to different document types. The package \
integrates numerous commonly used LaTeX packages, which \
significantly reduces the need for extensive preambles and \
minimizes compatibility issues. Additionally, it is \
multilingual, supporting French, English, and German."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3.1svn78056"

RPM_NAME = "texlive-neoschool-2026.226.1.3.1svn78056-61.2.noarch.rpm"
RPM_HASH = "ad6c1e90f1c351c43cc587452c28b9c52f8ea67ea2f64d5345321e28a1be6cb428df90d834c2db704efb1e2f329089ae2e0b339b07ca6e3fb49908e466748fa4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-neoschool.cls \
texlive-neoschool"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-adforn.sty \
tex-adjustbox.sty \
tex-algpseudocode.sty \
tex-annotate-equations.sty \
tex-asymptote.sty \
tex-babel.sty \
tex-blindtext.sty \
tex-bookmark.sty \
tex-calc.sty \
tex-cancel.sty \
tex-changepage.sty \
tex-colortbl.sty \
tex-cuted.sty \
tex-enumitem.sty \
tex-environ.sty \
tex-esvect.sty \
tex-etoc.sty \
tex-etoolbox.sty \
tex-eucal.sty \
tex-fancybox.sty \
tex-fancyhdr.sty \
tex-fancyvrb.sty \
tex-fontawesome5.sty \
tex-fontenc.sty \
tex-fontspec.sty \
tex-forest.sty \
tex-fourier-orns.sty \
tex-iftex.sty \
tex-inputenc.sty \
tex-kvoptions.sty \
tex-lastpage.sty \
tex-lipsum.sty \
tex-lscape.sty \
tex-lua-ul.sty \
tex-luacas.sty \
tex-luacolor.sty \
tex-marginnote.sty \
tex-mathastext.sty \
tex-mathrsfs.sty \
tex-mathtools.sty \
tex-microtype.sty \
tex-multicol.sty \
tex-multirow.sty \
tex-ncccomma.sty \
tex-nccmath.sty \
tex-needspace.sty \
tex-newpxmath.sty \
tex-newpxtext.sty \
tex-numprint.sty \
tex-pdftexcmds.sty \
tex-pgffor.sty \
tex-pgfmorepages.sty \
tex-pgfplots.sty \
tex-pifont.sty \
tex-pst-3dplot.sty \
tex-pst-bezier.sty \
tex-pst-eucl.sty \
tex-pst-node.sty \
tex-pst-plot.sty \
tex-pst-text.sty \
tex-pst-tree.sty \
tex-pstricks-add.sty \
tex-pstricks.sty \
tex-qrcode.sty \
tex-scalefnt.sty \
tex-scrartcl.cls \
tex-scrlayer-scrpage.sty \
tex-setspace.sty \
tex-silence.sty \
tex-siunitx.sty \
tex-tabularray.sty \
tex-tabularx.sty \
tex-tasks.sty \
tex-tcolorbox.sty \
tex-tdsfrmath.sty \
tex-textcomp.sty \
tex-tikz.sty \
tex-tikzpagenodes.sty \
tex-tikzsymbols.sty \
tex-tkz-euclide.sty \
tex-tkz-tab.sty \
tex-ulem.sty \
tex-unicode-math.sty \
tex-variations.sty \
tex-witharrows.sty \
tex-wrapfig.sty \
tex-xcolor.sty \
tex-xhfill.sty \
tex-xkeyval.sty \
tex-xlop.sty \
tex-xsim.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
