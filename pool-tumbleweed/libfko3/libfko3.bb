SUMMARY = "The Firewall Knock Operator Library"
DESCRIPTION = "The Firewall Knock Operator library, libfko, provides the Single Packet \
Authorization implementation and API for the other fwknop components."
LICENSE = "GPL-2.0-or-later"

PV = "2.6.11"

RPM_NAME = "libfko3-2.6.11-1.10.aarch64.rpm"
RPM_HASH = "3827649ba067d7979a23c5a54f94fac1667a82ce6cedfa16b48ac331680335c3c124b81b465c546b43fb89244a9f1074edd86c11b830259d6b904ad84caa31db"

RPROVIDES:${PN} += "libfko.so.3 \
libfko3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgpgme.so.45"

inherit rpm
