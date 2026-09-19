SUMMARY = "Define old font commands"
DESCRIPTION = "In 1994, with LaTeX2e, the old font commands \\rm, \\sf, \\tt, \
\\bf, \\it, \\sl, and \\sc became obsolete. This package defines \
them, and also the deprecated KOMA-Script command \\sfb."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn76435"

RPM_NAME = "texlive-defoldfonts-2026.226.1.1svn76435-59.2.noarch.rpm"
RPM_HASH = "49d162d04226e7cce22dac8dff4920121ea0d8230827f059a3d552c7b96aaa41af1dd4216d96ce640a0edd49c9ac272821abbc6ee8564de4a42d9ce553140683"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-defoldfonts.sty \
texlive-defoldfonts"

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
