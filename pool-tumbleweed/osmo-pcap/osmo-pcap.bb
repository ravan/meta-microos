SUMMARY = "Osmocom's PCAP client and server"
DESCRIPTION = "Osmocom tools to help with pcap tracing. \
Run osmo_pcap_client locally and send traces to a different system."
LICENSE = "AGPL-3.0-or-later & GPL-2.0-or-later"

PV = "0.1.3"

RPM_NAME = "osmo-pcap-0.1.3-2.9.aarch64.rpm"
RPM_HASH = "fffc5098cc95e413502d2eb2659486b6bed614e4cc730115d1d0df7bf95389112020a5e7e46f3f14a87573b1e2ce4765e4979f67899afdd993181295e5ad53d0"

RPROVIDES:${PN} += "config-osmo-pcap \
osmo-pcap"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgnutls.so.30 \
libosmocore.so.22 \
libosmogsm.so.20 \
libosmovty.so.13 \
libpcap.so.1 \
libtalloc.so.2 \
libzmq.so.5"

inherit rpm
