SUMMARY = "RPi ISP helper library"
DESCRIPTION = "A helper library to generate run-time configuration for the Raspberry Pi \
ISP (PiSP), consisting of the Frontend and Backend hardware components."
LICENSE = "BSD-2-Clause"

PV = "1.7.0"

RPM_NAME = "libpisp1-1.7.0-1.1.aarch64.rpm"
RPM_HASH = "af1ea2d82e5e4fd03229ef53cf5a1d506a889e7b21f6f0d3de0fceef1d7ceffb1b1bcffa352fd46fb78077927c9bcd8d9136463ebaf08aef40ea8836dad72185"

RPROVIDES:${PN} += "libpisp.so.1 \
libpisp1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libboost-log.so.1.91.0 \
libboost-thread.so.1.91.0 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
