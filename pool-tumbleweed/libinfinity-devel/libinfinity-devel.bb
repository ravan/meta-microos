SUMMARY = "Implementation of the Infinote collaborative editing protocol"
DESCRIPTION = "libinfinity is an implementation of the Infinote protocol written in \
GObject-based C. Infinote is a protocol for collaborative editing \
multiple documents and is portable to both Windows and Unix-like \
platforms."
LICENSE = "LGPL-2.1-or-later"

PV = "0.7.2"

RPM_NAME = "libinfinity-devel-0.7.2-4.20.aarch64.rpm"
RPM_HASH = "fec4c8a5dc29210ac174a8036b0b89545f8f0a173412546ccb216d2fdd2a04645c02371c677516f4c2b6b8e06fac70f3cee25ec75a357acb595fc895c5a8b63b"

RPROVIDES:${PN} += "libinfinity-devel \
pkgconfig-libinfgtk-0.7 \
pkgconfig-libinfinity-0.7 \
pkgconfig-libinfinoted-plugin-manager-0.7 \
pkgconfig-libinftext-0.7 \
pkgconfig-libinftextgtk-0.7"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgnutls-devel \
libgsasl-devel \
libinfinity-0-7-0 \
pkgconfig-glib-2.0 \
pkgconfig-gnutls \
pkgconfig-gobject-2.0 \
pkgconfig-gtk+-2.0 \
pkgconfig-gtk+-3.0 \
pkgconfig-libgsasl \
pkgconfig-libinfinity-0.7 \
pkgconfig-libinftext-0.7 \
pkgconfig-libxml-2.0"

inherit rpm
