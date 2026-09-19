SUMMARY = "Typeset papers conforming to the stylesheet of the Cascadilla Proceedings Project"
DESCRIPTION = "The class provides an extension of the standard LaTeX article \
class that may be used to typeset papers conforming to the \
stylesheet of the Cascadilla Proceedings Project, which is used \
by a number of linguistics conference proceedings (e.g., \
WCCFL)."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.8.2svn25144"

RPM_NAME = "texlive-cascadilla-2026.226.1.8.2svn25144-59.2.noarch.rpm"
RPM_HASH = "387e1b08eecbbc31a2be588c7798574543ce00a0c8de09f53d20755936238a6fd1bc4bcec82398eb30523a85ee0c80a622b274f5dcdeeb62b0485d9c2c4e0ab0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cascadilla.cls \
texlive-cascadilla"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-caption.sty \
tex-fancyhdr.sty \
tex-geometry.sty \
tex-ifthen.sty \
tex-indentfirst.sty \
tex-natbib.sty \
tex-times.sty \
tex-titlesec.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
