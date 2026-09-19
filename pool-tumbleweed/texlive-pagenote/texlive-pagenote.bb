SUMMARY = "Notes at end of document"
DESCRIPTION = "The pagenote package provides tagged notes on a separate page \
(also known as 'end notes'). Unless the memoir class is used, \
the package requires the ifmtarg package."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1asvn77682"

RPM_NAME = "texlive-pagenote-2026.226.1.1asvn77682-58.2.noarch.rpm"
RPM_HASH = "a9bba2f88917c204313641a41a41a167dc331936649959946f112ad3f5481033a75f0cd200422d383c7f04f84196f2069526db27540c53e27434f4e67227de29"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pagenote.sty \
texlive-pagenote"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifmtarg.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
