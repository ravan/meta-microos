SUMMARY = "Devel files for liblxqt"
DESCRIPTION = "liblxqt represents the core library of LXQt providing essential \
functionality needed by nearly all of its components. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of liblxqt."
LICENSE = "LGPL-2.1-or-later"

PV = "2.4.0"

RPM_NAME = "liblxqt-devel-2.4.0-2.2.aarch64.rpm"
RPM_HASH = "3f905a39fa789c81e1d322e79931bcd7795e3e0025d5c197002e2656d01950deabfcc75e74bc2c50ac419eec4ae4765fad937ea9ce50ada79858cc47246dca90"

RPROVIDES:${PN} += "cmake-lxqt \
liblxqt-devel \
pkgconfig-lxqt"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liblxqt2 \
pkgconfig \
pkgconfig-Qt6DBus \
pkgconfig-Qt6Widgets \
pkgconfig-Qt6Xdg \
pkgconfig-Qt6Xml"

inherit rpm
