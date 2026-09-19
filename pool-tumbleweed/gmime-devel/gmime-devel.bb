SUMMARY = "MIME Parser and Utility Library -- Development Files"
DESCRIPTION = "GMime is a C/C++ library for parsing and creating messages using \
the Multipurpose Internet Mail Extension (MIME)."
LICENSE = "LGPL-2.1-or-later"

PV = "3.2.15"

RPM_NAME = "gmime-devel-3.2.15-1.7.aarch64.rpm"
RPM_HASH = "eedafe785ca5d6ecfd0b960f637e13d91406d0c740d402fa44e9ba6f8708f7b10571caf8ddc09d99b2f24a0ce7f0cb8e6be52f7210bc0b63063a8ac25d4fa1cf"

RPROVIDES:${PN} += "gmime-devel \
pkgconfig-gmime-3.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgmime-3-0-0 \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0"

inherit rpm
