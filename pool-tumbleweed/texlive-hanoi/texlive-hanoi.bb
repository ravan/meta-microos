SUMMARY = "Tower of Hanoi in TeX"
DESCRIPTION = "The Plain TeX program (typed in the shape of the towers of \
Hanoi) serves both as a game and as a TeX programming exercise. \
As a game it will solve the towers with (up to) 15 discs (with \
15 discs, 32767 moves are needed)."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.20120101svn25019"

RPM_NAME = "texlive-hanoi-2026.226.20120101svn25019-60.4.noarch.rpm"
RPM_HASH = "65d1f07a5e44a6ed29a485d459a4c9d1df5b887113d3643e44f5bbd4ccc814e0d995036d1a5aca59fd16f2a998628572aefb2e594e66d7222daf722294a9e9a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hanoi.tex \
texlive-hanoi"

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
