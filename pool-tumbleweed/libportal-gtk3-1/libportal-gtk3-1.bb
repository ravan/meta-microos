SUMMARY = "GTK3 integration for libportal"
DESCRIPTION = "A GIO-style async API for most Flatpak portals. \
This package contains the shared library of libportal."
LICENSE = "LGPL-3.0-or-later"

PV = "0.10.0"

RPM_NAME = "libportal-gtk3-1-0.10.0-1.2.aarch64.rpm"
RPM_HASH = "07e73d4fcb5d28758b85da784bf945a336bf29211866c0c1870a6999a45b65f6fe8b62a6631558ad1fb2ce6291aa41293290d990a2889afd3bd0b89b39e12483"

RPROVIDES:${PN} += "libportal-gtk3-1 \
libportal-gtk3.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0"

inherit rpm
