SUMMARY = "Cyrillic bibtex and makeindex"
DESCRIPTION = "The cyrillic-bin package"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn62517"

RPM_NAME = "texlive-cyrillic-bin-2026.226.svn62517-61.2.noarch.rpm"
RPM_HASH = "dc7e5d9bd360e63796029a57dacd8ed397b9ffba11deec071cbbac35ee5c8e898e3fdb8e8b75309c60dc24f949b0f1244b30df8d2e1316bd82ac93524a3e6942"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cyrillic-bin"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-cyrillic-bin-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
