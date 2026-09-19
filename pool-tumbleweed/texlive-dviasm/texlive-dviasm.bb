SUMMARY = "A utility for editing DVI files"
DESCRIPTION = "A Python script to support changing or creating DVI files via \
disassembling into text, editing, and then reassembling into \
binary format. It supports advanced features such as adding a \
preprint number or watermarks."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn71902"

RPM_NAME = "texlive-dviasm-2026.226.svn71902-61.4.noarch.rpm"
RPM_HASH = "ee88658d59c364434051462909eaa74b1ef926b4f3ac9638538e863329dbf8c0c7dd8b4b0d4275f26bf8ed4368eeaa8d2910d1a209ea7f714a2e4990d36b9ae7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dviasm"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-dviasm-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
