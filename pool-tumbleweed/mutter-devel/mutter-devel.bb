SUMMARY = "Development files for mutter, a window and compositing manager"
DESCRIPTION = "This subpackage contains libraries and header files for developing \
applications that want to make use of the mutter library."
LICENSE = "GPL-2.0-or-later"

PV = "50.4"

RPM_NAME = "mutter-devel-50.4-1.1.aarch64.rpm"
RPM_HASH = "1a4f2bee49eb1d749c2b99418c2c2ea3c920212608027de1e39d2ef6e113e95dc34e47813430f521d793c0789b92d8aa38eaa0f7302168cddd5274c8b1387bb0"

RPROVIDES:${PN} += "mutter-devel \
pkgconfig-libmutter-18 \
pkgconfig-mutter-clutter-18 \
pkgconfig-mutter-cogl-18 \
pkgconfig-mutter-mtk-18"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
mutter \
pkgconfig-atk \
pkgconfig-cairo \
pkgconfig-colord \
pkgconfig-egl \
pkgconfig-fribidi \
pkgconfig-gbm \
pkgconfig-gio-unix-2.0 \
pkgconfig-gl \
pkgconfig-glesv2 \
pkgconfig-glib-2.0 \
pkgconfig-glycin-2 \
pkgconfig-gmodule-no-export-2.0 \
pkgconfig-gnome-desktop-4 \
pkgconfig-gnome-settings-daemon \
pkgconfig-gobject-2.0 \
pkgconfig-gobject-introspection-1.0 \
pkgconfig-graphene-gobject-1.0 \
pkgconfig-gsettings-desktop-schemas \
pkgconfig-gudev-1.0 \
pkgconfig-harfbuzz \
pkgconfig-lcms2 \
pkgconfig-libcanberra \
pkgconfig-libdisplay-info \
pkgconfig-libdrm \
pkgconfig-libeis-1.0 \
pkgconfig-libinput \
pkgconfig-libpipewire-0.3 \
pkgconfig-libstartup-notification-1.0 \
pkgconfig-libsystemd \
pkgconfig-libudev \
pkgconfig-libwacom \
pkgconfig-mutter-clutter-18 \
pkgconfig-mutter-cogl-18 \
pkgconfig-mutter-mtk-18 \
pkgconfig-pango \
pkgconfig-pangocairo \
pkgconfig-pixman-1 \
pkgconfig-wayland-eglstream-protocols \
pkgconfig-wayland-server \
pkgconfig-x11 \
pkgconfig-x11-xcb \
pkgconfig-xau \
pkgconfig-xcb-res \
pkgconfig-xcomposite \
pkgconfig-xcursor \
pkgconfig-xdamage \
pkgconfig-xext \
pkgconfig-xfixes \
pkgconfig-xi \
pkgconfig-xinerama \
pkgconfig-xkbcommon \
pkgconfig-xkbregistry \
pkgconfig-xrandr"

inherit rpm
