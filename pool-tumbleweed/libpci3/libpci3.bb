SUMMARY = "PCI utility library"
DESCRIPTION = "libpci offers access to the PCI configuration space."
LICENSE = "GPL-2.0-or-later"

PV = "3.14.0"

RPM_NAME = "libpci3-3.14.0-2.4.aarch64.rpm"
RPM_HASH = "1f0dfaef1e4d562eccd7c404231cc7e4ab559229cc8349bc0f242754b676d4037d3608534f3c4f785df21269101936ea3dcaeb73e2cd1c22dd981c3b09331bba"

RPROVIDES:${PN} += "libpci.so.3 \
libpci3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1"

inherit rpm
