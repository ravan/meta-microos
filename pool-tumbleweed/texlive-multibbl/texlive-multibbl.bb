SUMMARY = "Multiple bibliographies"
DESCRIPTION = "The package multibbl redefines the standard bibliographic \
commands so that one can generate multiple reference sections. \
Each section has it own auxiliary file (for use with BibTeX) \
and title."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn15878"

RPM_NAME = "texlive-multibbl-2026.226.1.1svn15878-61.2.noarch.rpm"
RPM_HASH = "1bb62f48a32d16105b81013250fcbe59ea829bb9c294e7f40e7a6299895632df3279518c825f785f448678d3761d5ea6bcf78f0a379683173a7afd177f9b8d09"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-multibbl.sty \
texlive-multibbl"

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
