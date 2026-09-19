SUMMARY = "Development files for the SocketCAN library"
DESCRIPTION = "This library allows you to control some basic functions in socketcan \
from userspace. A recent kernel with integrated SocketCAN (at least \
2.6.30) is needed. \
 \
This package contains the libsocketcan development files."
LICENSE = "LGPL-2.1-or-later"

PV = "0.0.12"

RPM_NAME = "libsocketcan-devel-0.0.12-1.17.aarch64.rpm"
RPM_HASH = "d60570acfae5386c9f8ad484482ffebcd3afaf8fc8e72416481e9f1567017d8ad30cea395a04b2d23944ec247ee11d4569d895acf2388b8e9093213961ff4a37"

RPROVIDES:${PN} += "libsocketcan-devel \
pkgconfig-libsocketcan"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsocketcan2"

inherit rpm
