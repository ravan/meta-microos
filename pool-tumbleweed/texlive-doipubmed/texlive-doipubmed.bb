SUMMARY = "Special commands for use in bibliographies"
DESCRIPTION = "The package provides the commands \\doi, \\pubmed and \\citeurl. \
These commands are primarily designed for use in \
bibliographies. A LaTeX2HTML style file is also provided."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.01svn15878"

RPM_NAME = "texlive-doipubmed-2026.226.1.01svn15878-59.2.noarch.rpm"
RPM_HASH = "32ae4acca9310de6551f8764f353c74412f4bee2fbcfff4e4fd20711e4756180564aeeb38c3ee4aee6a75f3d58b0ed867dbae376e67fc635a558cfe8c46570e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-doipubmed.sty \
texlive-doipubmed"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-url.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
