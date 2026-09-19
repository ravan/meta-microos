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

RPM_NAME = "python313-SQLAlchemy1-1.4.54-3.7.aarch64.rpm"
RPM_HASH = "7b3d357467e85c37cca9d9d161eb0abf207e9070ed68d958cd3bf08b124f12d85b9b0dfdb78cc78643afe3c68e7b210fa76596c3e078e1e4cfc65e949d0787db"

RPROVIDES:${PN} += "python3-SQLAlchemy \
python3-SQLAlchemy1 \
python3-sqlalchemy \
python3.13dist-sqlalchemy \
python313-SQLAlchemy \
python313-SQLAlchemy1 \
python313-sqlalchemy \
python3dist-sqlalchemy"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python313 \
python313-greenlet"

inherit rpm
