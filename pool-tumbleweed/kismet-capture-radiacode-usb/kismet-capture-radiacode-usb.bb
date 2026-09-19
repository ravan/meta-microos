SUMMARY = "Kismet Radiacode USB Geiger counter driver"
DESCRIPTION = "Kismet is a wireless network and device detector, sniffer, wardriving \
tool, and WIDS (wireless intrusion detection) framework. \
 \
This subpackage contains the Radiacode USB Geiger counter capture \
helper."
LICENSE = "GPL-2.0-or-later"

PV = "2025_09_R1"

RPM_NAME = "kismet-capture-radiacode-usb-2025_09_R1-2.3.aarch64.rpm"
RPM_HASH = "e52516e864f59e94040183f8009e044e11a2d694f9d3d03f5846b5c64f570fdbdc741ab1001b9bcfc63699544376c43f618a7396aef423f9e0ec8681cbc412f9"

RPROVIDES:${PN} += "kismet-capture-radiacode-usb"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcap.so.2 \
libusb-1.0.so.0 \
libwebsockets.so.22"

inherit rpm
