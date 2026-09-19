SUMMARY = "The GNU Compiler Collection targeting arm-none"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting arm-none. \
 \
This is a package that is necessary for bootstrapping another package \
only, it is not intended for any other use."
LICENSE = "GPL-3.0-or-later"

PV = "16.2.0+git9497"

RPM_NAME = "cross-arm-none-gcc16-bootstrap-16.2.0+git9497-3.1.aarch64.rpm"
RPM_HASH = "8c69b35b013f42cde5218720917acb29b0ea18c8b77833a899655b8cb7d998806b1d946f353c08ddd99ef09982f8c18a42f4a655472a016f0c60dfa1324a845c"

RPROVIDES:${PN} += "cross-arm-none-gcc16-bootstrap"

RDEPENDS:${PN} += "cross-arm-binutils \
libc.so.6"

inherit rpm
