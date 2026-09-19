SUMMARY = "Special fonts for ConTeXt"
DESCRIPTION = "The jmn package"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn45751"

RPM_NAME = "texlive-jmn-2026.226.svn45751-63.2.noarch.rpm"
RPM_HASH = "56b01957263c6a036ed99f39d95edb4f2af6ba6e34742f38d9a29ec23698b7653ad75eeda3d93315022697b9dd133273e7494711e0ba9c60509e0600a1f635e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hans-sh.tfm \
tex-hans.enc \
tex-hans.map \
tex-hans.tfm \
texlive-jmn"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-jmn-fonts \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
