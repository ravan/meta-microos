SUMMARY = "Fonts for typesetting Ogham script"
DESCRIPTION = "The font provides the Ogham alphabet, which is found on a \
number of Irish and Pictish carvings dating from the 4th \
century AD. The font is distributed as Metafont source, which \
has been patched (with the author's permission) for stability \
at different output device resolutions. (Thanks are due to \
Peter Flynn and Dan Luecking.)"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.svn24876"

RPM_NAME = "texlive-ogham-2026.226.svn24876-61.2.noarch.rpm"
RPM_HASH = "fc8ae20bfbf6faeac8b82390aacd453b136b8a00f40db89e39f62bd528fe8e3e0e2d64f4bb6615fe3e3f26bc5e56f66aff61246a43d31688194ec6f56b405f4d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ogham.tfm \
texlive-ogham"

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
