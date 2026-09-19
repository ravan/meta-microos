SUMMARY = "Development files for the GNOME Bluetooth libraries"
DESCRIPTION = "A set of graphical utilities to setup, monitor and use Bluetooth devices. \
 \
This package provides the necessary files for development with GNOME Bluetooth."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "47.2"

RPM_NAME = "gnome-bluetooth-devel-47.2-1.3.aarch64.rpm"
RPM_HASH = "7a4ed9da2de3ef1c0c49e8dd066be7da6049b8249c98344c9ef01916e216258b70f180c2ce6211dc23491a1d2c22b80f1d99d30fd2fe742111fadd5014cbb306"

RPROVIDES:${PN} += "gnome-bluetooth-devel \
pkgconfig-gnome-bluetooth-3.0 \
pkgconfig-gnome-bluetooth-ui-3.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gnome-bluetooth \
libgnome-bluetooth-3-0-13 \
libgnome-bluetooth-ui-3-0-13 \
pkgconfig-gio-2.0 \
pkgconfig-gtk4 \
pkgconfig-libadwaita-1 \
typelib-1-0-GnomeBluetooth-3-0"

inherit rpm
