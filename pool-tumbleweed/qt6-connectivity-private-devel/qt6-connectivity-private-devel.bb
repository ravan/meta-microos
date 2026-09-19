SUMMARY = "Non-ABI stable API for the Qt 6 connectivity libraries"
DESCRIPTION = "This package provides private headers of qt6-connectivity that are normally \
not used by application development and that do not have any ABI or \
API guarantees. \
The packages that build against these have to require the exact Qt version."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-connectivity-private-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "4a54cebe78d5677ff78f42c5118e10f6ffa05cb725349e8c50062596081381d8b1210fa2d7fb0ce73fe4270b668f00f0dd6f41c1e9534beb75b7f3f9794a4504"

RPROVIDES:${PN} += "cmake-Qt6BluetoothPrivate \
cmake-Qt6Connectivity \
cmake-Qt6NfcPrivate \
qt6-connectivity-private-devel"

RDEPENDS:${PN} += "cmake-Qt6Bluetooth \
cmake-Qt6CorePrivate \
cmake-Qt6NetworkPrivate \
cmake-Qt6Nfc"

inherit rpm
