SUMMARY = "The GNU Compiler Collection targeting hppa"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting hppa."
LICENSE = "GPL-3.0-or-later"

PV = "15.3.0+git11272"

RPM_NAME = "cross-hppa-gcc15-15.3.0+git11272-1.3.aarch64.rpm"
RPM_HASH = "9ee8bcc11ae94142a5ec8df23c3308664fd4c674c522b2853e875580ac892a478368f17620e3ca9b489cc4cb108bb6bebd04dc4fa33e26b432c814b1c8bc29c4"

RPROVIDES:${PN} += "cross-hppa-gcc15 \
hppa-suse-linux-gcc"

RDEPENDS:${PN} += "cross-hppa-binutils \
cross-hppa-glibc-devel \
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
