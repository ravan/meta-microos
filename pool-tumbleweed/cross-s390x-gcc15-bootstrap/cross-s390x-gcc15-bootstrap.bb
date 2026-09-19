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

PV = "15.3.0+git11272"

RPM_NAME = "cross-s390x-gcc15-bootstrap-15.3.0+git11272-1.3.aarch64.rpm"
RPM_HASH = "af1cc190b45631988bdf6b459fe96122c8bda54bd3d08b90393e61e0edd17cb21aa43f850de13ca43fed2c4c43819ccb0c069c82d30851afdbe31213f11715fa"

RPROVIDES:${PN} += "cross-s390x-gcc15-bootstrap \
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
