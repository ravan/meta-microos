SUMMARY = "Draw arcs over and under text"
DESCRIPTION = "The package provides two commands for placing an arc over \
(\\overarc) or under (\\underarc) a piece of text. (The text may \
be up to three letters long.) The commands generate an \\hbox, \
and may be used both in text and in maths formulae."
LICENSE = "LPPL-1.0"

PV = "2026.226.1svn15878"

RPM_NAME = "texlive-arcs-2026.226.1svn15878-61.2.noarch.rpm"
RPM_HASH = "597f360537e2624f7cd1750b44a3fc088dfec37dac8292a7d6e48c4adebe863a32a6f239bf55c88f35652b382e5e963038fc1a05b5ba91a448b5790eec46660d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-arcs.sty \
texlive-arcs"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-relsize.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
