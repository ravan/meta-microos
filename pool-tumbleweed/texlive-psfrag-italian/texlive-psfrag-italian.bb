SUMMARY = "PSfrag documentation in Italian"
DESCRIPTION = "This is a translation of the documentation that comes with the \
psfrag documentation."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-psfrag-italian-2026.226.svn15878-59.2.noarch.rpm"
RPM_HASH = "73d8cd4e7d4a4efa975c1f36a6c2bef27d4f54ccf48751ee057504dbac3c6f6cafd54d62238513b8f0965923d88a4a0bfb96e1b711993b22d6089a1a611775ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-psfrag-italian"

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
