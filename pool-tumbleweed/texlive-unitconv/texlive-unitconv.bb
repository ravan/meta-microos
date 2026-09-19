SUMMARY = "Convert a length into one with another unit"
DESCRIPTION = "This package defines two macros to convert a value with unit \
into one with another unit. Supported are all TeX-related \
units, and also km and m. The output can be in scientific \
notation for large values. The package only works with \
LuaLaTeX!"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.01svn76924"

RPM_NAME = "texlive-unitconv-2026.226.0.0.01svn76924-60.2.noarch.rpm"
RPM_HASH = "557d30f50b430602ce023ce7f4408b9204f5ff44ead2656acead5bc956ad802eec966da3837ed2396607cd24f83186f63053fcb00270e6ce7e4060cd9b0e1cb5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-unitconv.sty \
texlive-unitconv"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-iftex.sty \
tex-luacode.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
