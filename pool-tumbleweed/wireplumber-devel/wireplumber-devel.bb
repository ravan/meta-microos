SUMMARY = "Session / policy manager implementation for PipeWire"
DESCRIPTION = "WirePlumber is a modular session / policy manager for PipeWire and \
a GObject-based high-level library that wraps PipeWire's API, \
providing convenience for writing the daemon's modules as well as \
external tools for managing PipeWire. \
 \
This package provides all the necessary files for development with WirePlumber"
LICENSE = "MIT"

PV = "0.5.17"

RPM_NAME = "wireplumber-devel-0.5.17-1.1.aarch64.rpm"
RPM_HASH = "8f6753cf01d2f1f9adabd7517de79258683f0aca6194906d4f82b4e645ea15abb2aecbbf995790d23df43c1ba21f48f54ce8a3fc77df7737c619726b5033a840"

RPROVIDES:${PN} += "pkgconfig-wireplumber-0.5 \
wireplumber-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libwireplumber-0-5-0 \
pkgconfig-gio-2.0 \
pkgconfig-gmodule-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-libpipewire-0.3 \
wireplumber"

inherit rpm
