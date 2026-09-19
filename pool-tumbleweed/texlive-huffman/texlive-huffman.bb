SUMMARY = "Drawing binary Huffman trees with MetaPost and METAOBJ"
DESCRIPTION = "This MetaPost package allows to draw binary Huffman trees from \
two arrays : an array of strings, and an array of weights \
(numeric). It is based on the METAOBJ package which provides \
many tools for building trees in general."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn67071"

RPM_NAME = "texlive-huffman-2026.226.0.0.1svn67071-60.2.noarch.rpm"
RPM_HASH = "2b7396eec5abe35f8997e2e215ce095ebaef19f70efd4e900756251ef9d89a1c1ab1b71231c6996482cad838a41c87ad922fa49a21655a7bcc6f8906c579b6d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-huffman"

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
