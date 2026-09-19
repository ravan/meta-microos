SUMMARY = "PostgreSQL database adapter for Python -- C optimisation distribution"
DESCRIPTION = "PostgreSQL database adapter for Python -- C optimisation distribution"
LICENSE = "LGPL-3.0-only"

PV = "3.3.4"

RPM_NAME = "python313-psycopg-c-3.3.4-1.3.aarch64.rpm"
RPM_HASH = "9db1d7520994bb15e25b3b284e0e50078aad72f30de74f8f4adf8b031f728ad1f901d8999fdabefc62ec4b55688e094781dcc97f81028684e7c66522d81e861d"

RPROVIDES:${PN} += "python3-psycopg-c \
python3.13dist-psycopg-c \
python313-psycopg-c \
python3dist-psycopg-c"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libpq.so.5 \
python-abi"

inherit rpm
