SUMMARY = "Ftdi LIRC User-Space Driver"
DESCRIPTION = "LIRC user-space driver which works together with the kernel, providing \
full support for the ftdi device."
LICENSE = "GPL-2.0-or-later"

PV = "0.10.2"

RPM_NAME = "lirc-drv-ftdi-0.10.2-2.5.aarch64.rpm"
RPM_HASH = "555fa89c0fc6e58e764a70c197822d69cf55ad82d762ddf4af068d751f083a0ee887cc44606d633b2601bdb0bc5bae37b6f0e61095ec47e2497378f4eeb847d8"

RPROVIDES:${PN} += "lirc-drv-ftdi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libftdi1.so.2 \
liblirc-driver.so.0 \
liblirc.so.0 \
libusb-1.0.so.0 \
lirc-core"

inherit rpm
