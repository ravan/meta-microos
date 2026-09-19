SUMMARY = "North Dakota State University disquisition class"
DESCRIPTION = "A class for generating disquisitions, intended to be in \
compliance with North Dakota State University requirements."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn46639"

RPM_NAME = "texlive-ndsu-thesis-2026.226.svn46639-61.2.noarch.rpm"
RPM_HASH = "3c3d3ba21c3f31a7e72f075c621163cd60b431688c5b88ba9c9c4da0eea057089f198e1389091c731d0da038b5f880741dd5899179bfb6927200ed3d5f24c7f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ndsu-thesis.cls \
texlive-ndsu-thesis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-book.cls \
tex-caption.sty \
tex-comment.sty \
tex-etoolbox.sty \
tex-geometry.sty \
tex-hyperref.sty \
tex-ifthen.sty \
tex-indentfirst.sty \
tex-inputenc.sty \
tex-newfloat.sty \
tex-setspace.sty \
tex-tikz.sty \
tex-titlesec.sty \
tex-titling.sty \
tex-tocbibind.sty \
tex-tocloft.sty \
tex-totalcount.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
