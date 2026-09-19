SUMMARY = "Shared library for libglycin-gtk4"
DESCRIPTION = "Sandboxed and extendable image decoding. \
 \
This package provides the shared library for libglycin-gtk4"
LICENSE = "LGPL-2.1-or-later | MPL-2.0"

PV = "2.1.5"

RPM_NAME = "libglycin-gtk4-2-0-2.1.5-1.2.aarch64.rpm"
RPM_HASH = "d4914021eafd299590acc534945fda98bf2802cf4d3fea85f21867eded9739def9e5a2d02c127e5fa68929e0b7db2788102c696a3a8fb8ade47f1a9c63aa6180"

RPROVIDES:${PN} += "libglycin-gtk4-2-0 \
libglycin-gtk4-2.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libglycin-2.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1"

inherit rpm
