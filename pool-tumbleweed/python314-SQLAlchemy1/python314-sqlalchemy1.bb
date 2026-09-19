SUMMARY = "Database Abstraction Library"
DESCRIPTION = "SQLAlchemy is an Object Relational Mappper (ORM) that provides a flexible, \
high-level interface to SQL databases.  Database and domain concepts are \
decoupled, allowing both sides maximum flexibility and power. SQLAlchemy \
provides a powerful mapping layer that can work as automatically or as manually \
as you choose, determining relationships based on foreign keys or letting you \
define the join conditions explicitly, to bridge the gap between database and \
domain."
LICENSE = "MIT"

PV = "1.4.54"

RPM_NAME = "python314-SQLAlchemy1-1.4.54-3.7.aarch64.rpm"
RPM_HASH = "b6fa9adb1c78762f6acf534c63bae506dd50722652a2a04e5fa1eab825652be44a82a244eb0be550e802b8bca9d6c4570db7d1d5543cfebb3bef71f54e958076"

RPROVIDES:${PN} += "python3.14dist-sqlalchemy \
python314-SQLAlchemy \
python314-SQLAlchemy1 \
python314-sqlalchemy \
python3dist-sqlalchemy"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python314 \
python314-greenlet"

inherit rpm
