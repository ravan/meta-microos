SUMMARY = "Test utilities for iSCSI"
DESCRIPTION = "A comprehensive iSCSI transport and SCSI block device test suite based on \
CUnit."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "1.20.3"

RPM_NAME = "libiscsi-test-1.20.3-1.3.aarch64.rpm"
RPM_HASH = "4fecedbb1c3a7aeb6cf03b9f1852a18152ee7849a8d424dbe8dc227369f7b3ece6668e53869eac2ec59c210cdaeab76d27a9a64d2c238ba78b36e871e0ae3f19"

RPROVIDES:${PN} += "libiscsi-test"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcunit.so.1 \
libgcrypt.so.20 \
libibverbs.so.1 \
librdmacm.so.1"

inherit rpm
