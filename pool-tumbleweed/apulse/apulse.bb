SUMMARY = "PulseAudio emulation for ALSA"
DESCRIPTION = "PulseAudio emulation intended to be used with Firefox and Skype."
LICENSE = "MIT"

PV = "0.1.14"

RPM_NAME = "apulse-0.1.14-1.4.aarch64.rpm"
RPM_HASH = "1493d0f74c9f23e7a1cfebc69c0349ebe895faf06ab47a1fab3c0c603f99ee57076e1a19ae3fec83448785387cc2c6b018492f4cefda84fc433ab1835731b6d4"

RPROVIDES:${PN} += "apulse \
config-apulse"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libglib-2.0.so.0 \
libm.so.6 \
libpulse.so.0"

inherit rpm
