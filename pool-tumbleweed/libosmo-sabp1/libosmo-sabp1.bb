SUMMARY = "Osmocom Service Area Broadcast Protocol library"
DESCRIPTION = "Osmocom code for the Service Area Broadcast Protocol interface."
LICENSE = "AGPL-3.0-or-later"

PV = "1.8.1"

RPM_NAME = "libosmo-sabp1-1.8.1-1.1.aarch64.rpm"
RPM_HASH = "7cfbbb72256894e9e12a7ee465f080b4cf6229fd953c2a12e4252c4940a790977a0863c6dec08682ad10931d7798092772f0589470ded2a0aa16db2b6a65b681"

RPROVIDES:${PN} += "libosmo-sabp.so.1 \
libosmo-sabp1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libasn1c.so.1 \
libc.so.6 \
libosmocore.so.22 \
libtalloc.so.2"

inherit rpm
