SUMMARY = "A lightweight C library of portability wrappers and data structures"
DESCRIPTION = "Zix is a lightweight C library of portability wrappers and data structures, such as: \
Allocation \
Algorithms \
Data Structures \
Threading \
File System"
LICENSE = "ISC"

PV = "0.8.0"

RPM_NAME = "libzix-0-0-0.8.0-1.4.aarch64.rpm"
RPM_HASH = "eeedeb586e2b3ab5a4bc7f1882f2df6bb24eb4fde3b87dd7d81d03d0838a2e1ebad998e639dcb78e8824a0645bec8ceb07a7cb9f800fa44e987a88a90d80bbe6"

RPROVIDES:${PN} += "libzix-0-0 \
libzix-0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
