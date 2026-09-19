SUMMARY = "Implementation of the psycopg2 module using cffi"
DESCRIPTION = "This is a implementation of the psycopg2 module using cffi."
LICENSE = "LGPL-3.0-or-later"

PV = "2.9.0"

RPM_NAME = "python314-psycopg2cffi-2.9.0-4.7.aarch64.rpm"
RPM_HASH = "115a9f1799447624afd4e0acd4afcd5342a28f7abb5f9482f4abe2541a51056cc54977d83d8301889ebb8c75b0b0bb9139b524a0b7cf95bef4d5e4d07f3199d2"

RPROVIDES:${PN} += "python3.14dist-psycopg2cffi \
python314-psycopg2cffi \
python3dist-psycopg2cffi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpq.so.5 \
python-abi \
python314-cffi \
python314-six"

inherit rpm
