SUMMARY = "pcap output target for ulogd"
DESCRIPTION = "pcap output target for ulogd."
LICENSE = "GPL-2.0-only"

PV = "2.0.9"

RPM_NAME = "ulogd-pcap-2.0.9-1.6.aarch64.rpm"
RPM_HASH = "12bb9a6827491175c0322fa6d818193df7c5e3322a0010850ea4806422efdd8f6e38b10dda98fdf4030be782d8c1ffc6c0a63caef6b035126fb44477f86e2aae"

RPROVIDES:${PN} += "ulogd-pcap"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
ulogd"

inherit rpm
