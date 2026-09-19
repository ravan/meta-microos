SUMMARY = "Introspections files for libportal"
DESCRIPTION = "A GIO-style async API for most Flatpak portals. \
This package contains the introspection files of libportal."
LICENSE = "LGPL-3.0-or-later"

PV = "0.10.0"

RPM_NAME = "typelib-1_0-Xdp-1_0-0.10.0-1.2.aarch64.rpm"
RPM_HASH = "ab1fb754dbacabfd428a643aca42d7fb74166c2a3dc6d66f73c6caec6773881d0a6fb103f0114ae815a1b4ffeef18d93f8207d4b8f9857137c39414e0124685f"

RPROVIDES:${PN} += "typelib-1-0-Xdp-1-0 \
typelib-Xdp"

RDEPENDS:${PN} += "libportal.so.1 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio"

inherit rpm
