SUMMARY = "Python bindings for FCD and FCDpro Plus"
DESCRIPTION = "gr-funcube is an linux oot-module for gnuradio to implement a FUNcube \
Dongle and a FUNcube Dongle PRO+ source. It autodetects the correct \
soundcard from /proc/asound/cards. This idea was taken from the osmosdr \
 drivers. To control the device, the hidraw code of the HID API is used."
LICENSE = "GPL-3.0-only"

PV = "3.10.0.rc3"

RPM_NAME = "python3-gr-funcube-3.10.0.rc3-3.5.aarch64.rpm"
RPM_HASH = "64cd57e8fd25701c53facb812cc9b0730f50b1bdc3dae92c6b2fe5e30fd5ddac919d2bd22789d0b8f53c34ac3536fd914bbd9f792b483f94306b32b4c6ae28cc"

RPROVIDES:${PN} += "python3-gr-funcube"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgnuradio-funcube.so.3.10.0 \
libgnuradio-funcube3-10-0 \
libgnuradio-runtime.so.3.10.12 \
libstdc++.so.6 \
python-abi"

inherit rpm
