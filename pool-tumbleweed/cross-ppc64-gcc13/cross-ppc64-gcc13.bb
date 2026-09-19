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

PV = "13.5.0+git10516"

RPM_NAME = "cross-ppc64-gcc13-13.5.0+git10516-1.1.aarch64.rpm"
RPM_HASH = "23a2b4b9ddc4b69ec82d7227c9950ba36a170dd81cd1512cc8a2437038ddb4bec2ab3c073d642c72bf6a77e973215050cee44f70df6e9f117490bc9ec2b09fc2"

RPROVIDES:${PN} += "cross-ppc64-gcc13 \
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
