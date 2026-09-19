SUMMARY = "The GNU Compiler Collection targeting hppa"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting hppa."
LICENSE = "GPL-3.0-or-later"

PV = "14.4.0+git12698"

RPM_NAME = "cross-hppa-gcc14-14.4.0+git12698-1.3.aarch64.rpm"
RPM_HASH = "51029238e79e145af2e0193626e6e1df7298777aa5afa8a315890c28ed7a3f9c2b81a584a842d0dc0df298e21cb297e3810e22fe2d2532ad6d9823f8d8450403"

RPROVIDES:${PN} += "cross-hppa-gcc14 \
hppa-suse-linux-gcc"

RDEPENDS:${PN} += "cross-hppa-binutils \
cross-hppa-glibc-devel \
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
