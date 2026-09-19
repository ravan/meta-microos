SUMMARY = "The GNU Compiler Collection targeting s390x"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting s390x. \
 \
This is a package that is necessary for bootstrapping another package \
only, it is not intended for any other use."
LICENSE = "GPL-3.0-or-later"

PV = "16.2.0+git9497"

RPM_NAME = "cross-s390x-gcc16-bootstrap-16.2.0+git9497-3.1.aarch64.rpm"
RPM_HASH = "95482411a8a80665b674033fea739d324b53e198327416e3b3dbb0a57a80d20e195a3f4761d93d2e7274c081685e9d61c0cc5f7f1f1a538654aab2abe710873f"

RPROVIDES:${PN} += "cross-s390x-gcc16-bootstrap"

RDEPENDS:${PN} += "cross-s390x-binutils \
libc.so.6"

inherit rpm
