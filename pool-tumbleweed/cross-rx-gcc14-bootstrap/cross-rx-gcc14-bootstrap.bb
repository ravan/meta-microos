SUMMARY = "The GNU Compiler Collection targeting rx"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting rx. \
 \
 \
 \
 \
 \
This is a package that is necessary for bootstrapping another package \
only, it is not intended for any other use."
LICENSE = "GPL-3.0-or-later"

PV = "14.4.0+git12698"

RPM_NAME = "cross-rx-gcc14-bootstrap-14.4.0+git12698-1.3.aarch64.rpm"
RPM_HASH = "8a4ae1892aa9b91b7ef29f1067262624524fb79efcea66338eae03a24f6f1edd61a8382c59f5dcc7d71c262fc20c8cf2bbadf9772d66d3a4630e5670ec5c9822"

RPROVIDES:${PN} += "cross-rx-gcc14-bootstrap \
rx-elf-gcc"

RDEPENDS:${PN} += "cross-rx-binutils \
libc.so.6 \
libgmp.so.10 \
libisl.so.23 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1 \
libzstd.so.1"

inherit rpm
