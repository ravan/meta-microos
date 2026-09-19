SUMMARY = "Qt 6 addon providing access to numerous types of archives"
DESCRIPTION = "KArchive provides classes for easy reading, creation and manipulation of \
'archive' formats like ZIP and TAR. \
 \
If also provides transparent compression and decompression of data, like the \
GZip format, via a subclass of QIODevice."
LICENSE = "LGPL-2.0-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-karchive-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "8e5598b133e8aa40c1ef17009a7a4a6743f8e1740ae9c8963416e01b41fe42a71f979c780d5a39056559a172b2f913328b9cf004ec303cc9cca381c6a7961d1d"

RPROVIDES:${PN} += "kf6-karchive"

RDEPENDS:${PN} += ""

inherit rpm
