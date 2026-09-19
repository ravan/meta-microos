SUMMARY = "Qt 6 SerialBus library"
DESCRIPTION = "The Qt SerialBus API provides classes and functions to access the \
various industrial serial buses and protocols, such as CAN, ModBus, \
and others."
LICENSE = "GPL-2.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "libQt6SerialBus6-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "17ca67af39f335cf30c8bb673a4e5a8740896f215322bd4d3a65f26c5b8ddde1cbbffc948609a15be512244d435bb1f117f4011d3f6a0d73c7f16eaf853b7696"

RPROVIDES:${PN} += "libQt6SerialBus.so.6 \
libQt6SerialBus6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Network.so.6 \
libQt6SerialPort.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
