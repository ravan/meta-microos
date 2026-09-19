SUMMARY = "A plain-pdfTeX toolbox for creating beautiful documents"
DESCRIPTION = "pdfToolbox is a toolbox of various 'subpackages' intended for \
programming and creating beautiful plain-pdfTeX documents. It \
is an amalgamation of the following 'subpackages' (in the \
future there will be an ability to access each one by itself): \
pdfData -- for storing and manipulating data; pdfDstruct -- for \
managing the layout and structure of your document; pdfGraphics \
-- for adding some color and illustrations to your document. \
pdfToolbox currently only works with pdfTeX. It is not \
compatible with any form of LaTeX, and currently does not work \
with XeTeX or LuaTeX (though hopefully LuaTeX support will be \
added in the future)."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn74832"

RPM_NAME = "texlive-pdftoolbox-2026.226.0.0.2svn74832-58.2.noarch.rpm"
RPM_HASH = "a9b894397cb9d601bf79c8c5fb91b3e5ea90587e34c4002ee9e0c9d8be9d1ded6d6adea32f8947ced53c12e786d7119a0442b93697c0266120e462c27bb68d7f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pdfToolbox.tex \
tex-ptb-arrays.tex \
tex-ptb-colorboxes.tex \
tex-ptb-colors.tex \
tex-ptb-counters.tex \
tex-ptb-dictionaries.tex \
tex-ptb-fonts.tex \
tex-ptb-hooks.tex \
tex-ptb-hyperlinks.tex \
tex-ptb-index.tex \
tex-ptb-key-value.tex \
tex-ptb-layout.tex \
tex-ptb-listings.tex \
tex-ptb-lists.tex \
tex-ptb-math.tex \
tex-ptb-mergesort.tex \
tex-ptb-pdfData.tex \
tex-ptb-pdfDstruct.tex \
tex-ptb-pdfGraphics.tex \
tex-ptb-pdfdraw-utils.tex \
tex-ptb-pdfdraw.tex \
tex-ptb-stack.tex \
tex-ptb-syntax-C.tex \
tex-ptb-syntax-TeX.tex \
tex-ptb-tableofcontents.tex \
tex-ptb-utils.tex \
texlive-pdftoolbox"

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
