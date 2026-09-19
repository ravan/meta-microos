SUMMARY = "Worksheet GUI for mathematical software"
DESCRIPTION = "A frontend to several existing mathematical software such as R, Sage \
and Maxima: Cantor. Cantor offers a worksheet as a nice GUI for all \
those backends and is not targeted to kids but to scientists."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "cantor-devel-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "4c001a3b0183214a4f4e357333e235fcdb5d3a8f67649ad0dbd989db2f0d79ca34115923ee37bf7729e1b7a720193476b863112f34442ab4998a4f45079b162c"

RPROVIDES:${PN} += "cantor-devel \
cmake-Cantor"

RDEPENDS:${PN} += "cmake-KF6Archive \
cmake-KF6Completion \
cmake-KF6Config \
cmake-KF6I18n \
cmake-KF6IconThemes \
cmake-KF6KIO \
cmake-KF6XmlGui \
cmake-Qt6Svg \
cmake-Qt6Xml \
libcantorlibs28 \
libspectre-devel \
pkgconfig-poppler-qt6"

inherit rpm
