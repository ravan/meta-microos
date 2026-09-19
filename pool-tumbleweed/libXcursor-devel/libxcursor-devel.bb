SUMMARY = "Development files for the X Window System Cursor library"
DESCRIPTION = "Xcursor a library designed to help locate and load cursors. Cursors \
can be loaded from files or memory. A library of common cursors \
exists which map to the standard X cursor names.Cursors can exist in \
several sizes and the library automatically picks the best size. \
 \
This package contains the development headers for the library found \
in libXcursor1."
LICENSE = "MIT"

PV = "1.2.3"

RPM_NAME = "libXcursor-devel-1.2.3-1.8.aarch64.rpm"
RPM_HASH = "ce381aaa1120081d4eced063874067e0511cd838c518ddcff5bec9829636789cc7d2402d95da12756f26125470420c0edc151de34e2d398f717c9601e904051b"

RPROVIDES:${PN} += "libXcursor-devel \
pkgconfig-xcursor"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libXcursor1 \
pkgconfig-x11 \
pkgconfig-xfixes \
pkgconfig-xproto \
pkgconfig-xrender"

inherit rpm
