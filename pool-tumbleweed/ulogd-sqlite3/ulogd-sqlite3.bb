SUMMARY = "SQLite3 output target for ulogd"
DESCRIPTION = "SQLite3 output target for ulogd."
LICENSE = "GPL-2.0-only"

PV = "2.0.9"

RPM_NAME = "ulogd-sqlite3-2.0.9-1.6.aarch64.rpm"
RPM_HASH = "1380521d9439612000f06cd4c0ad42454affb1dccf36a3b74adc4ab0d3bce58edc06279377381df726285e201aeec18b1aba07d498f5cd6c1122468105ce20b5"

RPROVIDES:${PN} += "ulogd-sqlite3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libsqlite3.so.0 \
ulogd"

inherit rpm
