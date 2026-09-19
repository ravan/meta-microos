SUMMARY = "A manual about bibliographies and especially BibTeX"
DESCRIPTION = "An (as-complete-as-possible) manual about bibliographies in \
LaTeX, and thus mainly about BibTeX."
LICENSE = "LPPL-1.0"

PV = "2026.227.1.4svn15878"

RPM_NAME = "texlive-tamethebeast-2026.227.1.4svn15878-62.2.noarch.rpm"
RPM_HASH = "471c2fe7a4cacda966f28a021fdafddee1a91251fb4dcd0c5ce5c964963b6d92da451b7f0c94a389184b3dc5f6309f9bc775b6e3561526602707fb7f75002891"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tamethebeast"

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
