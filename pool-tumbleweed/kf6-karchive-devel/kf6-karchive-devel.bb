SUMMARY = "Development files for kf6-karchive"
DESCRIPTION = "KArchive provides classes for easy reading, creation and manipulation of \
'archive' formats like ZIP and TAR. \
 \
If also provides transparent compression and decompression of data, like the \
GZip format, via a subclass of QIODevice. Development files"
LICENSE = "LGPL-2.0-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-karchive-devel-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "f1694f308f506dcdd940256c96a1203a34338be336f774ba5deeeec8cdbf1a46f10de7f0dce29349ae80ee3f352daccb839a2e5cb0081af4e45d32dd7c523022"

RPROVIDES:${PN} += "cmake-KF6Archive \
kf6-karchive-devel \
pkgconfig-KF6Archive"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libKF6Archive6 \
pkgconfig-Qt6Core"

inherit rpm
