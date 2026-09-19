SUMMARY = "GTK4 integration for libportal"
DESCRIPTION = "A GIO-style async API for most Flatpak portals. \
This package contains the shared library of libportal."
LICENSE = "LGPL-3.0-or-later"

PV = "0.10.0"

RPM_NAME = "libportal-gtk4-1-0.10.0-1.2.aarch64.rpm"
RPM_HASH = "d0ad0784037a2f4ce8d820c5af0480196b5d078dfc86da132072e21f7b52092969eb077a31d63d0a40aa9c5a147f2974e044bc4d3b7e1b52958cc353676a32bb"

RPROVIDES:${PN} += "libportal-gtk4-1 \
libportal-gtk4.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1"

inherit rpm
