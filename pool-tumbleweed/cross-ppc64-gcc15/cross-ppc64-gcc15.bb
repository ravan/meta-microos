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

PV = "15.3.0+git11272"

RPM_NAME = "cross-ppc64-gcc15-15.3.0+git11272-1.3.aarch64.rpm"
RPM_HASH = "bb91f46c08912fc7c143781517b1400820ad54ba3e2f1aeccc23f3e96deda3045f3640f3d751e98c056032942035ddba97657f945b863f3471e3f3b1825d7fbe"

RPROVIDES:${PN} += "cross-ppc64-gcc15 \
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
