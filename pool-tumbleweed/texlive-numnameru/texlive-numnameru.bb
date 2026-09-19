SUMMARY = "Converts a number to the russian spelled out name"
DESCRIPTION = "This package converts a numerical number to the russian spelled \
out name of the number. For example, 1 - odin, 2 - dva, 12 - \
dvenadtsat'."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn44895"

RPM_NAME = "texlive-numnameru-2026.226.svn44895-61.2.noarch.rpm"
RPM_HASH = "92289c82e74c4ea1cecde5d62df2b23aa35e6f0c93365cc05f91e39b549b0168824623994f5bd7de4d165b3cd30f005828c3c4607e3591974e87c00f478f4f26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-numnameru.sty \
texlive-numnameru"

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
