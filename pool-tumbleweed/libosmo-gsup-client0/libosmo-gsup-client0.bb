SUMMARY = "Osmocom GSUP (General Subscriber Update Protocol) client library"
DESCRIPTION = "This is a shared library that can be used to implement client programs for \
the GSUP protocol. The typical GSUP server is OsmoHLR, with OsmoMSC, OsmoSGSN \
and External USSD Entities (EUSEs) using this library to implement clients."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.0"

RPM_NAME = "libosmo-gsup-client0-1.4.0-2.14.aarch64.rpm"
RPM_HASH = "f7116a6d7d930d57c4c5653a958408d3af3b45c268bb2bf0565fdeda7e383c50f6206f480e11078f01eeddaf15028a81b46b0817c0946bff3f80fb0e8af1ceee"

RPROVIDES:${PN} += "libosmo-gsup-client.so.0 \
libosmo-gsup-client0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libosmoabis.so.17 \
libosmocore.so.22 \
libtalloc.so.2"

inherit rpm
