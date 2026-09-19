SUMMARY = "Library to access Linux Logical Volume Manager (LVM) volume containers"
DESCRIPTION = "The libvslvm library is a library to access Linux Logical Volume \
Manager (LVM) volume containers"
LICENSE = "LGPL-3.0-or-later"

PV = "20260901"

RPM_NAME = "libvslvm1-20260901-1.1.aarch64.rpm"
RPM_HASH = "7fe68d31148bd90e5fc2b0c3946283e90200a65a180c67bcd8c09d1d30a1ac6a59e41f5e3f4f9be3ea24506c6f373a8f80fcbb4373a723cae29f601f48c1b19a"

RPROVIDES:${PN} += "libvslvm.so.1 \
libvslvm1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcdata.so.1 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libcsplit.so.1 \
libcthreads.so.1 \
libfcache.so.1 \
libfdata.so.1 \
libfvalue.so.1"

inherit rpm
