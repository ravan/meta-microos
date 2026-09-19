SUMMARY = "A Russian translation of the MetaPost manual"
DESCRIPTION = "A translation of the user manual, as distributed with MetaPost \
itself."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.004svn15878"

RPM_NAME = "texlive-mpman-ru-2026.226.1.004svn15878-61.2.noarch.rpm"
RPM_HASH = "550711c792e13a38fc2293427270e8dbe888c4a6aae16c7a45e5aff788fa629fee43079c5dbb591f8cafcf2220860531154a614dbc7ee08f38c83d7a51c80511"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mpman-ru"

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
