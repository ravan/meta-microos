SUMMARY = "Implementation of the psycopg2 module using cffi"
DESCRIPTION = "This is a implementation of the psycopg2 module using cffi."
LICENSE = "LGPL-3.0-or-later"

PV = "2.9.0"

RPM_NAME = "python313-psycopg2cffi-2.9.0-4.7.aarch64.rpm"
RPM_HASH = "306d1e534763991a8c87efded40c19d680657cb8c275c92e1326de532554491a73c10a94629aefeac8c667aa6d44ad11910dd8b93f84933fd121fb1eb733c149"

RPROVIDES:${PN} += "python3-psycopg2cffi \
python3.13dist-psycopg2cffi \
python313-psycopg2cffi \
python3dist-psycopg2cffi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpq.so.5 \
python-abi \
python313-cffi \
python313-six"

inherit rpm
