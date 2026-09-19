SUMMARY = "Horizontal flipping of pages with pdfLaTeX"
DESCRIPTION = "The package allows the production of a document with pages \
'mirrored'. This is sometimes required by publishers who want \
camera-ready documents to be printed on transparent film (to be \
viewed from the 'wrong' side). The package only works with \
pdfLaTeX or LuaLaTeX in PDF output mode. Package everypage is \
required on LaTeX releases before Fall 2020."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0bsvn77682"

RPM_NAME = "texlive-flippdf-2026.226.2.0bsvn77682-59.2.noarch.rpm"
RPM_HASH = "6b4154144a356bd72fa7335ee341e1b5ceaeaee6bbfe11b93863837d8de721268b448efdf5341ff83b3428e4d3d4cf59b387be1eedd8c0acda73570dbbd11d67"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-flippdf-1x.sty \
tex-flippdf.sty \
texlive-flippdf"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-everypage.sty \
tex-iftex.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
