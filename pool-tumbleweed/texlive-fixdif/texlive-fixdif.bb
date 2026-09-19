SUMMARY = "Macros for typesetting differential operators"
DESCRIPTION = "This package redefines the \\d command in LaTeX and provides an \
interface to define new commands for differential operators. It \
is compatible with pdfTeX, XeTeX and LuaTeX, and can also be \
used with the unicode-math package."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.1svn66606"

RPM_NAME = "texlive-fixdif-2026.226.2.1svn66606-59.2.noarch.rpm"
RPM_HASH = "7bc38fb9fafd0388e1a2d7f752aa66a638e4cc0c499c6448588d217d3d817ecd9e75faed2515eac0ee4192eeca2eca967252d8fe938edb12a6870cd30ac23dad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fixdif.sty \
texlive-fixdif"

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
texlive-scripts-bin"

inherit rpm
