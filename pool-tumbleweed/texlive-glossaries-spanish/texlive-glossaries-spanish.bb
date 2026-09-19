SUMMARY = "Spanish language module for glossaries package"
DESCRIPTION = "Spanish language module for glossaries package."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn35665"

RPM_NAME = "texlive-glossaries-spanish-2026.226.1.0svn35665-60.4.noarch.rpm"
RPM_HASH = "0c64cead85e5f44825131a68c8db005fab25acd2330f830e74ecd0b7c843b1cf0acfa9cb7567858b32fc38c2694d8fc9992884779ae7f61e61c83e1fcdabeb21"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-glossaries-spanish-noenc.ldf \
tex-glossaries-spanish-utf8.ldf \
tex-glossaries-spanish.ldf \
texlive-glossaries-spanish"

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
