SUMMARY = "Development files for the Core X11 protocol library"
DESCRIPTION = "This package contains the development headers for the library found \
in libX11-6 and libX11-xcb1."
LICENSE = "MIT"

PV = "1.8.13"

RPM_NAME = "libX11-devel-1.8.13-1.4.aarch64.rpm"
RPM_HASH = "989fc5e7f4990a51bb84ef5bc4fa0fc01cb6959df171b1f091ce32440487a6b7f53574aea1a886634c5c3c2356c7ad2ff2c4c40d005aca36226c033215442714"

RPROVIDES:${PN} += "libX11-devel \
pkgconfig-x11 \
pkgconfig-x11-xcb \
xorg-x11-libX11-devel \
xorgproto-devel-/usr/include/X11/extensions/XKBgeom.h"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libX11-6 \
libX11-xcb1 \
pkgconfig-kbproto \
pkgconfig-x11 \
pkgconfig-xcb \
pkgconfig-xproto"

inherit rpm
