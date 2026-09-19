SUMMARY = "Library to integrate with the GNOME Keyring"
DESCRIPTION = "The GNOME Keyring is a program that keep password and other secrets \
for users. The libgnome-keyring library is used by applications to \
integrate with the GNOME Keyring system."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.12.0"

RPM_NAME = "libgnome-keyring0-3.12.0-9.20.aarch64.rpm"
RPM_HASH = "2594ffe61644ccc138ca5f85f822b1ddff0b66315ba556a03220d5d4f4fbccaf6866de7c952d59336ae3af053296df17a94cd8109caf52f10030385f0eaffd64"

RPROVIDES:${PN} += "libgnome-keyring \
libgnome-keyring.so.0 \
libgnome-keyring0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3 \
libgcrypt.so.20 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
