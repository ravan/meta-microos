SUMMARY = "The GNU Compiler Collection targeting x86_64"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting x86_64."
LICENSE = "GPL-3.0-or-later"

PV = "16.2.0+git9497"

RPM_NAME = "cross-x86_64-gcc16-16.2.0+git9497-3.1.aarch64.rpm"
RPM_HASH = "c6b49c6a42e4ee78416d49016507e21630a75dfedf7ce12f33ee0711f9c12a53d41c12b5ff206eee3cccf27ed3da9837c05b52017b9895648ff7557a1dbf028a"

RPROVIDES:${PN} += "cross-x86-64-gcc16 \
x86-64-suse-linux-gcc"

RDEPENDS:${PN} += "cross-x86-64-binutils \
cross-x86-64-glibc-devel \
libc.so.6 \
libgmp.so.10 \
libisl.so.23 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libstdc++6-devel-gcc16 \
libz.so.1 \
libzstd.so.1"

inherit rpm
