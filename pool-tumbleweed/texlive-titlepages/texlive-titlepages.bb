SUMMARY = "Sample titlepages, and how to code them"
DESCRIPTION = "The document provides examples of over two dozen title page \
designs based on a range of published books and theses, \
together with the LaTeX code used to create them."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn19457"

RPM_NAME = "texlive-titlepages-2026.226.svn19457-59.2.noarch.rpm"
RPM_HASH = "c8f50305c735dc3ace07cd397a31442fa3ff2df4750b89239a841323f3d10be789e57d8280c2e93cd1cc30c029401a838702d6bc885841561de2222b7c26b1fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-titlepages"

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
