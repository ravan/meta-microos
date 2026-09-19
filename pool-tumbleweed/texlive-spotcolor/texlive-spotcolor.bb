SUMMARY = "Spot colours for pdfLaTeX"
DESCRIPTION = "This package provides procedures for using spot colours in \
LaTeX documents and the generated pdf files. Predefined \
templates for PANTONE and HKS colour spaces are included but \
new ones can easily be defined."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn15878"

RPM_NAME = "texlive-spotcolor-2026.226.1.2svn15878-64.2.noarch.rpm"
RPM_HASH = "a47f783aa486efcf0fcc664a6ad83034d9f65cff6ff8006042d2818f1db894eaf1811b403b4589cfc3615350f3451962e5fe5021f4e25a31b21c637ae7803de8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-spotcolor.sty \
tex-spotcolorhks.tex \
tex-spotcolorpantone.tex \
texlive-spotcolor"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphics.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
