SUMMARY = "GPRS Support Node"
DESCRIPTION = "Osmo-GGSN is a C-language implementation of a GGSN (Gateway GPRS \
Support Node), a core network element of ETSI/3GPP cellular networks \
such as GPRS, EDGE, UMTS or HSPA."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "1.15.0"

RPM_NAME = "osmo-ggsn-1.15.0-1.1.aarch64.rpm"
RPM_HASH = "ce0cf5966daf3c3600b42f956b8a02dbea76d112833e3d1ef73145825f521837e892bc36dae8e9cfc9ebe5d4a5caacb474e28e73974de4f1636658b43d20097e"

RPROVIDES:${PN} += "config-osmo-ggsn \
osmo-ggsn"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgtp.so.11 \
libgtpnl.so.0 \
libosmocore.so.22 \
libosmoctrl.so.0 \
libosmogsm.so.20 \
libosmonetif.so.11 \
libosmovty.so.13 \
libtalloc.so.2"

inherit rpm
