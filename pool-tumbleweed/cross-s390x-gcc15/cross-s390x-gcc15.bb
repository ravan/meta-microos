SUMMARY = "The GNU Compiler Collection targeting s390x"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting s390x."
LICENSE = "GPL-3.0-or-later"

PV = "15.3.0+git11272"

RPM_NAME = "cross-s390x-gcc15-15.3.0+git11272-1.3.aarch64.rpm"
RPM_HASH = "bcef7aa8a6e4d4c898aa7654c876d781dbad165402a82ffbb5e9fa8ef8f7198726dc42d9cdf359c43e8fbd7b7249658cebd76fcc8c4acc5f817cd956663f3302"

RPROVIDES:${PN} += "cross-s390x-gcc15 \
s390x-suse-linux-gcc"

RDEPENDS:${PN} += "cross-s390x-binutils \
cross-s390x-glibc-devel \
libc.so.6 \
libgmp.so.10 \
libisl.so.23 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libstdc++6-devel-gcc15 \
libz.so.1 \
libzstd.so.1"

inherit rpm
