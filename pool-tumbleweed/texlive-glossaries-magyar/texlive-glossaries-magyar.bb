SUMMARY = "Magyar language module for glossaries package"
DESCRIPTION = "Magyar language module for glossariesr package."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn35665"

RPM_NAME = "texlive-glossaries-magyar-2026.226.1.0svn35665-60.4.noarch.rpm"
RPM_HASH = "c7522c8df120d25e9175fc3d6fbb4b388391462889ef049b5c5fb9c3a49a5ed5a2e5743cdad5eab76c2f5fc36197955fbf1999dcbc953581f7a783fbe9fd88f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-glossaries-magyar-noenc.ldf \
tex-glossaries-magyar-utf8.ldf \
tex-glossaries-magyar.ldf \
texlive-glossaries-magyar"

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
