SUMMARY = "Macros for SuperSymmetry-related work"
DESCRIPTION = "The package provides abbreviations of longer expressions."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn19440"

RPM_NAME = "texlive-susy-2026.226.svn19440-64.2.noarch.rpm"
RPM_HASH = "e98e43fda172100d264704ca16ebe4ed2ec0e356653d84e3405081ea87c504541ee5aed21901e781613243a62a0491d7ee94ab870b926bffc9048da48c9fc375"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-susy.sty \
texlive-susy"

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
