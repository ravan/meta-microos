SUMMARY = "Command line parsing library"
DESCRIPTION = "The libargtable2 package contains libraries for libargtable."
LICENSE = "LGPL-2.0-or-later"

PV = "2.13"

RPM_NAME = "libargtable2-0-2.13-4.7.aarch64.rpm"
RPM_HASH = "035167a77e935617acf2f5e105b04e08606c7ac4a97f72a1d4ac15e3039bb024c009a07afd1ee9cfe4c9a772d4ed90ed0daa5ee94a522f2a4a342dcea9fd25c9"

RPROVIDES:${PN} += "libargtable2-0 \
libargtable2.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
