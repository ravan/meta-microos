SUMMARY = "FCD and FCDpro Plus Linux addon for gnuradio"
DESCRIPTION = "gr-funcube is an linux oot-module for gnuradio to implement a FUNcube \
Dongle and a FUNcube Dongle PRO+ source. It autodetects the correct \
soundcard from /proc/asound/cards. This idea was taken from the osmosdr \
 drivers. To control the device, the hidraw code of the HID API is used."
LICENSE = "GPL-3.0-only"

PV = "3.10.0.rc3"

RPM_NAME = "libgnuradio-funcube3_10_0-3.10.0.rc3-3.5.aarch64.rpm"
RPM_HASH = "d1acb1a1def17644c9e6fc5f4c0fd8135b20254a809dcc7b6e9cdde328112f7b6add2a274300a378fef2b055c6a3b13a68ae33231eaacb1594a077bdcb985a8c"

RPROVIDES:${PN} += "libgnuradio-funcube.so.3.10.0 \
libgnuradio-funcube3-10-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfmt.so.12 \
libgcc-s.so.1 \
libgnuradio-audio.so.3.10.12 \
libgnuradio-blocks.so.3.10.12 \
libgnuradio-pmt.so.3.10.12 \
libgnuradio-runtime.so.3.10.12 \
libhidapi-libusb.so.0 \
libspdlog.so.1.17 \
libstdc++.so.6"

inherit rpm
