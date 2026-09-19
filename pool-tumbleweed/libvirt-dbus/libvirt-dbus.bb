SUMMARY = "D-Bus API binding for libvirt"
DESCRIPTION = "This package provides D-Bus API for libvirt"
LICENSE = "LGPL-2.1-or-later"

PV = "1.4.1"

RPM_NAME = "libvirt-dbus-1.4.1-3.18.aarch64.rpm"
RPM_HASH = "b3f7ce68ef68f1c0e7ef397782989121e1a8b0c8a5a99ae066ec7a7eec67fed5e2585d38a8e59899252018b47b4e648d5a28975477f4963e6a9617e5de1cb1b3"

RPROVIDES:${PN} += "libvirt-dbus"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libvirt-glib-1.0.so.0 \
libvirt.so.0 \
polkit \
user-libvirtdbus"

inherit rpm
