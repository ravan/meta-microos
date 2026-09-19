SUMMARY = "The GNU Compiler Collection targeting s390x"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting s390x."
LICENSE = "GPL-3.0-or-later"

PV = "16.2.0+git9497"

RPM_NAME = "cross-s390x-gcc16-16.2.0+git9497-3.1.aarch64.rpm"
RPM_HASH = "caae428bd50ee509a883d39b06931a2c5fcb509a3be94bd9f089cddc3eff3d4b3a041cec7dffdad630722eadee73be0ceeaa2d5a9cb24d1a370637fb21fe52c3"

RPROVIDES:${PN} += "cross-s390x-gcc16 \
s390x-suse-linux-gcc"

RDEPENDS:${PN} += "cross-s390x-binutils \
cross-s390x-glibc-devel \
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
