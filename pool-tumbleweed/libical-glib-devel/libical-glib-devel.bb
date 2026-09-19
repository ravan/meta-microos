SUMMARY = "Development files for building against libical-glib"
DESCRIPTION = "Development files for building against libical-glib3"
LICENSE = "LGPL-2.1-only | MPL-2.0"

PV = "3.0.20"

RPM_NAME = "libical-glib-devel-3.0.20-1.8.aarch64.rpm"
RPM_HASH = "ed5df04ac97b92a8b1bd88e2888ca772f9a1697f2086fd93bd5647513c2224849d63946e5e7c11b46b994d3eb33864392b0f2ceec539f9791400dfb65fc3425e"

RPROVIDES:${PN} += "libical-glib-devel \
pkgconfig-libical-glib"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libical-glib3 \
libxml2.so.16 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-libical \
typelib-1-0-ICal-3-0 \
typelib-1-0-ICalGLib-3-0"

inherit rpm
