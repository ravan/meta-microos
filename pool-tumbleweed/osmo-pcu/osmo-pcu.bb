SUMMARY = "Osmocom GPRS Packet Control Unit (PCU)"
DESCRIPTION = "Osmocom PCU code (RLC/MAC/PCU) for OpenBTS and OsmoBTS."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "1.0.0"

RPM_NAME = "osmo-pcu-1.0.0-2.10.aarch64.rpm"
RPM_HASH = "a6b6070f66d0d5f4a873b23c514b32d3454f76f5bd608bf880a5504baf156d5572e18346074574d5269bc1b3b200d8984ff4ea6a6209083b8788e42fd825fa39"

RPROVIDES:${PN} += "config-osmo-pcu \
osmo-pcu"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libosmocore.so.22 \
libosmoctrl.so.0 \
libosmogb.so.14 \
libosmogsm.so.20 \
libosmovty.so.13 \
libstdc++.so.6 \
libtalloc.so.2"

inherit rpm
