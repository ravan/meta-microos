SUMMARY = "How to include an SVG image in LaTeX using Inkscape"
DESCRIPTION = "The document demonstrates the use of SVG images in LaTeX \
documents. Using the 'PDF+LaTeX output' option of Inkscape, it \
is possible to include SVG in documents, in which LaTeX \
typesets the text. This results in uniform text style \
throughout the document, including text in images; moreover, \
LaTeX commands may be used in the image's text, providing such \
things as mathematics and references. The document also \
describes how to automate the conversion from SVG to PDF+LaTeX \
using Inkscape."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn32199"

RPM_NAME = "texlive-svg-inkscape-2026.226.svn32199-64.2.noarch.rpm"
RPM_HASH = "5bdfb5ed0482df1549569ec4f2e89b4132beba7ee3b451b5eda49adc7a3cc84be684f37a9f3aad16f4c7aaab70f179bee64d747111b48c76e103162037850edc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-svg-inkscape"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
