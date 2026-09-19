SUMMARY = "A MySQL benchmarking tool"
DESCRIPTION = "This benchmark was designed for identifying basic system parameters, as \
they are important for systems using MySQL (w Innodb) under intensive \
load."
LICENSE = "GPL-2.0-only"

PV = "1.0.20"

RPM_NAME = "sysbench-1.0.20-1.30.aarch64.rpm"
RPM_HASH = "db8406bb840876a795a636abd0a51f05b73e128c944407b687c897857fa971a3475cc4ecdd1a02a6d0a1f4a26f46a1e7e712d94007d88d46feefdeb7345c1ff7"

RPROVIDES:${PN} += "sysbench"

RDEPENDS:${PN} += "/usr/bin/env \
ld-linux-aarch64.so.1 \
libaio.so.1 \
libc.so.6 \
libluajit-5.1.so.2 \
libm.so.6 \
libmariadb.so.3 \
libpq.so.5"

inherit rpm
