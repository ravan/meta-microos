SUMMARY = "Typeset only parts of a document, with complete indexes etcetera"
DESCRIPTION = "This package helps you if you want to produce separate printed \
volumes from one LaTeX document, as well as one comprehensive, \
'all-inclusive' version. It suppresses the part of the table of \
contents that are not typeset, while counters, definitions, \
index entries etc. are kept consistent throughout the input \
file."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn75878"

RPM_NAME = "texlive-volumes-2026.226.1.0svn75878-60.2.noarch.rpm"
RPM_HASH = "1a2f24413a5cb9a5c8c6597c7dc99845f33901474c40ebb40f5a3ae2e3c0eea3b48662f248987fbc6908d04ae866a79134cfed7089e1631ce8d2a2dd397c0c35"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-nowtoaux.sty \
tex-volumes.sty \
texlive-volumes"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-scrlfile.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
