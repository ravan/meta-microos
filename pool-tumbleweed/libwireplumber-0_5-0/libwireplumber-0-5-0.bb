SUMMARY = "Session / policy manager implementation for PipeWire"
DESCRIPTION = "WirePlumber is a modular session / policy manager for PipeWire and \
a GObject-based high-level library that wraps PipeWire's API, \
providing convenience for writing the daemon's modules as well as \
external tools for managing PipeWire. \
 \
This package provides the wireplumber shared library."
LICENSE = "MIT"

PV = "0.5.17"

RPM_NAME = "libwireplumber-0_5-0-0.5.17-1.1.aarch64.rpm"
RPM_HASH = "ed59ae269e88227996466c790993d954656c285719f11320f79957554827558c78113df9a4f516d3f72e5140f1df0c20f8ec64b756b892f42a700432c4b6be8b"

RPROVIDES:${PN} += "libwireplumber-0-5-0 \
libwireplumber-0.5.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libpipewire-0.3.so.0"

inherit rpm
