SUMMARY = "A password store library"
DESCRIPTION = "qtkeychain can be used to store passwords."
LICENSE = "BSD-2-Clause"

PV = "0.17.0"

RPM_NAME = "libqt5keychain1-0.17.0-1.1.aarch64.rpm"
RPM_HASH = "18dd889fa085e2f3979d88a46622f6ce1d7648a6861944972aef6d44e03ea7cc3fe8131901bb606cbd23dabc9d221a839dd949b9f83431b5d19be15cc8c3cc57"

RPROVIDES:${PN} += "libqt5keychain.so.1 \
libqt5keychain1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libstdc++.so.6"

inherit rpm
