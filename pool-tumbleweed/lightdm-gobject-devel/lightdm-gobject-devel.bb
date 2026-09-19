SUMMARY = "Development Files for liblightdm-gobject-1-0"
DESCRIPTION = "This package contains development files needed for developing \
GObject-based LightDM clients."
LICENSE = "LGPL-2.0-only | LGPL-3.0-only"

PV = "1.32.0"

RPM_NAME = "lightdm-gobject-devel-1.32.0-9.4.aarch64.rpm"
RPM_HASH = "faa7711030d2794eb4d898e1f2533986a146ca078d3f816a1a17a1967dc2ff75e0127930ab47cd4e3aaed10bb3983e3425762162bff36ffc4ef04ce2ba6343c4"

RPROVIDES:${PN} += "lightdm-gobject-devel \
pkgconfig-liblightdm-gobject-1"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liblightdm-gobject-1-0 \
pkgconfig-gio-2.0 \
pkgconfig-gio-unix-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-libxklavier \
pkgconfig-x11"

inherit rpm
