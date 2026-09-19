SUMMARY = "The GNU compiler collection OpenMP runtime library"
DESCRIPTION = "This is the OpenMP runtime library needed by OpenMP enabled programs \
that were built with the -fopenmp compiler option and by programs that \
were auto-parallelized via the -ftree-parallelize-loops compiler \
option."
LICENSE = "GPL-3.0-or-later-with-GCC-exception-3.1"

PV = "16.2.0+git9497"

RPM_NAME = "libgomp1-16.2.0+git9497-3.1.aarch64.rpm"
RPM_HASH = "ad7bc2dc1a0ca7934087292b03c3178ae34060541beab1b195026a3026f7676f47ea8d04a2f3be2327b57f0101b867293a280f2627ea2b352dc48705534a5f7b"

RPROVIDES:${PN} += "libgomp.so.1 \
libgomp1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
