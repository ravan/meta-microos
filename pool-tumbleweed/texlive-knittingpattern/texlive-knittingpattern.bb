SUMMARY = "Create knitting patterns"
DESCRIPTION = "The class provides a simple, effective method for knitters to \
produce high-quality, attractive patterns using LaTeX. It does \
this by providing commands to handle as much of the layout of \
the document as possible, leaving the author free to \
concentrate on the pattern."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn17205"

RPM_NAME = "texlive-knittingpattern-2026.226.svn17205-63.2.noarch.rpm"
RPM_HASH = "c83f6a8e32cd2b8ee69fc93bba6de4f9b5145cc88999acc98ebab0a62cfe391c31a4731c3605d01c16a09ac27a5423c16986daaa0bb0ed8e41ffadfa2ea1a279"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-knittingpattern.cls \
texlive-knittingpattern"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-calc.sty \
tex-fancyhdr.sty \
tex-float.sty \
tex-graphicx.sty \
tex-longtable.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
