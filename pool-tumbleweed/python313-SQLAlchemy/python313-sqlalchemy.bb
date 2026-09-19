SUMMARY = "Database Abstraction Library"
DESCRIPTION = "SQLAlchemy is an Object Relational Mappper (ORM) that provides a flexible, \
high-level interface to SQL databases.  Database and domain concepts are \
decoupled, allowing both sides maximum flexibility and power. SQLAlchemy \
provides a powerful mapping layer that can work as automatically or as manually \
as you choose, determining relationships based on foreign keys or letting you \
define the join conditions explicitly, to bridge the gap between database and \
domain."
LICENSE = "MIT"

PV = "2.0.51"

RPM_NAME = "python313-SQLAlchemy-2.0.51-1.3.aarch64.rpm"
RPM_HASH = "c8be2205825cbbadd26c3d9c69de9118761377f061fc146cadb76b0d9af890a0ee3414671f610a18783fa68cefd65c907fb08c5605eeb2acb1efe70ed6ef4f1f"

RPROVIDES:${PN} += "python3-SQLAlchemy \
python3-sqlalchemy \
python3.13dist-sqlalchemy \
python313-SQLAlchemy \
python313-sqlalchemy \
python3dist-sqlalchemy"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python313 \
python313-greenlet \
python313-typing-extensions"

inherit rpm
