SUMMARY = "Kismet AntSDR DJI DroneID driver"
DESCRIPTION = "Kismet is a wireless network and device detector, sniffer, wardriving \
tool, and WIDS (wireless intrusion detection) framework. \
 \
This subpackage contains the AntSDR DJI DroneID capture helper."
LICENSE = "GPL-2.0-or-later"

PV = "2025_09_R1"

RPM_NAME = "kismet-capture-antsdr-droneid-2025_09_R1-2.3.aarch64.rpm"
RPM_HASH = "292f32907490c075527a1b823960fdf4e23052fe03d8ff76b42ef55d6a41caf06f84d9784edba53256221a289976bdafa8d85ce5c63a1180268eba4b978b7d54"

RPROVIDES:${PN} += "kismet-capture-antsdr-droneid"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcap.so.2 \
libwebsockets.so.22"

inherit rpm
