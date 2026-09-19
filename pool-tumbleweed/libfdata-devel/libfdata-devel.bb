SUMMARY = "Development files for libfdata"
DESCRIPTION = "Library to provide generic file data functions for the libyal family of libraries. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libfdata."
LICENSE = "LGPL-3.0-or-later"

PV = "20260521"

RPM_NAME = "libfdata-devel-20260521-1.8.aarch64.rpm"
RPM_HASH = "22eb402c463a7605e4794ebca3b9581a35f9dd4df853c45a7013398593c3de3df4b59a065dbe996a693b373e55e4335876f8834c79784c18e6859721ce096050"

RPROVIDES:${PN} += "libfdata-devel \
pkgconfig-libfdata"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfdata1"

inherit rpm
