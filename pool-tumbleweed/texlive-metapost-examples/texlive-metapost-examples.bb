SUMMARY = "Example drawings using MetaPost"
DESCRIPTION = "These are a few (hundred) example pictures drawn with MetaPost, \
ranging from very simple (lines and circles) to rather \
intricate (uncommon geometric transformations, fractals, \
bitmap, etc)."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-metapost-examples-2026.226.svn15878-61.2.noarch.rpm"
RPM_HASH = "dca7436a865605d9e9f5a1dde1cf1a41e768e5e6d2d8be49d7f1d473fc7c472b7297c3eb553a885060627f85eb0efc9964bc7922db82eb28ad4af546955d39b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-metapost-examples"

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
