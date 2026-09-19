SUMMARY = "Implementation of some Oracle functions into PostgreSQL"
DESCRIPTION = "The goal of this project is implementation some functions from Oracle database. \
Some date functions (next_day, last_day, trunc, round, ...) are implemented \
now. Functionality was verified on Oracle 10g and module is useful \
for production work."
LICENSE = "MIT"

PV = "4.16.2+git0.6a3cfa5"

RPM_NAME = "postgresql15-orafce-4.16.2+git0.6a3cfa5-2.5.aarch64.rpm"
RPM_HASH = "4bc28f101a14a3aa432ff0d11ff10056b35effb252ae0db7bf3236a76be1e4bab139d6bfa7defe452600464fdf1d56517022678a508bc537d718f7f8be55ff16"

RPROVIDES:${PN} += "orafce \
postgresql15-orafce"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
postgresql15-server"

inherit rpm
