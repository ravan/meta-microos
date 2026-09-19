SUMMARY = "Osmocom Serving Mobile Location Centre"
DESCRIPTION = "OsmoSMLC is the Osmocom Serving Mobile Location Centre. It implements \
the SMLC functionality as specified in 3GPP networks \
Location_Services architecture."
LICENSE = "AGPL-3.0-or-later"

PV = "0.4.0"

RPM_NAME = "osmo-smlc-0.4.0-1.3.aarch64.rpm"
RPM_HASH = "b41dff14d3254778e1832e8fc7315d3229a4a657e51b680d697a5c434e2851523377607b60b9720821a4c2b3889335fee87c441c6258337320721556c721a1b0"

RPROVIDES:${PN} += "osmo-smlc"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libosmo-sigtran.so.12 \
libosmocore.so.22 \
libosmoctrl.so.0 \
libosmogsm.so.20 \
libosmovty.so.13 \
libtalloc.so.2"

inherit rpm
