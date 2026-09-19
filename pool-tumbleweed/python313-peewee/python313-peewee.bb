SUMMARY = "An expressive ORM that supports multiple SQL backends"
DESCRIPTION = "An expressive ORM that supports PostgreSQL, MySQL and SQLite."
LICENSE = "MIT"

PV = "4.0.6"

RPM_NAME = "python313-peewee-4.0.6-1.3.aarch64.rpm"
RPM_HASH = "a3a11263716847a514170c97c95c8624c2767873b533b7d03d5bdb9fae89f421f411a2bceff77df2eecc5d2140703e09efa08c1132f7cd18ecc82270b53a8244"

RPROVIDES:${PN} += "python3-peewee \
python3.13dist-peewee \
python313-peewee \
python3dist-peewee"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
