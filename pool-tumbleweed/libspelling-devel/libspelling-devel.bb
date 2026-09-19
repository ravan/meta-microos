SUMMARY = "Development files for libspelling"
DESCRIPTION = "The libspelling-devel package contains libraries and header files for \
developing applications that use libspelling."
LICENSE = "LGPL-2.1-or-later"

PV = "0.4.10"

RPM_NAME = "libspelling-devel-0.4.10-4.1.aarch64.rpm"
RPM_HASH = "360467d4fd251da36426fd91033722049de36df42d77ba4e58634a74b0da0436d49484621242a8408b1790a9fbc9c082d829de74f4ea4e09b292fa2e0e7bf08b"

RPROVIDES:${PN} += "libspelling-devel \
pkgconfig-libspelling-1"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libspelling1-2 \
pkgconfig-gio-2.0 \
pkgconfig-gtk4 \
pkgconfig-gtksourceview-5 \
typelib-1-0-Spelling-1"

inherit rpm
