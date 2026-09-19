SUMMARY = "PostScript macros for TeX"
DESCRIPTION = "PSTricks offers an extensive collection of macros for \
generating PostScript that is usable with most TeX macro \
formats, including Plain TeX, LaTeX, AMS-TeX, and AMS-LaTeX. \
Included are macros for colour, graphics, pie charts, rotation, \
trees and overlays. It has many special features, including a \
wide variety of graphics (picture drawing) macros, with a \
flexible interface and with colour support. There are macros \
for colouring or shading the cells of tables. The package \
pstricks-add contains bug-fixes and additions for PSTricks \
(among other things). PSTricks ordinarily uses PostScript \
\\special commands, which are not supported by pdf(La)TeX. This \
limitation may be overcome by using either the pst-pdf or the \
pdftricks package, to generate a PDF inclusion from a PSTricks \
diagram. PSTricks macros can also generate PDF output when the \
document is processed XeTeX, without the need for other \
supporting packages."
LICENSE = "LPPL-1.0"

PV = "2026.226.3.22asvn78101"

RPM_NAME = "texlive-pstricks-2026.226.3.22asvn78101-60.4.noarch.rpm"
RPM_HASH = "33982737c6fa8ef886cca868c716632768d48face37697663482b9a583474bf3758c6e1d20c4e9dd70bd8e3083913fdeb67e591b3b32d7e5770e070729cbfdba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-README.cfg \
tex-distiller.cfg \
tex-dvips.cfg \
tex-dvipsone.cfg \
tex-gastex.cfg \
tex-pst-all.sty \
tex-pst-code-arc.tex \
tex-pst-code-box.tex \
tex-pst-code-circle-ellipse.tex \
tex-pst-code-grid.tex \
tex-pst-code-pspicture.tex \
tex-pst-code-put.tex \
tex-pst-code-ref-rot.tex \
tex-pst-doc.cls \
tex-pst-fp.tex \
tex-pst-key.sty \
tex-pst-key.tex \
tex-pstcol.sty \
tex-pstricks-arrows.tex \
tex-pstricks-color.tex \
tex-pstricks-dots.tex \
tex-pstricks-pdf.sty \
tex-pstricks-plain.tex \
tex-pstricks-tex.def \
tex-pstricks-xetex.def \
tex-pstricks.sty \
tex-pstricks.tex \
tex-pstricks97.tex \
tex-textures.cfg \
tex-vtex.cfg \
tex-xdvipdfmx.cfg \
texlive-pstricks"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-amssymb.sty \
tex-babel.sty \
tex-bera.sty \
tex-biblatex.sty \
tex-booktabs.sty \
tex-calc.sty \
tex-caption.sty \
tex-csquotes.sty \
tex-eso-pic.sty \
tex-everyshi.sty \
tex-fancyvrb.sty \
tex-fontenc.sty \
tex-fontspec.sty \
tex-footmisc.sty \
tex-graphicx.sty \
tex-ifpdf.sty \
tex-ifplatform.sty \
tex-iftex.sty \
tex-juliamono.sty \
tex-libertinus-otf.sty \
tex-lscape.sty \
tex-lua-unicode-math.sty \
tex-makeidx.sty \
tex-manfnt.sty \
tex-minted-code.sty \
tex-multido.sty \
tex-nameref.sty \
tex-paralist.sty \
tex-pst-3d.sty \
tex-pst-calculate.sty \
tex-pst-coil.sty \
tex-pst-eps.sty \
tex-pst-fill.sty \
tex-pst-grad.sty \
tex-pst-node.sty \
tex-pst-pdf.sty \
tex-pst-plot.sty \
tex-pst-text.sty \
tex-pst-tree.sty \
tex-pstricks-add.sty \
tex-ragged2e.sty \
tex-scrlayer-scrpage.sty \
tex-setspace.sty \
tex-showexpl.sty \
tex-subfig.sty \
tex-tabularx.sty \
tex-textcomp.sty \
tex-varioref.sty \
tex-xcolor.sty \
tex-xkeyval.sty \
tex-xkvview.sty \
tex-xspace.sty \
tex-xurl.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
