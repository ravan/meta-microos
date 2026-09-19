SUMMARY = "Development files for libfole"
DESCRIPTION = "libfole is a library for Object Linking and Embedding (OLE) data types. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libfole."
LICENSE = "LGPL-3.0-or-later"

PV = "20260521"

RPM_NAME = "libfole-devel-20260521-1.6.aarch64.rpm"
RPM_HASH = "2350e5400672e8dff275b7a0b2fc7f29bf82135899a1cb0da9c6e36514a4d886f258cf06e8aa94ca5ef553ce51200ba5956aabfe13d84e3cebd211c658e5130b"

RPROVIDES:${PN} += "libfole-devel \
pkgconfig-libfole"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfole1"

inherit rpm
