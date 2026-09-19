SUMMARY = "Qt 6 MultimediaQuick library - Development files"
DESCRIPTION = "Development files for the Qt 6 Multimedia private library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-multimediaquick-private-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "f328c115a9a7f513ebed49a3022116b4a7efe80d47c3b1da2fad94deb39675bb8b591dbedfe07ed55696a5603ccf2a073dc02e601a04c48796875e154db377e4"

RPROVIDES:${PN} += "cmake-Qt6MultimediaQuickPrivate \
qt6-multimediaquick-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Multimedia \
cmake-Qt6MultimediaPrivate \
cmake-Qt6Quick \
cmake-Qt6QuickPrivate \
libQt6MultimediaQuick6"

inherit rpm
