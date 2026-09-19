SUMMARY = "Application turning the RTL2832 dongle into a 433.92MHz generic data receiver"
DESCRIPTION = "An application using librtlsdr to decode the temperature from \
wireless temperature sensors (433.92MHz)"
LICENSE = "GPL-2.0-only"

PV = "25.12"

RPM_NAME = "rtl_433-25.12-1.5.aarch64.rpm"
RPM_HASH = "413511b0c1e04cb346017af570c750cd2dbee218874b86381d43d58024d7395cd9274d75b48847952b0a7282bdd47897761eb708d28ee2e5dc5a0eb53248e858"

RPROVIDES:${PN} += "config-rtl-433 \
rtl-433"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSoapySDR.so.0.8-3 \
libc.so.6 \
libcrypto.so.3 \
libm.so.6 \
librtlsdr.so.0 \
libssl.so.3 \
libusb-1.0.so.0"

inherit rpm
