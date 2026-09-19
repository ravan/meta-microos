SUMMARY = "A font for orkhun script"
DESCRIPTION = "The font covers an old Turkic script. It is provided as \
Metafont source."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-orkhun-2026.226.svn15878-61.2.noarch.rpm"
RPM_HASH = "412075816da4cb4afa0c244523072fd55f53dfa8bc2619e0c7a4a90cb69b3ff3b5b1e5cb34bc15ec9a5faefd4a257f9331a2401d0950c0ca3be8d3d3b6a698ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-orhant11.tfm \
tex-orhant14.tfm \
tex-orhant16.tfm \
tex-orhant20.tfm \
tex-orhant25.tfm \
texlive-orkhun"

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
