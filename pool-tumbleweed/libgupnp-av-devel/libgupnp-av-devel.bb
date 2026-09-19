SUMMARY = "Library to ease the handling and implementation of UPnP A/V profiles - Development Files"
DESCRIPTION = "GUPnP A/V is a small utility library that aims to ease the handling and \
implementation of UPnP A/V profiles."
LICENSE = "LGPL-2.0-or-later"

PV = "0.14.5"

RPM_NAME = "libgupnp-av-devel-0.14.5-1.3.aarch64.rpm"
RPM_HASH = "3df0f9a1b4d35d587ab6436a0e735b3160dcd81b5ad66f2f2d70eea52b34579e2be38d8d15b6644c048362542159f26e76d45a66ba6606102f4a722caa61ae47"

RPROVIDES:${PN} += "libgupnp-av-devel \
pkgconfig-gupnp-av-1.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgupnp-av-1-0-3 \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-libxml-2.0 \
typelib-1-0-GUPnPAV-1-0"

inherit rpm
