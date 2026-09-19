SUMMARY = "The GNU Compiler Collection targeting ppc64le"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting ppc64le. \
 \
 \
 \
 \
 \
This is a package that is necessary for bootstrapping another package \
only, it is not intended for any other use."
LICENSE = "GPL-3.0-or-later"

PV = "15.3.0+git11272"

RPM_NAME = "cross-ppc64le-gcc15-bootstrap-15.3.0+git11272-1.3.aarch64.rpm"
RPM_HASH = "44708bca8ed1b061b8443a30ebbd260afa75e7ddc15849ea138c366c8ce3ecad68bac02cf9f6979fa646d356623a4ffbab8f485d34d0523342c6106afb0816da"

RPROVIDES:${PN} += "cross-ppc64le-gcc15-bootstrap \
powerpc64le-suse-linux-gcc"

RDEPENDS:${PN} += "cross-ppc64le-binutils \
libc.so.6 \
libgmp.so.10 \
libisl.so.23 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1 \
libzstd.so.1"

inherit rpm
