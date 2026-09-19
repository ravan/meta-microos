SUMMARY = "Source and header files for libhandy"
DESCRIPTION = "This package provides the source and header files for writing \
software using libhandy, a library to help with developing mobile UI \
using GTK+/GNOME."
LICENSE = "LGPL-2.1-or-later"

PV = "1.8.3"

RPM_NAME = "libhandy-devel-1.8.3-2.3.aarch64.rpm"
RPM_HASH = "195bc6568ca4ce610aed00578c03385ffd1166514738e567612433707b6b574c710b73463594d0781566fdcf8f5b89ffb302fbf3d45a57c28b0901ceb761201f"

RPROVIDES:${PN} += "libhandy-devel \
pkgconfig-libhandy-1"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libhandy-1-0 \
pkgconfig-gtk+-3.0 \
typelib-1-0-Handy-1-0"

inherit rpm
