SUMMARY = "Commands for Serbian words with apostrophes"
DESCRIPTION = "The package provides a collection of commands (whose names are \
Serbian words) whose expansion is the Serbian word with \
appropriate apostrophes."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn23799"

RPM_NAME = "texlive-serbian-apostrophe-2026.226.svn23799-60.2.noarch.rpm"
RPM_HASH = "6e46c9fdabdaaf8dcc556f00f486c64750b820d1d3a0e743fa877676252d898b13373ee5c662d5b33a39585cbd643baa835915f395e4f000810a290d5160c3b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-serbian-apostrophe.sty \
texlive-serbian-apostrophe"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tipa.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
