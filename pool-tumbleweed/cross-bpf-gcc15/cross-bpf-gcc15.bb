SUMMARY = "The GNU Compiler Collection targeting bpf"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting bpf."
LICENSE = "GPL-3.0-or-later"

PV = "15.3.0+git11272"

RPM_NAME = "cross-bpf-gcc15-15.3.0+git11272-1.3.aarch64.rpm"
RPM_HASH = "576bec3ccce355ae8ac3f08a12c9e2ce1c6f758ac3ddabb9088ad1b5dbbd5b96ef35938edd9a108417636491a15adbe4d0f4bcd248f4df8127a52def423c546a"

RPROVIDES:${PN} += "bpf-none-gcc \
cross-bpf-gcc15"

RDEPENDS:${PN} += "cross-bpf-binutils \
libc.so.6 \
libgmp.so.10 \
libisl.so.23 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1 \
libzstd.so.1"

inherit rpm
