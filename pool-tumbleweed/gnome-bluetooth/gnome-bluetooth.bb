SUMMARY = "GNOME Bluetooth graphical utilities"
DESCRIPTION = "A set of graphical utilities to setup, monitor and use Bluetooth devices. \
 \
This package provides the utilities, data files and manuals for GNOME Bluetooth."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "47.2"

RPM_NAME = "gnome-bluetooth-47.2-1.3.aarch64.rpm"
RPM_HASH = "bc5e3c5e2f0b02606e78b5a20993d0fdb1b61606527ad31f424a3f9f59fd53b3fd054d9598c40270a751abc7b81734d47d71bdc351ea9dae9740876839f17f90"

RPROVIDES:${PN} += "gnome-bluetooth"

RDEPENDS:${PN} += "bluez \
ld-linux-aarch64.so.1 \
libadwaita-1.so.0 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgnome-bluetooth-3.0.so.13 \
libgobject-2.0.so.0 \
libgtk-4.so.1"

inherit rpm
