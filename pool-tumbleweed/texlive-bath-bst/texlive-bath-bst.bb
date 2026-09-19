SUMMARY = "Harvard referencing style as recommended by the University of Bath Library"
DESCRIPTION = "This package provides a BibTeX style to format reference lists \
in the Harvard style recommended by the University of Bath \
Library. It should be used in conjunction with natbib for \
citations."
LICENSE = "LPPL-1.0"

PV = "2026.226.7.2svn77532"

RPM_NAME = "texlive-bath-bst-2026.226.7.2svn77532-60.2.noarch.rpm"
RPM_HASH = "52ade0a243991cf99babc64b39535da5a4ab5c1b97b40bdd6d07915efa258bd5c69d82586f21a585641af403a497734df601f03640a46884e97aa8ec0953b830"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bath-bst"

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
