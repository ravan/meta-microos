SUMMARY = "Creating covers for music cassettes"
DESCRIPTION = "A package for creating MC-covers on your own. It allows the \
creation of simple covers as well as covers with an additional \
page for more information about the cassette (table of contents \
e.g.). The rotating package is required."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-mceinleger-2026.226.svn15878-59.2.noarch.rpm"
RPM_HASH = "43743d3679ca63cf3d3e5b6d98f3ec1129fc60cc95176b67a111d572bb6a0bc31f705103dbd92470fd802c4f11f35d44af337699f4dbb343768268101c5efd87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mceinleger.sty \
texlive-mceinleger"

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
