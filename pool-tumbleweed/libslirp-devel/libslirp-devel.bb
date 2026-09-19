SUMMARY = "Development files for libslirp"
DESCRIPTION = "The libslirp-devel package contains libraries and header files for \
developing applications that use libslirp."
LICENSE = "MIT"

PV = "4.9.3+4"

RPM_NAME = "libslirp-devel-4.9.3+4-1.3.aarch64.rpm"
RPM_HASH = "08ba05feecf9cc1fb1d8562a750e6dda2284a631b880d78bbf670cdb9419f43875738138e8ece6001f7848b254e01864b57581b002381dab9696eae4beac3b2c"

RPROVIDES:${PN} += "libslirp-devel \
pkgconfig-slirp"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libslirp0 \
pkgconfig-glib-2.0"

inherit rpm
