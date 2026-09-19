SUMMARY = "Kea DHCP server crypto abstraction layer library"
DESCRIPTION = "The Kea cryptolink library is an abstraction layer for crypto \
library backends (such as Botan, OpenSSL)."
LICENSE = "MPL-2.0"

PV = "3.2.0"

RPM_NAME = "libkea-cryptolink76-3.2.0-1.2.aarch64.rpm"
RPM_HASH = "740f42f0677df3cc2bb36cf5cd23516d80242792e3f8dbdd0482ff9ca8068d8139d980650b41b32c0c333aade637cdddbf6cf95bc86a5a7c9222bc76eb6f6630"

RPROVIDES:${PN} += "libkea-cryptolink.so.76 \
libkea-cryptolink76"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libkea-exceptions.so.55 \
libstdc++.so.6"

inherit rpm
