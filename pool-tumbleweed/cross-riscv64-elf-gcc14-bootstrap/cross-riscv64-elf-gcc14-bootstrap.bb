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

PV = "14.4.0+git12698"

RPM_NAME = "cross-riscv64-elf-gcc14-bootstrap-14.4.0+git12698-1.3.aarch64.rpm"
RPM_HASH = "3c11824f69b019bbc62e3d8cca25c77b8ce8deb412449da90675e827992e7abbdd4a33ab437c6e244ae92e67a6bab5b68f08db7871f8948bbb25c465a54395fb"

RPROVIDES:${PN} += "cross-riscv64-elf-gcc14-bootstrap \
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
