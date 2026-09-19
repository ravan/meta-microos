SUMMARY = "A Scientific Times-like font with support for mathematical typesetting"
DESCRIPTION = "XITS is a Times-like font for scientific typesetting with \
proper mathematical support for modern, Unicode and OpenType \
capable TeX engines, namely LuaTeX and XeTeX. For use with \
LuaLaTeX or XeLaTeX, support is available from the fontspec and \
unicode-math packages."
LICENSE = "OFL-1.1"

PV = "2026.226.1.302svn55730"

RPM_NAME = "texlive-xits-2026.226.1.302svn55730-59.4.noarch.rpm"
RPM_HASH = "02c40b0075409343cdd5febfcb7b5d44d1d2918ab79855c5e5a1ad9a7a43a63f2863ae19db6326e7320fab31a18925fee20b0f047d697114fa996ab7cfb4d213"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xits"

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
texlive-scripts-bin \
texlive-xits-fonts"

inherit rpm
