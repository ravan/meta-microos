SUMMARY = "Development files for the IDL parsing library"
DESCRIPTION = "LibIDL is a small library for creating parse trees of CORBA v2.2 \
compliant Interface Definition Language (IDL) files, which is a \
specification for defining interfaces which can be used between \
different CORBA implementations."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.14"

RPM_NAME = "libidl-devel-0.8.14-24.10.aarch64.rpm"
RPM_HASH = "fc7d993f83ae83c568881fc17c7328f487195e1d9d5f5143db6dd1042320c84f497be743b45763cf8a7a00fde6682e775531d4dead92a7c49e7ae4b1c8e4de2a"

RPROVIDES:${PN} += "libidl-devel \
pkgconfig-libIDL-2.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
libIDL-2-0 \
pkgconfig-glib-2.0"

inherit rpm
