SUMMARY = "The GNU Compiler Collection targeting rx"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting rx. \
 \
This is a package that is necessary for bootstrapping another package \
only, it is not intended for any other use."
LICENSE = "GPL-3.0-or-later"

PV = "16.2.0+git9497"

RPM_NAME = "cross-rx-gcc16-bootstrap-16.2.0+git9497-3.1.aarch64.rpm"
RPM_HASH = "5f55c88fb2b9379a835b6f25a88c7ea9807832fba8207e9f897c29da3ec72d0b8ade09c6555e4b4254de444e6e9548366e03cd863cd87e646d7ac394c55eba08"

RPROVIDES:${PN} += "cross-rx-gcc16-bootstrap"

RDEPENDS:${PN} += "cross-rx-binutils \
libc.so.6"

inherit rpm
