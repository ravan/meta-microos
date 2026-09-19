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

PV = "15.3.0+git11272"

RPM_NAME = "cross-hppa-gcc15-bootstrap-15.3.0+git11272-1.3.aarch64.rpm"
RPM_HASH = "3dc92063bde20ae24209dc2c91e5bf506661e8251ed5a07b8fe9a6a5b5fd91ab4eade768d82bcf4d779dea0bcd5532bd8f2c749765c5f6718cceec7c4a4232e2"

RPROVIDES:${PN} += "cross-hppa-gcc15-bootstrap \
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
