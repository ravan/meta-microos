SUMMARY = "Supporting tools for Metafont: gftodvi, gftopk, gftype, mft"
DESCRIPTION = "A collection of programs (as web source) for processing the \
output of Metafont. They include: gftodvi (for making proof \
sheets of letters); gftopk (translate gf bitmap files to pk \
bitmaps); gftype (human-readable dump of gf files); mft \
(prettyprint Metafont source)."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.svn77830"

RPM_NAME = "texlive-mfware-2026.226.svn77830-61.2.noarch.rpm"
RPM_HASH = "2a75177429bbecc839cfd770a47e886e15be8ea35359883fc70a456453a9b51d471254412e2573b1030efc3ddf7535dae1ecdfaf4afec77ad7ec34f4c37258e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mfware"

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
texlive-mfware-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
