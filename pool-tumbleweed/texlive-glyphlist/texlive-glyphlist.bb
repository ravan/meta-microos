SUMMARY = "Adobe Glyph List and TeX extensions"
DESCRIPTION = "Map between traditional Adobe glyph names and Unicode points, \
maintained by Adobe. The additional texglyphlist.txt is \
maintained as part of lcdf-typetools."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn54074"

RPM_NAME = "texlive-glyphlist-2026.226.svn54074-60.4.noarch.rpm"
RPM_HASH = "2b73b4bd9d9495082d3f1758b6a8c14ae2c90c9c17512489f616d21612beb2d4a9e9d70ba62d62c036f89cd2135dbd64102698cec9e8a9a10b9fb84055218ba2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-glyphlist"

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
