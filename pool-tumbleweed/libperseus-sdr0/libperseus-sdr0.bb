SUMMARY = "Library for Perseus SDR"
DESCRIPTION = "Perseus Software Defined Radio Control Library."
LICENSE = "GPL-3.0-only"

PV = "0.8.2"

RPM_NAME = "libperseus-sdr0-0.8.2-1.1.aarch64.rpm"
RPM_HASH = "ccba21077e91d5b41ddaf1ef1bdef94158424755a6be55010b085deb045952d0ab1be993dfea8072cbd126fc3247be03905125ab13bb9da5612274bb6db225cc"

RPROVIDES:${PN} += "libperseus-sdr.so.0 \
libperseus-sdr0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libperseus-sdr-udev \
libusb-1.0.so.0"

inherit rpm
