SUMMARY = "TSS (TCG Software Stack) access daemon for a TPM chip"
DESCRIPTION = "The trousers package provides a TSS implementation through the help of \
a user-space daemon, the tcsd, and a library  Trousers aims to be \
compliant to the 1.1b and 1.2 TSS specifications as available from the \
Trusted Computing website https://www.trustedcomputinggroup.org/. \
 \
The package needs the /dev/tpm device file to be present on your \
system. It is a character device file major 10 minor 224, 0600 tss:tss."
LICENSE = "BSD-3-Clause"

PV = "0.3.15"

RPM_NAME = "libtspi1-0.3.15-9.4.aarch64.rpm"
RPM_HASH = "b0f7edbcb39d46b21836a22cc62bf858c25366cb2b548c6d24b38edd3f6286f8d3db49d1a6dcd5e3b6d9c25ac55445125f2b1bd065334b3c425f309406a1753c"

RPROVIDES:${PN} += "libtspi.so.1 \
libtspi1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
trousers"

inherit rpm
