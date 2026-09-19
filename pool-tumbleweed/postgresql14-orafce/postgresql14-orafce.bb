SUMMARY = "Implementation of some Oracle functions into PostgreSQL"
DESCRIPTION = "The goal of this project is implementation some functions from Oracle database. \
Some date functions (next_day, last_day, trunc, round, ...) are implemented \
now. Functionality was verified on Oracle 10g and module is useful \
for production work."
LICENSE = "MIT"

PV = "4.16.2+git0.6a3cfa5"

RPM_NAME = "postgresql14-orafce-4.16.2+git0.6a3cfa5-2.5.aarch64.rpm"
RPM_HASH = "518adba16061b79c40ff6a17e91f23d40a21a21a7fffffd8ee67615c887e77b137fc2382b048d68d31b821d3869c91225332941cc804d7b8e07c15a808a5ed85"

RPROVIDES:${PN} += "orafce \
postgresql14-orafce"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
postgresql14-server"

inherit rpm
