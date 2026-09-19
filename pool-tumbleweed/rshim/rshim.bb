SUMMARY = "User-space driver for Mellanox BlueField SoC"
DESCRIPTION = "This is the user-space driver to access the BlueField SoC via the rshim \
interface. It provides ways to push boot stream, debug the target or login \
via the virtual console or network interface."
LICENSE = "BSD-3-Clause | GPL-2.0-only"

PV = "2.7.3"

RPM_NAME = "rshim-2.7.3-1.2.aarch64.rpm"
RPM_HASH = "d5061b102fe6e19ea46e624d9ef0e3f36f0eaa9d69d1b13d8d4892a7346b5e595d4fe5e67fec78021c874c04121b4a84f23243d434aaa4aaeee3edf93b0fbefb"

RPROVIDES:${PN} += "config-rshim \
rshim"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
/usr/bin/python3 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfuse3.so.4 \
libpci.so.3 \
libusb-1.0.so.0"

inherit rpm
