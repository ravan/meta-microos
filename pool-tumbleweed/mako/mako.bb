SUMMARY = "A Wayland notification daemon"
DESCRIPTION = "A notification daemon for Wayland. Intended to be used with sway."
LICENSE = "MIT"

PV = "1.11.0"

RPM_NAME = "mako-1.11.0-1.3.aarch64.rpm"
RPM_HASH = "20e1e02e26d678fefc0b86056a890eb6bc6e86386723c10cc577e5921eb5ebbb2261a04108c16d5828243f39dc85cfb7044506243b6e39c53361795b31437aa2"

RPROVIDES:${PN} += "mako"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libsystemd.so.0 \
libwayland-client.so.0 \
libwayland-cursor.so.0"

inherit rpm
