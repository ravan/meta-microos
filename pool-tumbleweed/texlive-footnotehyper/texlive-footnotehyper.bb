SUMMARY = "A hyperref aware footnote environment"
DESCRIPTION = "This package provides a footnote environment allowing verbatim \
material and a savenotes environment which captures footnotes \
across problematic environments. It is a successor to the \
footnote package by Mark Wooding which had various \
compatibility issues with modern packages (hyperref, color, \
xcolor, babel-french)."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1fsvn77682"

RPM_NAME = "texlive-footnotehyper-2026.226.1.1fsvn77682-60.2.noarch.rpm"
RPM_HASH = "352124070cfe760319068e57154019bd0957e4b8478afa51daa9cc790ee8dc43a71583f0d05d0e578a38ba15eec09a4d19daaf6e092e2c1bffae10aa0224cf1b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-footnotehyper.sty \
texlive-footnotehyper"

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
