SUMMARY = "A document class for University of Maine graduate theses"
DESCRIPTION = "The maine-thesis class provides support for the formatting \
requirements for graduate theses of the Graduate School at The \
University of Maine. It sets default parameters for the report \
class, modifies captions, references, and the table of \
contents, and makes specific environments available. The \
maine-thesis class reflects the guidelines published by the \
Graduate School at The University of Maine. The Graduate School \
at the University of Maine does not provide official support \
for any thesis style class or template."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0.6svn77208"

RPM_NAME = "texlive-maine-thesis-2026.226.2.0.6svn77208-59.2.noarch.rpm"
RPM_HASH = "ff7d0cedffb7f01fac14f6805405c54cb59b3c2c96b6ff7791651a2d707a3ceeb9444feab0358df34268b8eb93dc167d655025dc11a6b345f96a1ea68407524a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-maine-thesis.cls \
texlive-maine-thesis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-afterpackage.sty \
tex-appendix.sty \
tex-biblatex.sty \
tex-booktabs.sty \
tex-caption.sty \
tex-changes.sty \
tex-csquotes.sty \
tex-eso-pic.sty \
tex-etoolbox.sty \
tex-everypage.sty \
tex-fancyhdr.sty \
tex-float.sty \
tex-fontenc.sty \
tex-fontspec.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-hyphenat.sty \
tex-iftex.sty \
tex-kvoptions.sty \
tex-lineno.sty \
tex-longtable.sty \
tex-lscape.sty \
tex-mhchem.sty \
tex-microtype.sty \
tex-multirow.sty \
tex-newunicodechar.sty \
tex-nowidow.sty \
tex-nth.sty \
tex-pdflscape.sty \
tex-report.cls \
tex-rotating.sty \
tex-setspace.sty \
tex-siunitx.sty \
tex-soul.sty \
tex-tabularx.sty \
tex-textcase.sty \
tex-textcomp.sty \
tex-textgreek.sty \
tex-tikz.sty \
tex-titlesec.sty \
tex-titling.sty \
tex-tocloft.sty \
tex-todonotes.sty \
tex-xcolor.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
