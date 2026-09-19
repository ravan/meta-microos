SUMMARY = "Development files for the Wayland Compositor Infrastructure"
DESCRIPTION = "Wayland is a protocol for a compositor to talk to its clients as well \
as a C library implementation of that protocol. The compositor can be \
a standalone display server running on Linux kernel modesetting and \
evdev input devices, an X application, or a wayland client itself. \
The clients can be traditional applications, X servers (rootless or \
fullscreen) or other display servers. \
 \
This package contains all necessary include files and libraries needed \
to develop applications that require these."
LICENSE = "MIT"

PV = "1.26.0"

RPM_NAME = "wayland-devel-1.26.0-1.2.aarch64.rpm"
RPM_HASH = "62c73cc08fabf6ab538e226588f99e35dc4cd6dc88309abd34ea4990f4866cfdf7f13c8af6799310df083d67130894dfd78abe1bf40f66f03f485c33f2bd1268"

RPROVIDES:${PN} += "libwayland-egl-devel \
pkgconfig-wayland-client \
pkgconfig-wayland-cursor \
pkgconfig-wayland-egl \
pkgconfig-wayland-egl-backend \
pkgconfig-wayland-scanner \
pkgconfig-wayland-server \
wayland-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6 \
libexpat.so.1 \
libwayland-client0 \
libwayland-cursor0 \
libwayland-egl1 \
libwayland-server0 \
libxml2.so.16 \
pkgconfig-libffi \
pkgconfig-wayland-client"

inherit rpm
