SUMMARY = "Kismet Freaklabs Zigbee capture helper"
DESCRIPTION = "Kismet is a wireless network and device detector, sniffer, wardriving \
tool, and WIDS (wireless intrusion detection) framework. \
 \
This subpackage contains the Freaklabs Zigbee capture helper."
LICENSE = "GPL-2.0-or-later"

PV = "2025_09_R1"

RPM_NAME = "kismet-capture-freaklabs-zigbee-2025_09_R1-2.3.aarch64.rpm"
RPM_HASH = "7998d29051d20422c7b59e0e551a762c2b9c0e45997a1f01fafdfbbb24f4ab43ae65f721bd68881af83cb750869b6f1615f1339601f41e38538ed9fb9d1715e5"

RPROVIDES:${PN} += "kismet-capture-freaklabs-zigbee"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcap.so.2 \
libwebsockets.so.22 \
python3-protobuf \
python3-pyserial"

inherit rpm
