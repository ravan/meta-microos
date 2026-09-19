SUMMARY = "Osmocom GPRS Gb Interface (NS/BSSGP) library"
DESCRIPTION = "libosmocore is a package with various utility functions that were \
originally developed as part of the OpenBSC project. \
 \
The libosmogb library contains a GPRS BSSGP protocol implementation."
LICENSE = "AGPL-3.0-or-later"

PV = "1.14.2"

RPM_NAME = "libosmogb14-1.14.2-1.1.aarch64.rpm"
RPM_HASH = "8c4434d116d0445be4d81d3c132a9b28aab42d71d02a4ec94c3fcdf14ad8faa324e622ffe75b50d387ffce12af9b85462d8486aae197d37f09b22ba3e68f4dbc"

RPROVIDES:${PN} += "libosmogb.so.14 \
libosmogb14"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libosmocore.so.22 \
libosmogsm.so.20 \
libosmovty.so.13 \
libtalloc.so.2"

inherit rpm
