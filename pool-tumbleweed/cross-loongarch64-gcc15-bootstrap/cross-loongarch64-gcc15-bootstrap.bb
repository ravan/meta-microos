SUMMARY = "The GNU Compiler Collection targeting loongarch64"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting loongarch64. \
 \
 \
 \
 \
 \
This is a package that is necessary for bootstrapping another package \
only, it is not intended for any other use."
LICENSE = "GPL-3.0-or-later"

PV = "15.3.0+git11272"

RPM_NAME = "cross-loongarch64-gcc15-bootstrap-15.3.0+git11272-1.3.aarch64.rpm"
RPM_HASH = "51d5020083dc33ddaf5a092d500f7fa027fef9050277b9d6e757e01073aafeadc2ff5ceb7aedade8732a8601b8d6924ad962581393724f9b201bfc86d3a21d50"

RPROVIDES:${PN} += "cross-loongarch64-gcc15-bootstrap \
loongarch64-suse-linux-gcc"

RDEPENDS:${PN} += "cross-loongarch64-binutils \
libc.so.6 \
libgmp.so.10 \
libisl.so.23 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1 \
libzstd.so.1"

inherit rpm
