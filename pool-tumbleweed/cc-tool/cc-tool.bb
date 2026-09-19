SUMMARY = "Programmer for Texas Instruments 8051-based System-On-Chip devices"
DESCRIPTION = "cc-tool provides support for Texas Instruments CC Debugger for Linux in order \
to program 8051-based System-On-Chip devices: CC254x CC253x CC243x CC251x CC111x."
LICENSE = "GPL-2.0-only"

PV = "0.27"

RPM_NAME = "cc-tool-0.27-2.7.aarch64.rpm"
RPM_HASH = "d36888f04b7b069bdf6ebbe58489f6ec68bca057a622ae0c7bd0d944daec7a0a62370948d0aca9e9e84ead04b630809dc8f92173eb6dfba995233077b50a8201"

RPROVIDES:${PN} += "cc-tool"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libboost-filesystem.so.1.91.0 \
libboost-program-options.so.1.91.0 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libusb-1.0.so.0"

inherit rpm
