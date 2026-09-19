SUMMARY = "Wayland core server library"
DESCRIPTION = "Wayland is a protocol for a compositor to talk to its clients as well \
as a C library implementation of that protocol. The compositor can be \
a standalone display server running on Linux kernel modesetting and \
evdev input devices, an X application, or a wayland client itself. \
The clients can be traditional applications, X servers (rootless or \
fullscreen) or other display servers."
LICENSE = "MIT"

PV = "1.26.0"

RPM_NAME = "libwayland-server0-1.26.0-1.2.aarch64.rpm"
RPM_HASH = "c6b61ecefecf9236ea7ee41847b08be7de180c1ef35dcc0ddc808df66f48d1e6060444d849e6bfa4812f93f5aad17e51beb9c27a6252a1213df676bb741d3914"

RPROVIDES:${PN} += "libwayland-server.so.0 \
libwayland-server0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libffi.so.8"

inherit rpm
