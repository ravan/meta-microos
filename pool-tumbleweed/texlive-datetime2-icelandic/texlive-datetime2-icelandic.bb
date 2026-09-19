SUMMARY = "Icelandic language module for the datetime2 package"
DESCRIPTION = "This module provides the 'icelandic' style that can be set \
using \\DTMsetstyle provided by datetime2.sty. This package is \
currently unmaintained. Please see the README for the procedure \
to follow if you want to take over the maintenance."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn65213"

RPM_NAME = "texlive-datetime2-icelandic-2026.226.1.2svn65213-59.2.noarch.rpm"
RPM_HASH = "7e4b0402d59054c77f3187767726b17a0ef1bebdf892fdc243c12b85124f2a9424de3fb0b008ec367bd6506b39670539f7c25e0a02d721d711ee0081faaddc0a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-datetime2-icelandic-ascii.ldf \
tex-datetime2-icelandic-utf8.ldf \
tex-datetime2-icelandic.ldf \
texlive-datetime2-icelandic"

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
