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

RPM_NAME = "python314-SQLAlchemy-2.0.51-1.3.aarch64.rpm"
RPM_HASH = "8cd19a936dc802115e0c45cc88026c74cfba377f52a85591f9e7a0d10aabc4bdc7f4b60f0e77519b17ef2c1dfe41a9d14cb1f9b8cdd5e7855a4ad6f082fa425a"

RPROVIDES:${PN} += "python3.14dist-sqlalchemy \
python314-SQLAlchemy \
python314-sqlalchemy \
python3dist-sqlalchemy"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python314 \
python314-greenlet \
python314-typing-extensions"

inherit rpm
