SUMMARY = "Bare metal interaction APIs"
DESCRIPTION = "Libmetal provides common user APIs to access devices, handle device interrupts \
and request memory across the following operating environments: \
  * Linux user space (based on UIO and VFIO support in the kernel) \
  * RTOS (with and without virtual memory) \
  * Bare-metal environments"
LICENSE = "BSD-3-Clause"

PV = "2025.04.0"

RPM_NAME = "libmetal1-2025.04.0-1.5.aarch64.rpm"
RPM_HASH = "049105fb19b7ae45bf6f4dd06e2ccea7909f7854dc08047aac158eabc091ed17b31c2326aabc8a5a80ef5718d631cbf0d177c2673bfefb8ae3f4efd122ab19a3"

RPROVIDES:${PN} += "libmetal \
libmetal.so.1 \
libmetal1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libhugetlbfs.so \
libsysfs.so.2"

inherit rpm
