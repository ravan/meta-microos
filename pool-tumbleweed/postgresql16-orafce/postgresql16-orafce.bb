SUMMARY = "Implementation of some Oracle functions into PostgreSQL"
DESCRIPTION = "The goal of this project is implementation some functions from Oracle database. \
Some date functions (next_day, last_day, trunc, round, ...) are implemented \
now. Functionality was verified on Oracle 10g and module is useful \
for production work."
LICENSE = "MIT"

PV = "4.16.2+git0.6a3cfa5"

RPM_NAME = "postgresql16-orafce-4.16.2+git0.6a3cfa5-2.5.aarch64.rpm"
RPM_HASH = "70060a74b5930ea213d9368faf613561ff06f98cc7cdc079f75f629ba753cf80525f5dc0d561df23ae219a1503ca7168f35751c56a28bf318969750ce4eef26e"

RPROVIDES:${PN} += "orafce \
postgresql16-orafce"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
postgresql16-server"

inherit rpm
