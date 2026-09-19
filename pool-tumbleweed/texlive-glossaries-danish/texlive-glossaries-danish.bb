SUMMARY = "Danish language module for glossaries package"
DESCRIPTION = "Danish language module for glossaries package."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn35665"

RPM_NAME = "texlive-glossaries-danish-2026.226.1.0svn35665-60.4.noarch.rpm"
RPM_HASH = "8c16ccccce2dbe0ba92ddab56ebc0a31e01bef55f793bc1f1ac7aac7bd13e62270fe7aa6902b4d55a2b32c72b67fb69376b890ee7600acd4baf2a287092cc233"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-glossaries-danish.ldf \
texlive-glossaries-danish"

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
