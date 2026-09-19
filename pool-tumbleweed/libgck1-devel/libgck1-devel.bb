SUMMARY = "Development files for gck, a GObject library to access PKCS#11 modules"
DESCRIPTION = "GCK is a library for accessing PKCS#11 modules like smart cards, in a \
(G)object oriented way."
LICENSE = "LGPL-2.1-or-later"

PV = "3.41.2"

RPM_NAME = "libgck1-devel-3.41.2-5.4.aarch64.rpm"
RPM_HASH = "69e407a7247027a49713e9f64eb07e053454582e7f98410b3a654dc7b6abf48579902c47e640e4f37b7345dbf56190a4316e99c4eead71bd31b27ff8ead1def4"

RPROVIDES:${PN} += "libgck1-devel \
pkgconfig-gck-1"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgck-1-0 \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-p11-kit-1 \
typelib-1-0-Gck-1"

inherit rpm
