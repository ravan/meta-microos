SUMMARY = "SDR driver for RTL2832"
DESCRIPTION = "Library to run Realtek RTL2832 based DVB dongle as a SDR receiver."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.3"

RPM_NAME = "librtlsdr0-2.0.3-1.1.aarch64.rpm"
RPM_HASH = "e6e1ef90d12a810827222db41218bb799c3a2bbc45bf1170df7cd8907c241fcf514f41dfa6c09c9f777bd81e48c219815f5e7f3eb8d160c9f42f2d39e89c74d9"

RPROVIDES:${PN} += "librtlsdr.so.0 \
librtlsdr0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libusb-1.0.so.0 \
rtl-sdr-udev"

inherit rpm
