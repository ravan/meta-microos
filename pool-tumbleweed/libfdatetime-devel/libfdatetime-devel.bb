SUMMARY = "Development files for libfdatetime, a date and time data type library"
DESCRIPTION = "A library for date and time data types. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libfdatetime."
LICENSE = "LGPL-3.0-or-later"

PV = "20260521"

RPM_NAME = "libfdatetime-devel-20260521-1.6.aarch64.rpm"
RPM_HASH = "8996e1b4b7c4b6cf2eef47cac999ccb3c94b5d8d37c47ca44a361d61f7048936200a193aa12e36f627c759885ba8c9a2aac3bde28b1b5329d9e4800f5a43427a"

RPROVIDES:${PN} += "libfdatetime-devel \
pkgconfig-libfdatetime"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfdatetime1"

inherit rpm
