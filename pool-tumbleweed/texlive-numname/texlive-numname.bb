SUMMARY = "Convert a number to its English expression"
DESCRIPTION = "The package can generate cardinal (one, two, ...) and ordinal \
(first, second, ...) numbers. The code derives from the memoir \
class, and is extracted for the convenience of non-users of \
that class."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn18130"

RPM_NAME = "texlive-numname-2026.226.svn18130-61.2.noarch.rpm"
RPM_HASH = "e63a55669cfc301f1206ef01ac872b2e6ea0f13306ea10ea3e73659fdea76627b7743e84cb84d4e7419fd4ebde11b78990646f079fcdd8a0dcb1f00bb5a0f9d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-numname.sty \
texlive-numname"

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
