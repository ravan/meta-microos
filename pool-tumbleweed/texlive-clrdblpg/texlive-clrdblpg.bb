SUMMARY = "Control pagestyle of pages left blank by \\cleardoublepage"
DESCRIPTION = "This tiny package allows easy manipulation of the headers and \
footers on pages left blank by \\cleardoublepage. By default, \
LaTeX has no easy facilities for this. This package uses more \
or less the algorithm listed in the fancyhdr package \
documentation, with some better indentation and added \
flexibility."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn47511"

RPM_NAME = "texlive-clrdblpg-2026.226.1.0svn47511-60.2.noarch.rpm"
RPM_HASH = "0f562da17fef3f5f637b0218398dfe160bb262bef8d592d2a5c4d0cd7a4b7e0378b80ef6ed5e702952186a7fbe9cbf667f71574e9e708b1865dcd6c3a1710a6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-clrdblpg.sty \
texlive-clrdblpg"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
