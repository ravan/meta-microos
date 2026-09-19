SUMMARY = "Development files for libuna, a library to support Unicode/ASCII conversions"
DESCRIPTION = "libuna is a library to support Unicode and ASCII (byte string) \
conversions. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libuna."
LICENSE = "LGPL-3.0-or-later"

PV = "20260602"

RPM_NAME = "libuna-mini-devel-20260602-1.5.aarch64.rpm"
RPM_HASH = "e20aa006918d8527953035495d869181a7b5164f58e843f0f5f3d023b8d6e227b5489189e155cffc69025032e0eb8b9e83c992dd7abfddc7b1bd4f5d26a713f8"

RPROVIDES:${PN} += "libuna-mini-devel \
pkgconfig-libuna"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libuna1-mini"

inherit rpm
