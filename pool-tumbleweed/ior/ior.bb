SUMMARY = "Parallel filesystem I/O benchmark"
DESCRIPTION = "Parallel filesystem I/O benchmark"
LICENSE = "GPL-2.0-only"

PV = "4.0.0"

RPM_NAME = "ior-4.0.0-1.2.aarch64.rpm"
RPM_HASH = "a5ce45b9f2e98c4304e3e18553d8be826602f8d30518583ca204697c29c169eae52d25388a88125db1c48b005da20711c7196ca514214a219af3afa95d59f9e1"

RPROVIDES:${PN} += "ior \
mdtest"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libhdf5.so.310 \
libm.so.6 \
libmpi.so.40"

inherit rpm
