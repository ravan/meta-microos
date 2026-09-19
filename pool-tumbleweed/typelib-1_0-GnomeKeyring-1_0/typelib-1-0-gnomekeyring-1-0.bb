SUMMARY = "Library to integrate with the GNOME Keyring -- Introspection bindings"
DESCRIPTION = "The GNOME Keyring is a program that keep password and other secrets \
for users. The libgnome-keyring library is used by applications to \
integrate with the GNOME Keyring system. \
 \
This package provides the GObject Introspection bindings for \
libgnome-keyring."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.12.0"

RPM_NAME = "typelib-1_0-GnomeKeyring-1_0-3.12.0-9.20.aarch64.rpm"
RPM_HASH = "2cb9626e54315245c3366d4fc40a6711fa32508e822b91ad643ab82a20eaf1920fce5fd71f848facc9953a8abedf57fff353c1dce643bb1db2c271138b14bb73"

RPROVIDES:${PN} += "typelib-1-0-GnomeKeyring-1-0 \
typelib-GnomeKeyring"

RDEPENDS:${PN} += "libgnome-keyring.so.0 \
typelib-GLib \
typelib-GObject"

inherit rpm
