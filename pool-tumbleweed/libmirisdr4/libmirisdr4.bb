SUMMARY = "SDR driver for Mirics MSi2500 based receivers"
DESCRIPTION = "Library to run a Mirics MSi2500 based DVB dongle as an SDR receiver."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.0"

RPM_NAME = "libmirisdr4-2.0.0-1.1.aarch64.rpm"
RPM_HASH = "3259099c0ddcc36488fd528a86a4288bdb3277df648b446bb7c3698942ebeb5f0f96db0f79623e625ea66e641eb54b44b765e3d940f44e5b3c1c5c328c6825c6"

RPROVIDES:${PN} += "libmirisdr \
libmirisdr.so.4 \
libmirisdr0 \
libmirisdr4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libusb-1.0.so.0 \
mirisdr-udev"

inherit rpm
