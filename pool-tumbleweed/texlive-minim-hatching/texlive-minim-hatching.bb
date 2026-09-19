SUMMARY = "Create tiling patterns with the minim-mp MetaPost processor"
DESCRIPTION = "This is a small proof-of-concept library of tiling patterns for \
use with the minim-mp MetaPost processor."
LICENSE = "LPPL-1.0"

PV = "2026.226.2022_1.1svn70885"

RPM_NAME = "texlive-minim-hatching-2026.226.2022_1.1svn70885-61.2.noarch.rpm"
RPM_HASH = "70ca864e1dfa3df0358cd293dd88d87b0491558525d5f4285e9989a098aade945aab5cc7963abd29e93c38b67da80dccfbdee7c3e839106a01fa741d35f36976"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-minim-hatching"

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
