SUMMARY = "Move floats to the top of the page"
DESCRIPTION = "The topfloat package"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn19084"

RPM_NAME = "texlive-topfloat-2026.226.svn19084-59.2.noarch.rpm"
RPM_HASH = "4f20719e74df39314b8e185bf0f2a397f840b4e48b1e17085dc6dd6d0e577bc0c8d46ed3aa3e66ff1f4a5710993fb44ae0ebcecadac40eef8fd20744c03b5d70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-topfloat.sty \
texlive-topfloat"

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
