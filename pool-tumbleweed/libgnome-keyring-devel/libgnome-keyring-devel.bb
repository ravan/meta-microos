SUMMARY = "Library to integrate with the GNOME Keyring - Development Files"
DESCRIPTION = "The GNOME Keyring is a program that keep password and other secrets \
for users. The libgnome-keyring library is used by applications to \
integrate with the GNOME Keyring system."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.12.0"

RPM_NAME = "libgnome-keyring-devel-3.12.0-9.20.aarch64.rpm"
RPM_HASH = "83f22c940fe2636f8650dedfec356b53047f093b78672536e050a3f1f4544f1af3da25bc11677b657ca88ea11eca606d14914ef7e008c99e9965a866f0faa246"

RPROVIDES:${PN} += "gnome-keyring-devel \
gnome-keyring-doc \
libgnome-keyring-devel \
pkgconfig-gnome-keyring-1"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgnome-keyring0 \
pkgconfig-glib-2.0 \
typelib-1-0-GnomeKeyring-1-0"

inherit rpm
