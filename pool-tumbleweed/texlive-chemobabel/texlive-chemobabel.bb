SUMMARY = "Convert chemical structures from ChemDraw, MDL molfile or SMILES using Open Babel"
DESCRIPTION = "This package provides a way to convert and include chemical \
structure graphics from various chemical formats, such as \
ChemDraw files, MDL molfile or SMILES notations using Open \
Babel. To use this LaTeX package, it is necessary to enable \
execution of the following external commands via latex \
-shell-escape. obabel (Open Babel) inkscape or rsvg-convert \
(for SVG -> PDF/EPS conversion) pdfcrop or ps2eps (optional; \
for cropping large margins of PDF/EPS)"
LICENSE = "BSD-3-Clause"

PV = "2026.226.0.0.9lsvn64778"

RPM_NAME = "texlive-chemobabel-2026.226.0.0.9lsvn64778-60.2.noarch.rpm"
RPM_HASH = "6ec072c3033671fa94e529efc0750ca6b435c5deb4634d0046c654fa521d3747d7d8d2ea140ad18211fa8e9e683eae5bd59c9cabab28fb28f01e82a9270531d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-chemobabel.sty \
texlive-chemobabel"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphicx.sty \
tex-verbatim.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
