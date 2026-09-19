SUMMARY = "Notifications Library"
DESCRIPTION = "D-BUS notifications library."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.8"

RPM_NAME = "libnotify-devel-0.8.8-2.4.aarch64.rpm"
RPM_HASH = "365e5183d31c51a326c2b30a511478a728a68e00ee914541353c4f891d25b59024c82fe3d8843682e33a0283c7fe16e484f807a78491ff27a358e27174433768"

RPROVIDES:${PN} += "libnotify-devel \
libnotify-doc \
pkgconfig-libnotify"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libnotify4 \
pkgconfig-gdk-pixbuf-2.0 \
pkgconfig-gio-2.0 \
pkgconfig-gio-unix-2.0 \
pkgconfig-glib-2.0 \
typelib-1-0-Notify-0-7"

inherit rpm
