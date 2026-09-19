SUMMARY = "Inclusion of Gnuplot graphs in ConTeXt"
DESCRIPTION = "Enables simple creation and inclusion of graphs with Gnuplot. \
The package writes a script into temporary file, runs Gnuplot \
and includes the resulting graphic directly into the document. \
See the ConTeXt Garden package page for further details."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn75301"

RPM_NAME = "texlive-context-gnuplot-2026.226.svn75301-61.2.noarch.rpm"
RPM_HASH = "4828eaa25f83419a2ac9c65d7efd0ceab0a3fa72420eba34c18ff6a6c79623312450791cb6ad661b10d5ff7d186aa76a551410256c9aa0bf108b127edb6364a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-context-gnuplot"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-context \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
