SUMMARY = "General looping macros for use with LaTeX"
DESCRIPTION = "The package provides efficient looping macros for processing \
both csv (separated-values) and nsv/tsv (non-separated values) \
lists. CSV lists which have associated parsers may be processed \
with the tools of the package."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3svn30704"

RPM_NAME = "texlive-loops-2026.226.1.3svn30704-61.2.noarch.rpm"
RPM_HASH = "e1fde6a3cf51358c9a9f5059f47177d02e449d30301a0ee8e3f1f7d3ac3593cb9de2edeb98bdcb6402db85934a79b732c14a3f27a7b2c58d9a263329171719c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-loops.sty \
texlive-loops"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-skeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
