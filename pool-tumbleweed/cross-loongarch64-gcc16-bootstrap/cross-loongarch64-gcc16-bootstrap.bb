SUMMARY = "The GNU Compiler Collection targeting loongarch64"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting loongarch64. \
 \
This is a package that is necessary for bootstrapping another package \
only, it is not intended for any other use."
LICENSE = "GPL-3.0-or-later"

PV = "16.2.0+git9497"

RPM_NAME = "cross-loongarch64-gcc16-bootstrap-16.2.0+git9497-3.1.aarch64.rpm"
RPM_HASH = "5b7fc5962e587b88331ca46dc61c36efdf9df39f8c0fb966331c664ec0de9a108171ebe6f3c490ed9acdde73d4da14464a9375ff0bf1e721be0755846264c3f6"

RPROVIDES:${PN} += "cross-loongarch64-gcc16-bootstrap"

RDEPENDS:${PN} += "cross-loongarch64-binutils \
libc.so.6"

inherit rpm
