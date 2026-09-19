SUMMARY = "Development files for libqt6keychain"
DESCRIPTION = "This package contains development files for using the Qt6 keychain API."
LICENSE = "BSD-2-Clause"

PV = "0.17.0"

RPM_NAME = "qtkeychain-qt6-devel-0.17.0-1.1.aarch64.rpm"
RPM_HASH = "e2374c57c5dea900a90e9487ac076c0d6e35e8bf9ee20d08cbbf49fef45f797be0f58c6b66a178ff9cc6bbe2e4ccbbafc15ac6c7c4f7746c8415aae542a131db"

RPROVIDES:${PN} += "cmake-Qt6Keychain \
qtkeychain-qt6-devel"

RDEPENDS:${PN} += "cmake-Qt6Core \
cmake-Qt6DBus \
libqt6keychain1"

inherit rpm
