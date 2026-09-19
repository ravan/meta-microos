SUMMARY = "BibLaTeX/Biber 'cheat sheet'"
DESCRIPTION = "A BibLaTeX/Biber 'cheat sheet' which I wrote because I wanted \
one to distribute to students, but couldn't find an existing \
one."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn44685"

RPM_NAME = "texlive-biblatex-cheatsheet-2026.226.svn44685-61.2.noarch.rpm"
RPM_HASH = "ce1d2ba7821de0fad131246aac2f5527450e1841bd7ed75c0ff4615903af0e78991b152d818ad5e115b910d86e71d8e998775d8e8c80618b91a2d7af71d9ca33"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-cheatsheet"

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
