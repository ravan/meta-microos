SUMMARY = "Italian translations of some old amsmath documents"
DESCRIPTION = "The documents are: diffs-m.txt of December 1999, and \
amsmath.faq of March 2000."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn22930"

RPM_NAME = "texlive-amsmath-it-2026.226.svn22930-61.2.noarch.rpm"
RPM_HASH = "77f4880dbc9c7aa61a885fa12a2f1802c9451082a150e295bf2c5f775a8dfe90cefac3f82c409815097991c12f41d3364b4b40c89bb185d640a00fed2d301fa8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-amsmath-it"

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
