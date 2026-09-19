SUMMARY = "HPLIP printing backends and filters for CUPS"
DESCRIPTION = "This package contains filter programs and backends for the CUPS printing \
system which are necessary for printing with HP printers."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & MIT"

PV = "3.26.4"

RPM_NAME = "hplip-cups-3.26.4-2.2.aarch64.rpm"
RPM_HASH = "86a347a907fa2e92981bcf7b45581b76eebe9c0a108c1240665d15fa1ed6c3d8adeb379b2cce067ecd1e80d079a33fc4e7ee48cf5365b1d2ff035e4a0b4b4571"

RPROVIDES:${PN} += "hplip-cups"

RDEPENDS:${PN} += "/usr/bin/python3 \
cups \
hplip-common \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcups.so.2 \
libdbus-1.so.3 \
libgcc-s.so.1 \
libhpip.so.0 \
libhplip0 \
libhpmud.so.0 \
libjpeg.so.8 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
