SUMMARY = "Slurm SQL support"
DESCRIPTION = "Contains interfaces to MySQL for use by SLURM."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "25.11.2"

RPM_NAME = "slurm-sql-25.11.2-1.6.aarch64.rpm"
RPM_HASH = "7b6ea5d65afe2716dd90a832c29f23bfb4a4ca69dd9e2ae700a78311987e8047ce8db470bec55d033cbcee9301efa436ba608fe2ae40d070e97a912567e8d865"

RPROVIDES:${PN} += "slurm-sql"

RDEPENDS:${PN} += "libc.so.6 \
libmariadb.so.3"

inherit rpm
