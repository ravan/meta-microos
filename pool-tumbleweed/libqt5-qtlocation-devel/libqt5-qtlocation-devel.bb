SUMMARY = "Development files for the Qt5 Location Library"
DESCRIPTION = "The Qt Location API facilitates creating mapping solutions using \
the data available from some contemporary location services. \
 \
This subpackage contains the header files for developing \
applications that want to make use of the Qt Location libraries."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.19+kde7"

RPM_NAME = "libqt5-qtlocation-devel-5.15.19+kde7-1.2.aarch64.rpm"
RPM_HASH = "3a4340a829cc87f906b81ca4efd335717a48e94d204d94fef1e4bb0f394fb24162e525d22836e429836f41925513d0d7104d18304a96fa241960c8545c64ff05"

RPROVIDES:${PN} += "cmake-Qt5Location \
cmake-Qt5Positioning \
cmake-Qt5PositioningQuick \
libqt5-qtlocation-devel \
pkgconfig-Qt5Location \
pkgconfig-Qt5Positioning \
pkgconfig-Qt5PositioningQuick"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt5Location5 \
libQt5Positioning5 \
libQt5PositioningQuick5 \
pkgconfig-Qt5Core \
pkgconfig-Qt5Gui \
pkgconfig-Qt5Network \
pkgconfig-Qt5Positioning \
pkgconfig-Qt5PositioningQuick \
pkgconfig-Qt5Qml \
pkgconfig-Qt5Quick"

inherit rpm
