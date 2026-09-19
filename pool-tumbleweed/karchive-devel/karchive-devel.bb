SUMMARY = "Qt 5 addon providing access to numerous types of archives: Build Environment"
DESCRIPTION = "KArchive provides classes for easy reading, creation and manipulation of \
'archive' formats like ZIP and TAR. \
 \
If also provides transparent compression and decompression of data, like the \
GZip format, via a subclass of QIODevice. Development files"
LICENSE = "LGPL-2.0-or-later"

PV = "5.116.0"

RPM_NAME = "karchive-devel-5.116.0-1.9.aarch64.rpm"
RPM_HASH = "1ea9079181020a274ed9f68c79cb65cd31dd0ae07152fce907458514f54b6489d8368df813822b7ab85f65a86f2b4346bd223b5ffb7d04b4878c461e2ac14dce"

RPROVIDES:${PN} += "cmake-KF5Archive \
karchive-devel"

RDEPENDS:${PN} += "cmake-Qt5Core \
libKF5Archive5"

inherit rpm
