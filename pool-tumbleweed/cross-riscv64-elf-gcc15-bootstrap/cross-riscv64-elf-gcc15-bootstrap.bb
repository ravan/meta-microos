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

PV = "15.3.0+git11272"

RPM_NAME = "cross-riscv64-elf-gcc15-bootstrap-15.3.0+git11272-1.3.aarch64.rpm"
RPM_HASH = "f65b9b5e946006da433bd66be74815faf8c71fc90e2b79cc84a1ef6629b4d93ba8c3ecf9267ff3b00c62d1a443c44222b55133ee19f9e0455b41e6561deb2957"

RPROVIDES:${PN} += "cross-riscv64-elf-gcc15-bootstrap \
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
