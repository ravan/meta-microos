SUMMARY = "SDR driver for FL2000 based USB to VGA adapters"
DESCRIPTION = "Osmo-fl2k allows to use USB 3.0 to VGA adapters based on the \
Fresco Logic FL2000 chip as general purpose DACs and SDR transmitter \
generating a continuous stream of samples by avoiding the HSYNC and \
VSYNC blanking intervals."
LICENSE = "GPL-2.0-or-later"

PV = "0.2.1+git.20250902"

RPM_NAME = "libosmo-fl2k0-0.2.1+git.20250902-1.6.aarch64.rpm"
RPM_HASH = "980c28cda7fe96d9d9767c3fce3e50ab91146cf2edf411da67f99f6bc4a28d2f1f331daa6c210584f69b0471e9b3638c3a3d06132878271abaf8d93b6c32d457"

RPROVIDES:${PN} += "libosmo-fl2k.so.0 \
libosmo-fl2k0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libusb-1.0.so.0 \
osmo-fl2k-udev"

inherit rpm
