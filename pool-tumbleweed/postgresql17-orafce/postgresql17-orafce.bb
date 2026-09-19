SUMMARY = "Implementation of some Oracle functions into PostgreSQL"
DESCRIPTION = "The goal of this project is implementation some functions from Oracle database. \
Some date functions (next_day, last_day, trunc, round, ...) are implemented \
now. Functionality was verified on Oracle 10g and module is useful \
for production work."
LICENSE = "MIT"

PV = "4.16.2+git0.6a3cfa5"

RPM_NAME = "postgresql17-orafce-4.16.2+git0.6a3cfa5-2.5.aarch64.rpm"
RPM_HASH = "a16795cd5ed2c6da9a8658ac27b27b95f4cfa06be4b1c0866aec699c6b60f36d75d71f8476109c96daca55812c9210494ddc76fec0077821e1420ffcefa893c1"

RPROVIDES:${PN} += "orafce \
postgresql17-orafce"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
postgresql17-server"

inherit rpm
