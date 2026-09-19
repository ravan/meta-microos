SUMMARY = "The GNU Compiler Collection targeting hppa"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting hppa. \
 \
 \
 \
 \
 \
This is a package that is necessary for bootstrapping another package \
only, it is not intended for any other use."
LICENSE = "GPL-3.0-or-later"

PV = "13.5.0+git10516"

RPM_NAME = "cross-hppa-gcc13-bootstrap-13.5.0+git10516-1.1.aarch64.rpm"
RPM_HASH = "9fe7be6598ed8e7e5dbc3474b4b02f864ff81741a333d0783b06266e49180d8450fdcb09045a07d700206bfed31fd2b4be1716f93c1b353601c82e3e85c08ca8"

RPROVIDES:${PN} += "cross-hppa-gcc13-bootstrap \
hppa-suse-linux-gcc"

RDEPENDS:${PN} += "cross-hppa-binutils \
libc.so.6 \
libgmp.so.10 \
libisl.so.23 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1 \
libzstd.so.1"

inherit rpm
