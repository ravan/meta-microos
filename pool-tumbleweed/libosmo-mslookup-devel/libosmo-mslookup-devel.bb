SUMMARY = "Development files for the Osmocom MS lookup library"
DESCRIPTION = "This shared library contains routines for looking up mobile subscribers. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libosmo-mslookup."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.0"

RPM_NAME = "libosmo-mslookup-devel-1.4.0-2.14.aarch64.rpm"
RPM_HASH = "607917db38ef0f76f438bd5ca41c376b796d0c0f4cca22e8f73dc9395cc9a93b8cef3e2c2daa5264caece9943b0757f395d65ea569bb3ccb50fa038c3a5f5177"

RPROVIDES:${PN} += "libosmo-mslookup-devel \
pkgconfig-libosmo-mslookup"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libosmo-mslookup0"

inherit rpm
