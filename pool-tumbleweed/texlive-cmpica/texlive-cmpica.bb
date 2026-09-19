SUMMARY = "A Computer Modern Pica variant"
DESCRIPTION = "An approximate equivalent of the Xerox Pica typeface; the font \
is optimised for submitting fiction manuscripts to mainline \
publishers. The font is a fixed-width one, rather less heavy \
than Computer Modern typewriter. Emphasis for bold-face comes \
from a wavy underline of each letter. The two fonts are \
supplied as Metafont source."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-cmpica-2026.226.svn15878-60.2.noarch.rpm"
RPM_HASH = "5834b3844d84b0e7000781908df3f2a9ae0000ce6738ef17511d6cb5d5edf9119fe943654be8a9255db091f5cdea720568c197d3438fd63daf645c5427e6d121"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cmpica.tfm \
tex-cmpicab.tfm \
tex-cmpicati.tfm \
texlive-cmpica"

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
