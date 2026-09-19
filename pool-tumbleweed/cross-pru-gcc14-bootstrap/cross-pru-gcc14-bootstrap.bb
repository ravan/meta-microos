SUMMARY = "The GNU Compiler Collection targeting pru"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting pru. \
 \
 \
 \
 \
 \
This is a package that is necessary for bootstrapping another package \
only, it is not intended for any other use."
LICENSE = "GPL-3.0-or-later"

PV = "14.4.0+git12698"

RPM_NAME = "cross-pru-gcc14-bootstrap-14.4.0+git12698-1.3.aarch64.rpm"
RPM_HASH = "de5db2ca248c5316e01275f44f845874b55727ef0534021433af39fb40408bba1c09fc499544573b999bf3453d22316583ddf0bc964a1b5b52e2582065783bb6"

RPROVIDES:${PN} += "cross-pru-gcc14-bootstrap \
pru-gcc"

RDEPENDS:${PN} += "cross-pru-binutils \
libc.so.6 \
libgmp.so.10 \
libisl.so.23 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1 \
libzstd.so.1"

inherit rpm
