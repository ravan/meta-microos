SUMMARY = "Adjust TeX logos, with font detection"
DESCRIPTION = "This package extends the metalogo package to automatically \
adjust the appearance of the logos TeX, LaTeX, LaTeX2e, \
XeLaTeX, and LuaLaTeX, depending on the font detected or the \
option given to metalogox. Most of the serif and sans fonts \
listed at The LaTeX Font Catalogue are supported. The package \
also supports the hologo and hvlogos packages."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.07svn77682"

RPM_NAME = "texlive-metalogox-2026.226.1.07svn77682-61.2.noarch.rpm"
RPM_HASH = "77707a0e95f925464fc73cc8513ff8c2dfce58e4a3a61b91c5f92bdbdcdfbde59376f30d4dbbd376147044a1dbd2d901c35007f37ade32ca1bcc3f9934e92b21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-metalogox.sty \
texlive-metalogox"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-metalogo.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
