SUMMARY = "Python-PostgreSQL Database Adapter"
DESCRIPTION = "psycopg2 is a PostgreSQL database adapter for the Python programming \
language. \
 \
psycopg2 is different from the other database adapter because it was \
designed for heavily multi-threaded applications that create and destroy \
lots of cursors and make a conspicuous number of concurrent INSERTs or \
UPDATEs. psycopg2 also provide asychronous operations and support \
for coroutine libraries."
LICENSE = "LGPL-3.0-or-later & (LGPL-3.0-or-later | ZPL-2.0) & LicenseRef-SUSE-GPL-2.0-with-openssl-exception"

PV = "2.9.12"

RPM_NAME = "python313-psycopg2-2.9.12-1.3.aarch64.rpm"
RPM_HASH = "81d72a108017169487a7ff6956a015b703c8d01839b4064f1aa5d531f0df34e452718b57163af78219134349500f4f9024a166eb65dc1ae650392f4db7439136"

RPROVIDES:${PN} += "python3-psycopg2 \
python3.13dist-psycopg2 \
python313-psycopg2 \
python3dist-psycopg2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpq.so.5 \
python-abi"

inherit rpm
