SUMMARY = "OpenGL window and compositing manager plugins"
DESCRIPTION = "This package contains the non-default Compiz compositing manager \
plugins."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.18"

RPM_NAME = "compiz-plugins-main-devel-0.8.18-2.8.aarch64.rpm"
RPM_HASH = "66b7ff1db49bfd583037adb6e8f3481fb20e211363af972f6fc41f5b5358a82e5339d7e57fa00f3b2ddf1f7ea938460981decb913d23dc206740f3f51c5d752c"

RPROVIDES:${PN} += "compiz-fusion-plugins-main-devel \
compiz-plugins-main-devel \
pkgconfig-compiz-animation \
pkgconfig-compiz-focuspoll \
pkgconfig-compiz-mousepoll \
pkgconfig-compiz-text"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
compiz-plugins-main \
pkgconfig-bcop \
pkgconfig-cairo \
pkgconfig-cairo-xlib-xrender \
pkgconfig-compiz \
pkgconfig-compiz-scale \
pkgconfig-gl \
pkgconfig-pangocairo"

inherit rpm
