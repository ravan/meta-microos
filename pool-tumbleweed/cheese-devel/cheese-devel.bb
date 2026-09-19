SUMMARY = "Development files for the Cheese webcam booth"
DESCRIPTION = "Cheese is an application to take photos and videos with your webcam, \
with fun graphical effects."
LICENSE = "GPL-2.0-or-later"

PV = "44.1+12"

RPM_NAME = "cheese-devel-44.1+12-1.6.aarch64.rpm"
RPM_HASH = "362ac216255e87f3f06c449fd8b529ce34848c7a44cd888761312fa3add0ba82a95907a103ee91be335348239dbab6ba6e952eb0c6025181ff16961d105384f6"

RPROVIDES:${PN} += "cheese-devel \
pkgconfig-cheese \
pkgconfig-cheese-gtk"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcheese-gtk25 \
libcheese8 \
pkgconfig-clutter-1.0 \
pkgconfig-clutter-gst-3.0 \
pkgconfig-clutter-gtk-1.0 \
pkgconfig-gdk-pixbuf-2.0 \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gstreamer-1.0 \
pkgconfig-gstreamer-pbutils-1.0 \
pkgconfig-gstreamer-plugins-bad-1.0 \
pkgconfig-gtk+-3.0 \
pkgconfig-x11 \
typelib-1-0-Cheese-3-0"

inherit rpm
