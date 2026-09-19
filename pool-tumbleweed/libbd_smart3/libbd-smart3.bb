SUMMARY = "The smart plugin for the LibBlockDev library"
DESCRIPTION = "The libblockdev library plugin (and in the same time a standalone library) \
providing S.M.A.R.T. monitoring and testing functionality, based \
on libatasmart."
LICENSE = "LGPL-2.1-only"

PV = "3.5.0"

RPM_NAME = "libbd_smart3-3.5.0-1.4.aarch64.rpm"
RPM_HASH = "f0d395d88206511b7eb7b765914699e67eee3d59e2df35e36ea354492938fabb6e3d3b8f6a9ff2a1171048e54c05bb38b400cac63ade849ce79c15771bcf0f4c"

RPROVIDES:${PN} += "libbd-smart.so.3 \
libbd-smart3 \
libblockdev-smart"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libatasmart.so.4 \
libbd-utils.so.3 \
libbd-utils3 \
libc.so.6 \
libglib-2.0.so.0 \
util-linux"

inherit rpm
