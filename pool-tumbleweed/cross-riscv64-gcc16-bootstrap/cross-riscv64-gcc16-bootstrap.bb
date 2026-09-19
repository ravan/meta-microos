SUMMARY = "The GNU Compiler Collection targeting riscv64"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting riscv64. \
 \
This is a package that is necessary for bootstrapping another package \
only, it is not intended for any other use."
LICENSE = "GPL-3.0-or-later"

PV = "16.2.0+git9497"

RPM_NAME = "cross-riscv64-gcc16-bootstrap-16.2.0+git9497-3.1.aarch64.rpm"
RPM_HASH = "0b4e9bd46e15c8f651a2001036239423d187f30716dda11a448c065c47d364339510c9a5556a883eaf237d815a866e7e74124501b9440cf9932db8ce39a4c78d"

RPROVIDES:${PN} += "cross-riscv64-gcc16-bootstrap"

RDEPENDS:${PN} += "cross-riscv64-binutils \
libc.so.6"

inherit rpm
