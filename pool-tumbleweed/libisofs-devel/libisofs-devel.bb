SUMMARY = "Development Files for libisofs"
DESCRIPTION = "Development files for developing applications using libisofs."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "1.5.8.pl02"

RPM_NAME = "libisofs-devel-1.5.8.pl02-1.2.aarch64.rpm"
RPM_HASH = "1cc54568d7e891787c073c8fcf1981e89163ca14c62cd59d23a53b32146bb9158e82096120c663fd38a1f36b387f51e3cf8865986b674115951fa9718b137ac6"

RPROVIDES:${PN} += "libisofs-devel \
pkgconfig-libisofs-1"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libisofs6"

inherit rpm
