SUMMARY = "Introspection bindings for libwireplumber"
DESCRIPTION = "WirePlumber is a modular session / policy manager for PipeWire and \
a GObject-based high-level library that wraps PipeWire's API, \
providing convenience for writing the daemon's modules as well as \
external tools for managing PipeWire. \
 \
This package provides the GObject Introspection bindings for \
the wireplumber shared library."
LICENSE = "MIT"

PV = "0.5.17"

RPM_NAME = "typelib-1_0-Wp-0_5-0.5.17-1.1.aarch64.rpm"
RPM_HASH = "6ff4b6f0af1f4d473bfd06d31837257a27c4aaa98b85d70d3ee889bd79221c164709c551e8ff6835e11d93f4000e796d6f8e01a057dc8ca24cc007927b569128"

RPROVIDES:${PN} += "typelib-1-0-Wp-0-5 \
typelib-Wp"

RDEPENDS:${PN} += "libwireplumber-0.5.so.0 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio"

inherit rpm
