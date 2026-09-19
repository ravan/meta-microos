SUMMARY = "Development files for the qtkeychain library"
DESCRIPTION = "qtkeychain can be used to store passwords. \
 \
This package contains development files for libqtkeychain."
LICENSE = "BSD-2-Clause"

PV = "0.17.0"

RPM_NAME = "qtkeychain-qt5-devel-0.17.0-1.1.aarch64.rpm"
RPM_HASH = "18eaf732c5aef5ee53ab6827f40e5f6df64e3c1cc0c35dff22f7141cb188d30cb98c028cef161d0dbf58b762045eee98e97933d5b1dca244c8865dcf6d456dd2"

RPROVIDES:${PN} += "cmake-Qt5Keychain \
qtkeychain-qt5-devel"

RDEPENDS:${PN} += "cmake-Qt5Core \
cmake-Qt5DBus \
libqt5keychain1"

inherit rpm
