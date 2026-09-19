SUMMARY = "Draw tree structures"
DESCRIPTION = "The package offers support for drawing tree diagrams, and is \
especially suitable for linguistics use. It allows trees to be \
specified in a simple bracket notation, automatically \
calculates branch sizes, and supports both DVI/PostScript and \
PDF output by use of pict2e facilities. The package is a \
development of the existing qobitree package, offering a new \
front end."
LICENSE = "LPPL-1.0"

PV = "2026.226.3.1bsvn15878"

RPM_NAME = "texlive-qtree-2026.226.3.1bsvn15878-60.4.noarch.rpm"
RPM_HASH = "42b2c9a5f59eec332514acb51ee26a721355da12403af9bb41643f32a8fc9d53b9b2305b8bd78255fba4ca353fd15373e57a716e1a9c86383c0a255b1ae07de3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-qtree.sty \
texlive-qtree"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pict2e.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
