SUMMARY = "Serbian language module for glossaries package"
DESCRIPTION = "Serbian language module for glossaries package."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn35665"

RPM_NAME = "texlive-glossaries-serbian-2026.226.1.0svn35665-60.4.noarch.rpm"
RPM_HASH = "b206c71f507c5c77570a4a8bdbe9de0901e9f0a28febe2053e6e2a580dedf7804fb18ea195ed77645614345d345c91291da305d1369d25b4414a04a272cf0e2f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-glossaries-serbian-noenc.ldf \
tex-glossaries-serbian-utf8.ldf \
tex-glossaries-serbian.ldf \
texlive-glossaries-serbian"

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
