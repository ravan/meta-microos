SUMMARY = "Creating Venn diagrams with MetaPost"
DESCRIPTION = "MetaPost macros for venn diagrams."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-venn-2026.226.svn15878-60.2.noarch.rpm"
RPM_HASH = "38cc35925735e747d4255da60fc78ee2297d7abc9fa47bda22572517b5d2eb522ef2a4f482d27798d9e08920945515994b9e8db3aca64797b14277c78f577904"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-venn"

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
