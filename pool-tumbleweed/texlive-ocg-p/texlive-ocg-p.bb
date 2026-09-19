SUMMARY = "PDF OCG support in LaTeX"
DESCRIPTION = "The package provides OCG (Optional Content Groups) support \
within a PDF document, replacing the ocg.sty distributed with \
asymptote. Nested OCGs are supported. The package may be used \
with pdfLaTeX and XeLaTeX."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.4svn28803"

RPM_NAME = "texlive-ocg-p-2026.226.0.0.4svn28803-61.2.noarch.rpm"
RPM_HASH = "86e2ba17f370c3030be0400d1a96d4536475ac175fe53d5e48250101298300c015c23dea1c4d50685dfa0332b7bb361cf5564196aa124660ba351b81ad3d9e64"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ocg-p.sty \
texlive-ocg-p"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-datatool.sty \
tex-eso-pic.sty \
tex-ifpdf.sty \
tex-ifxetex.sty \
tex-listings.sty \
tex-tikz.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
