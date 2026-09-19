SUMMARY = "The GNU Compiler Collection targeting s390x"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting s390x. \
 \
 \
 \
 \
 \
This is a package that is necessary for bootstrapping another package \
only, it is not intended for any other use."
LICENSE = "GPL-3.0-or-later"

PV = "13.5.0+git10516"

RPM_NAME = "cross-s390x-gcc13-bootstrap-13.5.0+git10516-1.1.aarch64.rpm"
RPM_HASH = "ad15ba10fb044fe91a6c72871c41115d8225cac3ec5562442d0e5ccfbb7f15c89c04bd1901714be216461fea07aa84fa1c43bfa221daf80acd819e66a57abbe6"

RPROVIDES:${PN} += "cross-s390x-gcc13-bootstrap \
s390x-suse-linux-gcc"

RDEPENDS:${PN} += "cross-s390x-binutils \
libc.so.6 \
libgmp.so.10 \
libisl.so.23 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1 \
libzstd.so.1"

inherit rpm
