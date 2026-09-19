SUMMARY = "GObject access to image scanners"
DESCRIPTION = "Libinsane is a library to access scanners on multiple platforms. \
It takes care of quirks of platforms and scanners. \
 \
This package provides GObject wrappers around the main library."
LICENSE = "LGPL-3.0-or-later"

PV = "1.0.10"

RPM_NAME = "libinsane_gobject1-1.0.10-1.14.aarch64.rpm"
RPM_HASH = "005559ac8d58121d2b939d6031cd5c3f743b211be8ff6a960005dc41fe43140ab52f4fbb8510ae7cc574b4c752ee1261b611a66d12abead37bd6d7863c394cc9"

RPROVIDES:${PN} += "libinsane-gobject.so.1 \
libinsane-gobject1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libinsane.so.1 \
libinsane1"

inherit rpm
