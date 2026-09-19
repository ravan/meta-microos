SUMMARY = "A Finnish version of plain.bst"
DESCRIPTION = "The finbib package"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn76790"

RPM_NAME = "texlive-finbib-2026.226.svn76790-59.2.noarch.rpm"
RPM_HASH = "0104742c5feb4f419bf67328ccc0c6bb495a01a15ca8ae2e78d2ae55aa645e430a574c74604b6ea7f73130a31101cd9c63f12bbddb47f5d3eb495941b49f757f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-finbib"

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
