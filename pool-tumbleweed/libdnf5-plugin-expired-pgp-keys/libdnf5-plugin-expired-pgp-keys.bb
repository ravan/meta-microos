SUMMARY = "Libdnf5 plugin for detecting and removing expired PGP keys"
DESCRIPTION = "Libdnf5 plugin for detecting and removing expired PGP keys."
LICENSE = "LGPL-2.1-or-later"

PV = "5.4.2.1"

RPM_NAME = "libdnf5-plugin-expired-pgp-keys-5.4.2.1-1.3.aarch64.rpm"
RPM_HASH = "8aaaa232bd2e5c0aab3f8a803c3688c04d3b63468971193cf5f0a7bda12a5f339401f694bdb18af11fca69be4a7a1e2b700bd0ad46b6072571ed8616eb7e57d2"

RPROVIDES:${PN} += "config-libdnf5-plugin-expired-pgp-keys \
libdnf5-plugin-expired-pgp-keys"

RDEPENDS:${PN} += "gpg2 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdnf5-2 \
libdnf5.so.2 \
libfmt.so.12 \
libgcc-s.so.1 \
librpm.so.10 \
libstdc++.so.6"

inherit rpm
