SUMMARY = "Insertions that keep their place"
DESCRIPTION = "This TeX file provides various mechanisms (for plain TeX and \
close relatives) to let insertions (footnotes, topins, pageins, \
etc.) float within their appropriate section, but to prevent \
them from intruding into the following section, even when \
sections do not normally begin a new page. (If your sections \
normally begin a new page, just use \\supereject to flush out \
insertions.)"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.2.0svn15878"

RPM_NAME = "texlive-placeins-plain-2026.226.2.0svn15878-58.2.noarch.rpm"
RPM_HASH = "3de73187e27b6bc7137533b139d1130ffb19bc1ef15504064a62cd919fdde662713c674635d72d30f34d500fe64445c3c24b8f99474a90d9120f1d5980538739"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-placeins.tex \
texlive-placeins-plain"

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
