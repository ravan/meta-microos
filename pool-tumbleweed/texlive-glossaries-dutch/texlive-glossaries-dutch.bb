SUMMARY = "Dutch language module for glossaries package"
DESCRIPTION = "Dutch language module for glossariesr package."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn35685"

RPM_NAME = "texlive-glossaries-dutch-2026.226.1.1svn35685-60.4.noarch.rpm"
RPM_HASH = "c96eb0d8f31a995b01926db194c0c51137425b76a2d8510fe683f11ff71e116d14f178e9f804d20a6b6bb2bb9482f57332a6052b1418fe264a3eb5b85e0568d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-glossaries-dutch.ldf \
texlive-glossaries-dutch"

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
