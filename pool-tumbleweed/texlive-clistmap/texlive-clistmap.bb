SUMMARY = "Map and iterate over LaTeX3 clists"
DESCRIPTION = "This package provides a key-based interface for defining \
templates whose job is to partition LaTeX3 clists and map \
differentiatedly across its components."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn76924"

RPM_NAME = "texlive-clistmap-2026.226.1.2svn76924-60.2.noarch.rpm"
RPM_HASH = "97e6e6065fd36414f53891caec2334777bbe5e45e69bcecc7999f3ee1be88554b0921078563f70a90b923d7525f311dca3c433013367c00df4aa12ff2ed20577"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-clistmap.sty \
texlive-clistmap"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-erw-l3.sty \
tex-l3keys2e.sty \
tex-xparse.sty \
tex-xtemplate.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
