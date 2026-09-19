SUMMARY = "Manages subseries with BibLaTeX"
DESCRIPTION = "Some publishers organize book series with subseries. In this \
case, two numbers are associated with one volume: the number \
inside the series and the number inside the subseries. That is \
the case of the series Corpus Scriptorium Christianorum \
Orientalium published by Peeters. This package provides new \
fields to manage such system."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2.0svn76790"

RPM_NAME = "texlive-biblatex-subseries-2026.226.1.2.0svn76790-61.2.noarch.rpm"
RPM_HASH = "5941e635a52256687d1652b4a74976d826a52f1b976aee1ab10eb96aab4abdb78b8d41501d108c7d83acea5d7f37c7442c57b5b5ff00061be27aff9079e22d79"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-subseries.bbx \
texlive-biblatex-subseries"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xpatch.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
