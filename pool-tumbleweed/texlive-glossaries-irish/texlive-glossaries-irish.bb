SUMMARY = "Irish language module for glossaries package"
DESCRIPTION = "Irish language module for glossariesr package."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn35665"

RPM_NAME = "texlive-glossaries-irish-2026.226.1.0svn35665-60.4.noarch.rpm"
RPM_HASH = "a54c6f1c51fb8beaf7d5638cdac6f1488bf05563f925649abd064fe0464b726cd1814a723577094bbec55800e5aa8106ea28f2666359b96533f3f2c992b8a3ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-glossaries-irish-noenc.ldf \
tex-glossaries-irish-utf8.ldf \
tex-glossaries-irish.ldf \
texlive-glossaries-irish"

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
