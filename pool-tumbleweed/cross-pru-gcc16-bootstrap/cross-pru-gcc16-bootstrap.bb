SUMMARY = "The GNU Compiler Collection targeting pru"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting pru. \
 \
This is a package that is necessary for bootstrapping another package \
only, it is not intended for any other use."
LICENSE = "GPL-3.0-or-later"

PV = "16.2.0+git9497"

RPM_NAME = "cross-pru-gcc16-bootstrap-16.2.0+git9497-3.1.aarch64.rpm"
RPM_HASH = "3dd01d2dd4092e2d52f0d3ee934f35482c912c14e17217200557715af7f002a263308c1eb8a432691591d83bacff384e50090cc5c03a4d59cff3bf6791ae3cad"

RPROVIDES:${PN} += "cross-pru-gcc16-bootstrap"

RDEPENDS:${PN} += "cross-pru-binutils \
libc.so.6"

inherit rpm
