SUMMARY = "Read and write numerical arrays"
DESCRIPTION = "Library for compressed numerical arrays that support high \
throughput read and write random access. \
 \
This subpackage contains the implementation as a shared library."
LICENSE = "BSD-3-Clause"

PV = "1.0.1"

RPM_NAME = "libzfp1-1.0.1-1.12.aarch64.rpm"
RPM_HASH = "aab374963a72ba838a5ddb42360465b0df5e5aef3b490580fec89affcbab3d092daefe5614a82514b82f5db4e5da40004a60a67cd05f1554ba151bbfd74e5636"

RPROVIDES:${PN} += "libzfp.so.1 \
libzfp1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgomp.so.1 \
libm.so.6"

inherit rpm
