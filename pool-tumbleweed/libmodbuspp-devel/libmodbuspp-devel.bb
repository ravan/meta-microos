SUMMARY = "Development files for the libmodbuspp library"
DESCRIPTION = "A C++ wrapper for the libmodbus library, to send/receive data \
with a device which respects the Modbus protocol. This library \
can use a serial port or an Ethernet connection. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libmodbuspp."
LICENSE = "LGPL-3.0-or-later"

PV = "0.2.3"

RPM_NAME = "libmodbuspp-devel-0.2.3-1.21.aarch64.rpm"
RPM_HASH = "b32174dc04dde1b3bd5b0cb073302fd018cbe542614ad23086569579edceb0ab50f0927d6da1af273acf0413f32500cc24787a4d7df877e63baa49875ddb09ec"

RPROVIDES:${PN} += "libmodbuspp-devel \
pkgconfig-libmodbuspp"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmodbuspp1-0-0"

inherit rpm
