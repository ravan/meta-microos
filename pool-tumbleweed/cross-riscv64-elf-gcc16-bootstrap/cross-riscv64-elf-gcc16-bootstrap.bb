SUMMARY = "The GNU Compiler Collection targeting riscv64"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting riscv64. \
 \
This is a package that is necessary for bootstrapping another package \
only, it is not intended for any other use."
LICENSE = "GPL-3.0-or-later"

PV = "16.2.0+git9497"

RPM_NAME = "cross-riscv64-elf-gcc16-bootstrap-16.2.0+git9497-3.1.aarch64.rpm"
RPM_HASH = "760f9606e3094191fb97d584561799d859af2a15371b3cf900c78498fe757ab418abd75138d4cd8b872a10d8e0c89edd7e505e2b6a82941ca0869914ee80104d"

RPROVIDES:${PN} += "cross-riscv64-elf-gcc16-bootstrap"

RDEPENDS:${PN} += "cross-riscv64-binutils \
libc.so.6"

inherit rpm
