SUMMARY = "Wayland core client library"
DESCRIPTION = "Wayland is a protocol for a compositor to talk to its clients as well \
as a C library implementation of that protocol. The compositor can be \
a standalone display server running on Linux kernel modesetting and \
evdev input devices, an X application, or a wayland client itself. \
The clients can be traditional applications, X servers (rootless or \
fullscreen) or other display servers."
LICENSE = "MIT"

PV = "1.26.0"

RPM_NAME = "libwayland-client0-1.26.0-1.2.aarch64.rpm"
RPM_HASH = "3f9b7cdc6f8d70c6e4da5cce88f2fac45d0ad8002f19c9569931e8a0d6ea5f6c365cece85300094119302ad785f22526a006e31a2152fa5a8a224534173673ea"

RPROVIDES:${PN} += "libwayland-client.so.0 \
libwayland-client0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libffi.so.8"

inherit rpm
