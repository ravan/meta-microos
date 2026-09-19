SUMMARY = "Osmocom's SGSN for 2G and 3G packet-switched mobile networks"
DESCRIPTION = "OsmoSGSN is Osmocom's Serving GPRS Support Node for 2G and 3G \
packet-switched mobile networks."
LICENSE = "AGPL-3.0-or-later & GPL-2.0-or-later"

PV = "1.8.0"

RPM_NAME = "osmo-sgsn-1.8.0-2.14.aarch64.rpm"
RPM_HASH = "1c6bcdc497b25c0faf57d766b01c8c84ff14e493eaf1ff248b31d3c22f354a9347df7a98e787a1ec22b8244b30de6e29dbff5e81e79a814be230e1920b8af134"

RPROVIDES:${PN} += "config-osmo-sgsn \
osmo-sgsn"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcares.so.2 \
libgtp.so.11 \
libosmo-gsup-client.so.0 \
libosmo-ranap.so.7 \
libosmo-sigtran.so.12 \
libosmocore.so.22 \
libosmoctrl.so.0 \
libosmogb.so.14 \
libosmogsm.so.20 \
libosmovty.so.13 \
libtalloc.so.2 \
systemd"

inherit rpm
