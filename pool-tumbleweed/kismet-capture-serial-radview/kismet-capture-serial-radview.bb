SUMMARY = "Kismet Radview geiger counter capture helper"
DESCRIPTION = "Kismet is a wireless network and device detector, sniffer, wardriving \
tool, and WIDS (wireless intrusion detection) framework. \
 \
This subpackage contains the Radview geiger counter capture \
helper."
LICENSE = "GPL-2.0-or-later"

PV = "2025_09_R1"

RPM_NAME = "kismet-capture-serial-radview-2025_09_R1-2.3.aarch64.rpm"
RPM_HASH = "63422444fb759752512f69767cb97e8b3669cec41a3e5a190417b1f9ba89ceb654a81334788fd738c7297329710ccbccc6ac8a43f8ac19beb97dcee828216122"

RPROVIDES:${PN} += "kismet-capture-serial-radview"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcap.so.2 \
libwebsockets.so.22"

inherit rpm
