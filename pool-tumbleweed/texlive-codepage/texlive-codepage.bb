SUMMARY = "Support for variant code pages"
DESCRIPTION = "The package provides a mechanism for inputting non-ASCII text. \
Nowadays, the job is mostly done by the inputenc package in the \
LaTeX distribution."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn51502"

RPM_NAME = "texlive-codepage-2026.226.svn51502-60.2.noarch.rpm"
RPM_HASH = "9e0ca8a64a12122820894c541c9ecd5d27800bd9ed079460e94a628f638458302ba9481e5cb2328d3eb1238fee4cf9ba644d6f32461a971c61d3dbfa9b3a33e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-code437.tex \
tex-code850.tex \
tex-codeiso1.tex \
tex-codemac.tex \
tex-codepage.sty \
tex-initcar.tex \
tex-shapecm.tex \
tex-shapedc.tex \
texlive-codepage"

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
