SUMMARY = "LuaTeX support for pdfTeX utility functions"
DESCRIPTION = "LuaTeX provides most of the commands of pdfTeX 1.40. However, a \
number of utility functions are not available. This package \
tries to fill the gap and implements some of the missing \
primitives using Lua."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.33svn77682"

RPM_NAME = "texlive-pdftexcmds-2026.226.0.0.33svn77682-58.2.noarch.rpm"
RPM_HASH = "84a5828cff793d7bac28e65baeff207dd9e7ef8ac6307b423c32501fb76cc90254c818e69d5c288a59bc1b2d3538dc46d7a86bc4089e0c486966a323766b4b8b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pdftexcmds.sty \
texlive-pdftexcmds"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-iftex.sty \
tex-infwarerr.sty \
tex-ltxcmds.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
