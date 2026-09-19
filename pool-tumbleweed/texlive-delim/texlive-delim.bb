SUMMARY = "Simplify typesetting mathematical delimiters"
DESCRIPTION = "The package permits simpler control of delimiters without \
excessive use of \\big... commands (and the like)."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn23974"

RPM_NAME = "texlive-delim-2026.226.1.0svn23974-59.2.noarch.rpm"
RPM_HASH = "4b3aff37d5adfc20162e7c1095a6604ea94d86ba584aaaf323f390ab0c399f3c72be8a486d6e335c305296a253eadcf14a370d3a9d0290c03f4bb62382b9ebe8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-delim.sty \
texlive-delim"

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
