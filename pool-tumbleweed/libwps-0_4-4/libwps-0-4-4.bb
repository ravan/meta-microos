SUMMARY = "Library for the Microsoft Works text and spreadsheet formats"
DESCRIPTION = "libwps is a library for importing the Microsoft Works word processor \
and spreadsheet file format."
LICENSE = "LGPL-2.1-or-later & MPL-2.0"

PV = "0.4.14"

RPM_NAME = "libwps-0_4-4-0.4.14-1.12.aarch64.rpm"
RPM_HASH = "2a644a96d8be79c79ac12de6f29decccc369baf7878b1ea5e9ec089efcf4fff4e5abc0180d55435643fe6c2763a3be314ecf26b676f8e3a5162455b4bb188e2e"

RPROVIDES:${PN} += "libwps-0-4-4 \
libwps-0.4.so.4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
librevenge-0.0.so.0 \
libstdc++.so.6"

inherit rpm
