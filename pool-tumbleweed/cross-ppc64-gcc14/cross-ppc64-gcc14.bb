SUMMARY = "The GNU Compiler Collection targeting ppc64"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting ppc64. \
 \
 \
 \
 \
 \
This is a package that is necessary for bootstrapping another package \
only, it is not intended for any other use."
LICENSE = "GPL-3.0-or-later"

PV = "14.4.0+git12698"

RPM_NAME = "cross-ppc64-gcc14-14.4.0+git12698-1.3.aarch64.rpm"
RPM_HASH = "af401a81d77145238ce41d46e5baebe6fb56327d23f374fa7478c91f2d4cae261e9d7976109ed224a7972445fd99a320cdf6126930ed29dba4c2c7703ed07312"

RPROVIDES:${PN} += "cross-ppc64-gcc14 \
powerpc64-suse-linux-gcc"

RDEPENDS:${PN} += "cross-ppc64-binutils \
libc.so.6 \
libgmp.so.10 \
libisl.so.23 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1 \
libzstd.so.1"

inherit rpm
