SUMMARY = "C++ wrapper for the libmodbus library"
DESCRIPTION = "A C++ wrapper for the libmodbus library, to send/receive data \
with a device which respects the Modbus protocol. This library \
can use a serial port or an Ethernet connection."
LICENSE = "LGPL-3.0-or-later"

PV = "0.2.3"

RPM_NAME = "libmodbuspp1_0-0-0.2.3-1.21.aarch64.rpm"
RPM_HASH = "7be24a751cb72b618df5da9202795233fd4f299c8a5d13cf0d858bda0144ae99fa230a896e8006d1a48256585e067e6c1d5b60bc247e494d1e0fa82a994246a8"

RPROVIDES:${PN} += "libmodbuspp.so.1.0-0 \
libmodbuspp1-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
