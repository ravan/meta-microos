SUMMARY = "An enhancement to package float using package tocbasic"
DESCRIPTION = "This package adds usage of package tocbasic to package float. \
This not only improves compatibility with KOMA-Script but also \
adds several new features to float like optional automatic \
entries to the table of contents for the lists of new floats, \
optional numbering of the lists of new floats etc."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn67945"

RPM_NAME = "texlive-floatbytocbasic-2026.226.1.0svn67945-60.2.noarch.rpm"
RPM_HASH = "4f5fc486b3c8c060d8154a997c0da559ea0809d7c5be6241aaef17823e5914317b564fcdf38a5f6f00652695f27dcc83e73be33e5ae0155d3adec3356e4c777e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-floatbytocbasic.sty \
texlive-floatbytocbasic"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-float.sty \
tex-floatrowbytocbasic.sty \
tex-tocbasic.sty \
tex-xparse.sty \
tex-xpatch.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
