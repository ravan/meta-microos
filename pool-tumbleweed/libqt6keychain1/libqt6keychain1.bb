SUMMARY = "Qt 6 keychain library"
DESCRIPTION = "The Qt 6 keychain library."
LICENSE = "BSD-2-Clause"

PV = "0.17.0"

RPM_NAME = "libqt6keychain1-0.17.0-1.1.aarch64.rpm"
RPM_HASH = "24f438b0f2bdefed083faf8d560be096cb8aced3e46df2c0b159e69f312b2bf8745860108c561a6d9c4fb5ad2660368087b868a6c1560025b8814c7c749c54c9"

RPROVIDES:${PN} += "libqt6keychain.so.1 \
libqt6keychain1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libstdc++.so.6"

inherit rpm
