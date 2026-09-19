SUMMARY = "A GIO-style async API for most Flatpak portals"
DESCRIPTION = "A GIO-style async API for most Flatpak portals. \
This package contains the shared library of libportal."
LICENSE = "LGPL-3.0-or-later"

PV = "0.10.0"

RPM_NAME = "libportal1-0.10.0-1.2.aarch64.rpm"
RPM_HASH = "47801380d7c0c14d726fab07e82994fcf8549838b2f7ee7a7b0b51765ff01e1e6e5f488fed0bf1e2d8e8b8a2cecf3fb3810f3294be44f3b9d63cfd82d0887116"

RPROVIDES:${PN} += "libportal-1 \
libportal.so.1 \
libportal1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
