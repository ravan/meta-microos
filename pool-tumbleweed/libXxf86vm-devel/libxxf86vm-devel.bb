SUMMARY = "Development files for the XFree86-VidMode X extension library"
DESCRIPTION = "These functions provide aninterface to the server extension \
XFree86-VidModeExtension which allows the video modes to be queried \
and adjusted dynamically and mode switching to be controlled. \
 \
This package contains the development headers for the library found \
in libXxf86vm1."
LICENSE = "MIT"

PV = "1.1.7"

RPM_NAME = "libXxf86vm-devel-1.1.7-1.4.aarch64.rpm"
RPM_HASH = "15b705a31849b4b219fd116c02217abece83728d52355c413b11c5ec424f7246096007c9c10a579b8267553e438d5d9d4b948cd82107e34366e9b7a97e7f0674"

RPROVIDES:${PN} += "libXxf86vm-devel \
pkgconfig-xxf86vm"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libXxf86vm1 \
pkgconfig-x11 \
pkgconfig-xext \
pkgconfig-xf86vidmodeproto"

inherit rpm
