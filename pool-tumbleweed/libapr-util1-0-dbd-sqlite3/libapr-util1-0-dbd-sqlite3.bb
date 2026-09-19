SUMMARY = "DBD driver for SQLite 3"
DESCRIPTION = "DBD driver for SQLite 3 database."
LICENSE = "Apache-2.0"

PV = "1.6.5"

RPM_NAME = "libapr-util1-0-dbd-sqlite3-1.6.5-1.1.aarch64.rpm"
RPM_HASH = "2c41c3cf293dfcebbd95d88f74dbd316286155fb7fa564af84e33a49bd69b33b4b6722b3f60030253210a971bacb6c079db45dc2d421aa45dd59c8733348edc8"

RPROVIDES:${PN} += "libapr-util1-0-dbd-sqlite3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libapr-util1-0 \
libc.so.6 \
libsqlite3.so.0"

inherit rpm
