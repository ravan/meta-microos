SUMMARY = "PostgreSQL database adapter for Python -- C optimisation distribution"
DESCRIPTION = "PostgreSQL database adapter for Python -- C optimisation distribution"
LICENSE = "LGPL-3.0-only"

PV = "3.3.4"

RPM_NAME = "python314-psycopg-c-3.3.4-1.3.aarch64.rpm"
RPM_HASH = "62cc87624416cac75323d728744a6f23c8249ab89de7c7b92c3b9c03062d5c9cde2c8f32afd3e7cdb1ecb28206dee26dcaf2efd4c3e3d0e0d8d08a05099e1dd7"

RPROVIDES:${PN} += "python3.14dist-psycopg-c \
python314-psycopg-c \
python3dist-psycopg-c"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpq.so.5 \
python-abi"

inherit rpm
