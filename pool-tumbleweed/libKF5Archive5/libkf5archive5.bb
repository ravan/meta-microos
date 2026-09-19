SUMMARY = "Qt 5 addon providing access to numerous types of archives"
DESCRIPTION = "KArchive provides classes for easy reading, creation and manipulation of \
'archive' formats like ZIP and TAR. \
 \
If also provides transparent compression and decompression of data, like the \
GZip format, via a subclass of QIODevice."
LICENSE = "LGPL-2.0-or-later"

PV = "5.116.0"

RPM_NAME = "libKF5Archive5-5.116.0-1.9.aarch64.rpm"
RPM_HASH = "c7cd82969b68efc2aa16432f8ece80b6e45f22fc0b6982095e4ec1cd4194b905cb42e01082f47ff105cae785f8e158a232994c7b518e6e19b6724085eb637614"

RPROVIDES:${PN} += "libKF5Archive.so.5 \
libKF5Archive5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Core5 \
libbz2.so.1 \
libc.so.6 \
liblzma.so.5 \
libstdc++.so.6 \
libz.so.1 \
libzstd.so.1"

inherit rpm
