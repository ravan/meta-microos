SUMMARY = "OpenFabrics Alliance InfiniBand Userspace Management Datagram library"
DESCRIPTION = "libibumad provides the userspace management datagram (umad) library \
functions, which sit on top of the umad modules in the kernel. These \
are used by the IB diagnostic and management tools, including OpenSM."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "63.0"

RPM_NAME = "libibumad3-63.0-1.3.aarch64.rpm"
RPM_HASH = "b73b7b34df4823d5c41cee37bc8c2d01d42f72e3877c22726ae18f32c77c6177feb621e06f9f1ee56d1d1e49b042f08e99e5a64ea225994f85691fb83ce5f848"

RPROVIDES:${PN} += "libibumad.so.3 \
libibumad3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
