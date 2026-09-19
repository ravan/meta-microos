SUMMARY = "Editorial Notes for LaTeX documents"
DESCRIPTION = "This package defines a couple of editorial notes that simplify \
collaboration on a LaTeX text. These allow authors to annotate \
status information in the source. In draft mode, the \
annotations are shown for communication, and in publication \
mode these are suppressed."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.8svn25231"

RPM_NAME = "texlive-ed-2026.226.1.8svn25231-61.4.noarch.rpm"
RPM_HASH = "0150b9576542423d414e502fee14f68a5ecbb460857c8854c5f2b6b3d2b407034bb6c15433de554b520b1e0a34dc12ac9fc2cfd37c37ec2b3a4623292084cbd1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ed.sty \
texlive-ed"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-paralist.sty \
tex-verbatim.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
