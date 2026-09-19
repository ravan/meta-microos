SUMMARY = "The GNU Compiler Collection targeting ppc64le"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting ppc64le. \
 \
This is a package that is necessary for bootstrapping another package \
only, it is not intended for any other use."
LICENSE = "GPL-3.0-or-later"

PV = "16.2.0+git9497"

RPM_NAME = "cross-ppc64le-gcc16-bootstrap-16.2.0+git9497-3.1.aarch64.rpm"
RPM_HASH = "2c9d8c59c4c2a9fdfbf10e167a9750a299c167ec09667f48450ccde7f5ff64dc9f88e93ca15559ea81fb35728668173b0d23b5db7ee70aea7f01fcf6b451304a"

RPROVIDES:${PN} += "cross-ppc64le-gcc16-bootstrap"

RDEPENDS:${PN} += "cross-ppc64le-binutils \
libc.so.6"

inherit rpm
