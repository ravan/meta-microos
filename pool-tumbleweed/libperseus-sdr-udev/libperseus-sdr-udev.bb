SUMMARY = "Udev rules for Perseus SDR"
DESCRIPTION = "Udev rules for Perseus SDR hardware"
LICENSE = "GPL-3.0-only"

PV = "0.8.2"

RPM_NAME = "libperseus-sdr-udev-0.8.2-1.1.aarch64.rpm"
RPM_HASH = "b41ec1abedc5e003a052aedb844316500dd1da8b0b61c613a864c9a5d8e3e469ffe4309c765e326f721495d5f29ebf8a3132dbdd57a8c6f3064394f5de9bf81f"

RPROVIDES:${PN} += "libperseus-sdr-udev"

RDEPENDS:${PN} += "/usr/bin/sh \
shadow"

inherit rpm
