SUMMARY = "Typeset theses for University of Florence (Italy)"
DESCRIPTION = "The package provides a class to typeset Ph.D., Master, and \
Bachelor theses that adhere to the publishing guidelines of the \
University of Florence (Italy)."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.6svn60698"

RPM_NAME = "texlive-unifith-2026.226.1.6svn60698-60.2.noarch.rpm"
RPM_HASH = "acf78477298f6432999501ddad79d1c467b9479c99f6f0575683fd0b5af31c6bffb995462f556fdd00990f16bfffbd3b8f268ee1045b2b4d1945cb3da8eb9513"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-unifith.cls \
texlive-unifith"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-book.cls \
tex-booktabs.sty \
tex-caption.sty \
tex-color.sty \
tex-etoolbox.sty \
tex-fancyhdr.sty \
tex-fontenc.sty \
tex-fontspec.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-ifxetex.sty \
tex-lmodern.sty \
tex-textcomp.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
