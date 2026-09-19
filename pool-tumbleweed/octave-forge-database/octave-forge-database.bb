SUMMARY = "Octave plugin interfacing PostgreSQL"
DESCRIPTION = "Interface to PostgreSQL databases. \
This is part of Octave-Forge project."
LICENSE = "GPL-3.0-or-later"

PV = "2.4.4"

RPM_NAME = "octave-forge-database-2.4.4-4.7.aarch64.rpm"
RPM_HASH = "3ee107ac1dee63a6b318b7288a0dcec8578a2f4dfe7462a63ab6055009cec743cae4d20bb3da5eb8eaba5e940f335962684a316ae16b374b97e875dc9737e263"

RPROVIDES:${PN} += "octave-forge-database"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libpq.so.5 \
libstdc++.so.6 \
octave-api-v61 \
octave-cli \
octave-forge-struct"

inherit rpm
