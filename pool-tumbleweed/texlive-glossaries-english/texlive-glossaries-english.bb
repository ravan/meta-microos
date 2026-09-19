SUMMARY = "English language module for glossaries package"
DESCRIPTION = "English language module for glossariesr package."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn35665"

RPM_NAME = "texlive-glossaries-english-2026.226.1.0svn35665-60.4.noarch.rpm"
RPM_HASH = "65604e6a5be99116d1b02777419117c3782abfd8b952428aa80974290e1b6f41a6fb68e6c9c41d1fb48a05ca00f74dca47ce94861ecc56b88849701530eb25ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-glossaries-english.ldf \
texlive-glossaries-english"

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
