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

PV = "15.3.0+git11272"

RPM_NAME = "cross-rx-gcc15-bootstrap-15.3.0+git11272-1.3.aarch64.rpm"
RPM_HASH = "11eefdab81558cee4fe4abec9062356ac7ac854b7b2913517eded893f41af9a11ade274b9a6f2c0747cf58c294f484d2666d91ee70988d15c0626babfef1a718"

RPROVIDES:${PN} += "cross-rx-gcc15-bootstrap \
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
