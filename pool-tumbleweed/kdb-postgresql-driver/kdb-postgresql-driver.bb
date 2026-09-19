SUMMARY = "Database connectivity and creation framework - PostgreSQL driver"
DESCRIPTION = "This package contains the PostgreSQL driver for the Database connectivity and creation framework"
LICENSE = "LGPL-2.0-only"

PV = "3.2.0"

RPM_NAME = "kdb-postgresql-driver-3.2.0-10.7.aarch64.rpm"
RPM_HASH = "f0204a985ea17f697ae2a40a3f4f8bacb1d8b168769db8d0b437a1a14a0b0a90b77f7c672dd897de1bbc070c84f5b04e96b218fd5e3ffd824aa9b4c54ea73edd"

RPROVIDES:${PN} += "calligra-kexi-postgresql-driver \
kdb-postgresql-driver"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKDb3.so.4 \
libKF5CoreAddons.so.5 \
libQt5Core.so.5 \
libQt5Network.so.5 \
libc.so.6 \
libpq.so.5 \
libstdc++.so.6"

inherit rpm
