SUMMARY = "The GNU Compiler Collection targeting s390x"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting s390x."
LICENSE = "GPL-3.0-or-later"

PV = "13.5.0+git10516"

RPM_NAME = "cross-s390x-gcc13-13.5.0+git10516-1.1.aarch64.rpm"
RPM_HASH = "9d268d5e74cb070500a983b7293a982d1894f8af371008a0b1aa573cbe2ba22d4eaaa450f29875d9ade4776d30ee15ee8eed2ea3c44783a1e9eb670144ed44b8"

RPROVIDES:${PN} += "cross-s390x-gcc13 \
s390x-suse-linux-gcc"

RDEPENDS:${PN} += "cross-s390x-binutils \
cross-s390x-glibc-devel \
libc.so.6 \
libgmp.so.10 \
libisl.so.23 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libstdc++6-devel-gcc13 \
libz.so.1 \
libzstd.so.1"

inherit rpm
