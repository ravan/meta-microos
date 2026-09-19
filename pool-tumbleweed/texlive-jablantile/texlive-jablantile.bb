SUMMARY = "Metafont version of tiles in the style of Slavik Jablan"
DESCRIPTION = "This is a small Metafont font to implement the modular tiles \
described by Slavik Jablan. For an outline of the theoretical \
structure of the tiles, see (for example) Jablan's JMM 2006 \
Exhibit."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.svn16364"

RPM_NAME = "texlive-jablantile-2026.226.svn16364-63.2.noarch.rpm"
RPM_HASH = "0eb8dd4de01867c423e0f449bc1cb4775f5386852bef31ca956f9a8fe5503748b0c26bc4d7f8807e67ce614fe36920766588bf37b10a77960099be06f1c5cac0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-jablantile"

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
