SUMMARY = "Library for accesssing image scanners"
DESCRIPTION = "Libinsane is a library to access scanners on multiple platforms. \
It takes care of quirks of platforms and scanners."
LICENSE = "LGPL-3.0-or-later"

PV = "1.0.10"

RPM_NAME = "libinsane1-1.0.10-1.14.aarch64.rpm"
RPM_HASH = "7e21a71a823fa293bcd4ad61ac43a72e3e803482a4f21a695aff4392ec8ef6943824046f0d3b1ad7f9a034372df7f90307eeb084a7e558680da1e0aa0766906b"

RPROVIDES:${PN} += "libinsane.so.1 \
libinsane1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsane.so.1"

inherit rpm
