SUMMARY = "The GNU Compiler Collection targeting s390x"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting s390x."
LICENSE = "GPL-3.0-or-later"

PV = "14.4.0+git12698"

RPM_NAME = "cross-s390x-gcc14-14.4.0+git12698-1.3.aarch64.rpm"
RPM_HASH = "7c7c3edbb9cdca3f38e1f6b98532d85f78367d41d0aa2e2276d9f42bf7abe33bf363f038c64eabf43eb88c3811f2e3553aaef909084da2edba7d98f3cd4ab20e"

RPROVIDES:${PN} += "cross-s390x-gcc14 \
s390x-suse-linux-gcc"

RDEPENDS:${PN} += "cross-s390x-binutils \
cross-s390x-glibc-devel \
libc.so.6 \
libgmp.so.10 \
libisl.so.23 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libstdc++6-devel-gcc14 \
libz.so.1 \
libzstd.so.1"

inherit rpm
