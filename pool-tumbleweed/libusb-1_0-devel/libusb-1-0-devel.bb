SUMMARY = "USB Library"
DESCRIPTION = "Libusb is a library that allows userspace access to USB devices."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.30"

RPM_NAME = "libusb-1_0-devel-1.0.30-1.3.aarch64.rpm"
RPM_HASH = "727a4bcf88598b47e804becf971bab7a558ad7bf80bac2b3d0b355f799b116d3d0eacd64b69d897f58e61c4dceefad80cd2fb0c33d7e37666762565e2f5d9169"

RPROVIDES:${PN} += "libusb-1-0-devel \
pkgconfig-libusb-1.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libusb-1-0-0"

inherit rpm
