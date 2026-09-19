SUMMARY = "FCD and FCDpro Plus Linux addon for gnuradio"
DESCRIPTION = "gr-funcube is an linux oot-module for gnuradio to implement a FUNcube \
Dongle and a FUNcube Dongle PRO+ source. It autodetects the correct \
soundcard from /proc/asound/cards. This idea was taken from the osmosdr \
 drivers. To control the device, the hidraw code of the HID API is used."
LICENSE = "GPL-3.0-only"

PV = "3.10.0.rc3"

RPM_NAME = "gr-funcube-3.10.0.rc3-3.5.aarch64.rpm"
RPM_HASH = "10d81a6d7563005631b38179e4752bd1410b99249fb2698072219001786fc97471e1751469514b451dab83bd2ea69b4df26b26b4cb54b28211dbe8bb244b7ef4"

RPROVIDES:${PN} += "gr-funcube"

RDEPENDS:${PN} += ""

inherit rpm
