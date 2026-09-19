SUMMARY = "Typeset theses for Sapienza-University, Rome"
DESCRIPTION = "The class will typeset Ph.D., Master, and Bachelor theses that \
adhere to the publishing guidelines of the Sapienza University \
of Rome."
LICENSE = "LPPL-1.0"

PV = "2026.226.5.1svn63810"

RPM_NAME = "texlive-sapthesis-2026.226.5.1svn63810-60.2.noarch.rpm"
RPM_HASH = "2c9ea2de1ea4032cf8d45097be0829c513d61812d2c62d501a232aca511ae9dff942f4f0ec5dae415c1cb838b102e7082a5e2ba4b1a3be087459eed93e6a0706"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-sapthesis.cls \
texlive-sapthesis"

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
