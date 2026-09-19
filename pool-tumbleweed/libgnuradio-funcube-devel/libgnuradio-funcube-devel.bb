SUMMARY = "Development files for the FCD and FCDpro Plus addon"
DESCRIPTION = "gr-funcube is an linux oot-module for gnuradio to implement a FUNcube \
Dongle and a FUNcube Dongle PRO+ source. It autodetects the correct \
soundcard from /proc/asound/cards. This idea was taken from the osmosdr \
 drivers. To control the device, the hidraw code of the HID API is used."
LICENSE = "GPL-3.0-only"

PV = "3.10.0.rc3"

RPM_NAME = "libgnuradio-funcube-devel-3.10.0.rc3-3.5.aarch64.rpm"
RPM_HASH = "eaa7e4cf54a4fef80a60f6af7ee7d9a89b30343a8f171e1f6645e266a44cb7565d97786837b766946eb3c67f1902889099027495f5062ca6de6578488e4582cb"

RPROVIDES:${PN} += "cmake-funcube \
cmake-gnuradio-funcube \
libgnuradio-funcube-devel"

RDEPENDS:${PN} += "libgnuradio-funcube3-10-0"

inherit rpm
