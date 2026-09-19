SUMMARY = "Development Files for Pragha Plugins"
DESCRIPTION = "This package contains development files needed to develop plugins for Pragha."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.99.1"

RPM_NAME = "pragha-plugins-devel-1.3.99.1-5.7.aarch64.rpm"
RPM_HASH = "11cd0663868b16437b65b1bbe06908390de739130e693098ff008ed78bff62eccb83f447c83442cd61b8da5d805e5fe595318d3b1b5cd5dcc9a7489643923724"

RPROVIDES:${PN} += "pkgconfig-libpragha \
pragha-plugins-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
pkgconfig-gio-2.0 \
pkgconfig-gstreamer-1.0 \
pkgconfig-gstreamer-base-1.0 \
pkgconfig-gtk+-3.0 \
pkgconfig-libpeas-1.0 \
pkgconfig-libpeas-gtk-1.0 \
pkgconfig-taglib-c"

inherit rpm
