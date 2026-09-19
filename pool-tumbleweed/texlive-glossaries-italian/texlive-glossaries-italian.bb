SUMMARY = "Italian language module for glossaries package"
DESCRIPTION = "Italian language module for glossaries package."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn35665"

RPM_NAME = "texlive-glossaries-italian-2026.226.1.0svn35665-60.4.noarch.rpm"
RPM_HASH = "02afd6245c5c667788101913db55ee74c57448314ed6266d8c90ae3b36cde78db63a1518c5caec923601ce0ec0b103d26b7ea8c9d832e42940f8d0c5589c2170"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-glossaries-italian.ldf \
texlive-glossaries-italian"

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
