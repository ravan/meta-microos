SUMMARY = "Enightenment development files"
DESCRIPTION = "Development files of Enlightenment package."
LICENSE = "BSD-2-Clause"

PV = "0.25.4"

RPM_NAME = "enlightenment-devel-0.25.4-5.11.aarch64.rpm"
RPM_HASH = "de4b35379258c40f13de3024f5db0012ad700147ab24858c623cd9d23eb74528012e882303b0c6a1502c8649f339b26f5a1d177392d1e2cefe4d01d01bc21be6"

RPROVIDES:${PN} += "e17-devel \
enlightenment-devel \
pkgconfig-enlightenment \
pkgconfig-everything"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
efl-devel \
elementary-devel \
enlightenment \
freetype2-devel \
pam-devel \
pkgconfig \
pkgconfig-dbus-1 \
pkgconfig-ecore \
pkgconfig-ecore-con \
pkgconfig-ecore-drm2 \
pkgconfig-ecore-file \
pkgconfig-ecore-input \
pkgconfig-ecore-input-evas \
pkgconfig-ecore-ipc \
pkgconfig-ecore-wl2 \
pkgconfig-ecore-x \
pkgconfig-eet \
pkgconfig-eeze \
pkgconfig-efl-canvas-wl \
pkgconfig-efreet \
pkgconfig-efreet-mime \
pkgconfig-eina \
pkgconfig-eio \
pkgconfig-eldbus \
pkgconfig-elementary \
pkgconfig-emotion \
pkgconfig-enlightenment \
pkgconfig-evas \
pkgconfig-uuid \
pkgconfig-wayland-client \
pkgconfig-wayland-protocols \
pkgconfig-wayland-scanner \
pkgconfig-wayland-server \
pkgconfig-xkbcommon \
xorg-x11-libXext-devel"

inherit rpm
