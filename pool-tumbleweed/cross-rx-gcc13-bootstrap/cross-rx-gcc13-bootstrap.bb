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

PV = "13.5.0+git10516"

RPM_NAME = "cross-rx-gcc13-bootstrap-13.5.0+git10516-1.1.aarch64.rpm"
RPM_HASH = "d36e19f374a154a3f34e97eb79c3fec37a59fb3f8fb4b33453b8e00cdfe4c2d7dfb69b196b179c99265b99025827b152c246431eae4ef435f8cbfa09647a2ce9"

RPROVIDES:${PN} += "cross-rx-gcc13-bootstrap \
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
