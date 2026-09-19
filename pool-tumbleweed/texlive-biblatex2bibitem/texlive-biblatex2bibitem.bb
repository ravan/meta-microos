SUMMARY = "Convert BibLaTeX-generated bibliography to bibitems"
DESCRIPTION = "Some journals accept the reference list only as \\bibitems. If \
you use BibTeX, there is no problem: just paste the content of \
the .bbl file into your document. However, there was no \
out-of-the-box way to do the same for biblatex, and you had to \
struggle with searching appropriate .bst files, or formatting \
your reference list by hand, or something like that. Using the \
workaround provided by this package solves the problem."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2.2svn77682"

RPM_NAME = "texlive-biblatex2bibitem-2026.226.0.0.2.2svn77682-61.2.noarch.rpm"
RPM_HASH = "ceb536e9cedbb6ba875ba7d3841bed737cf29709df74dbf62415b3abf4583b36e6b6e0022b05460484224f9596cd5ac1e2fb71fe417f77fc180639b99cb66ed6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-biblatex2bibitem.sty \
texlive-biblatex2bibitem"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-biblatex.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
