SUMMARY = "Non-ABI stable API for the Qt 6 SerialPort library"
DESCRIPTION = "This package provides private headers of libQt6SerialPort that do not have any \
ABI or API guarantees."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-serialport-private-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "bbcc45005de33197f86060a8b7f5c499f9efa05970988b5632b5a4af3437122263b40e9a0c8ba311a2f428c223b663afa6fe29f03cb41c97cd5a9d3b6ee74b15"

RPROVIDES:${PN} += "cmake-Qt6SerialPortPrivate \
qt6-serialport-private-devel"

RDEPENDS:${PN} += "cmake-Qt6CorePrivate \
cmake-Qt6SerialPort"

inherit rpm
