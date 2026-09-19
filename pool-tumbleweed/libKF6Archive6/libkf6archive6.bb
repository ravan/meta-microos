SUMMARY = "Qt 6 addon providing access to numerous types of archives"
DESCRIPTION = "KArchive provides classes for easy reading, creation and manipulation of \
'archive' formats like ZIP and TAR. \
 \
If also provides transparent compression and decompression of data, like the \
GZip format, via a subclass of QIODevice."
LICENSE = "LGPL-2.0-or-later"

PV = "6.30.0"

RPM_NAME = "libKF6Archive6-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "14f61ac35c8fc8e4acd1f92292d336e1cdc415705f823d84148ab821ba962ebe1391f10576c5b682c6247fd94a88392067461e1876106e206f206c30fc89d11c"

RPROVIDES:${PN} += "libKF6Archive.so.6 \
libKF6Archive6"

RDEPENDS:${PN} += "/sbin/ldconfig \
kf6-karchive \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libbz2.so.1 \
libc.so.6 \
libcrypto.so.3 \
liblzma.so.5 \
libstdc++.so.6 \
libz.so.1 \
libzstd.so.1"

inherit rpm
