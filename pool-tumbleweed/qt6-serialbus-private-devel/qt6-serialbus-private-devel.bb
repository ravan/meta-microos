SUMMARY = "Non-ABI stable API for the Qt 6 SerialBus library"
DESCRIPTION = "This package provides private headers of libQt6SerialBus that do not have any \
ABI or API guarantees."
LICENSE = "GPL-2.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-serialbus-private-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "efc76c7df11de65c4c94f83e39d5e4f6343bf815769e1bab7f345db14a7d39400243ecfa67a9f6fb3d754727975a5dae2a1675b473102a7f1a1777efc25d7be1"

RPROVIDES:${PN} += "cmake-Qt6SerialBusPrivate \
qt6-serialbus-private-devel"

RDEPENDS:${PN} += "cmake-Qt6CorePrivate \
cmake-Qt6Network \
cmake-Qt6SerialBus \
cmake-Qt6SerialPort"

inherit rpm
