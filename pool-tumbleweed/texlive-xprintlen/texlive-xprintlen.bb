SUMMARY = "Print TeX lengths in a variety of units"
DESCRIPTION = "The package defines a command, \\printlen, to print TeX lengths \
in a variety of units. It can handle all units supported by \
TeX. The package requires that a reasonably up to date version \
of the fp package be installed on you system."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn35928"

RPM_NAME = "texlive-xprintlen-2026.226.1.0svn35928-59.4.noarch.rpm"
RPM_HASH = "57233c0d05dcc51b9aaee586b57caceb0cd7c6383db08c9670dd5112df25a8e1496cb35a9a1ebc4bd422e5b9278003d94b493b42a5dafdc1bed971b6ba645c13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xprintlen.sty \
texlive-xprintlen"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fp.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
