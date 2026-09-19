SUMMARY = "A BibTeX style to format reference lists in the Harvard at Newcastle style"
DESCRIPTION = "This package provides a BibTeX style to format reference lists \
in the Harvard at Newcastle style recommended by Newcastle \
University. It should be used alongside natbib for citations."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn76790"

RPM_NAME = "texlive-newcastle-bst-2026.226.1.1svn76790-61.2.noarch.rpm"
RPM_HASH = "34b715c518bee8235133ee090a782d3831693d30c8e61c6c70139cc065362f819a3bb6926f4b4f27bf7e84ea85f04cf9ae4aa4428b3d7ca1a995ceb7aa13fcde"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-newcastle-bst"

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
