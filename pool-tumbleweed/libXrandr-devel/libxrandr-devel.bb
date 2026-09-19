SUMMARY = "Development files for the X Resize-Rotate-Reflection library"
DESCRIPTION = "The X Resize, Rotate and Reflect Extension (RandR) allows clients to \
dynamically change X screens, so as to resize, to change the \
orientation and layout of the root window of a screen. \
 \
This package contains the development headers for the library found \
in libXrandr2."
LICENSE = "MIT"

PV = "1.5.5"

RPM_NAME = "libXrandr-devel-1.5.5-1.4.aarch64.rpm"
RPM_HASH = "44b4274d8dbf5c6da3e74700388e55b11b26e25e61703920ce97dfec173e4e3f743d2519fa3a43e6e92667725489ada275b441578763fc5480b2e41678d615e8"

RPROVIDES:${PN} += "libXrandr-devel \
pkgconfig-xrandr"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libXrandr2 \
pkgconfig-randrproto \
pkgconfig-renderproto \
pkgconfig-x11 \
pkgconfig-xext \
pkgconfig-xextproto \
pkgconfig-xproto \
pkgconfig-xrender"

inherit rpm
