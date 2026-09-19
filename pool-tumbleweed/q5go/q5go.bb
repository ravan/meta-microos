SUMMARY = "A Go board including an editor and analysis frontend"
DESCRIPTION = "q5Go is a tool for Go players which performs the following functions: \
 \
 * SGF editor \
 * Analysis frontend for Leela Zero (or compatible engines) \
 * GTP interface \
 * IGS client \
 * Export to a variety of formats"
LICENSE = "GPL-2.0-or-later"

PV = "2.1.3"

RPM_NAME = "q5go-2.1.3-1.17.aarch64.rpm"
RPM_HASH = "e08127522db4ba1cc07ffdc198d891aa6350091a3c0dd3ca7b2be84c794296647bc9de05535b74331a717bde3034b0817ffbd52138cdbf79ff7f711b59d933df"

RPROVIDES:${PN} += "q5go"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Multimedia.so.5 \
libQt5Network.so.5 \
libQt5Sql.so.5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
