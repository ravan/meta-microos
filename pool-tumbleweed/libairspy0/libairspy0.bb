SUMMARY = "Driver for Airspy"
DESCRIPTION = "Library to run Airspy SDR receiver."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.10"

RPM_NAME = "libairspy0-1.0.10-3.5.aarch64.rpm"
RPM_HASH = "4acb22c4a00baaeb244d33fd6b7703dc23484042696310733deafd5fada209d032317b5636cb977c72f52f869739ab359add91e7ab76092a69a340a0f23a657e"

RPROVIDES:${PN} += "libairspy.so.0 \
libairspy0"

RDEPENDS:${PN} += "/sbin/ldconfig \
airspy-udev \
ld-linux-aarch64.so.1 \
libc.so.6 \
libusb-1.0.so.0"

inherit rpm
