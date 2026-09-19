SUMMARY = "The GNU Compiler Collection targeting riscv64"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting riscv64. \
 \
 \
 \
 \
 \
This is a package that is necessary for bootstrapping another package \
only, it is not intended for any other use."
LICENSE = "GPL-3.0-or-later"

PV = "13.5.0+git10516"

RPM_NAME = "cross-riscv64-elf-gcc13-bootstrap-13.5.0+git10516-1.1.aarch64.rpm"
RPM_HASH = "e8c49af2f9b85e225535a22eceacaa3243f18a90cfaa6cee1a5116f9d6baab45efa9937148a6104a76611e53b0269b5305f2993f93bc805d3ec0c8a822e01835"

RPROVIDES:${PN} += "cross-riscv64-elf-gcc13-bootstrap \
riscv64-elf-gcc"

RDEPENDS:${PN} += "cross-riscv64-binutils \
libc.so.6 \
libgmp.so.10 \
libisl.so.23 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1 \
libzstd.so.1"

inherit rpm
