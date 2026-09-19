SUMMARY = "An expressive ORM that supports multiple SQL backends"
DESCRIPTION = "An expressive ORM that supports PostgreSQL, MySQL and SQLite."
LICENSE = "MIT"

PV = "4.0.6"

RPM_NAME = "python314-peewee-4.0.6-1.3.aarch64.rpm"
RPM_HASH = "556e50e79b79fbc0e0a86e35e9e365cca8ce639ae4c8a1588aedc0d52705c662532628071abfee08a6e477c31222dfe7e4cfb83d4611f21c5416e0664c0f0daa"

RPROVIDES:${PN} += "python3.14dist-peewee \
python314-peewee \
python3dist-peewee"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
