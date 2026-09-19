SUMMARY = "The GNU Compiler Collection targeting hppa"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting hppa. \
 \
This is a package that is necessary for bootstrapping another package \
only, it is not intended for any other use."
LICENSE = "GPL-3.0-or-later"

PV = "16.2.0+git9497"

RPM_NAME = "cross-hppa-gcc16-bootstrap-16.2.0+git9497-3.1.aarch64.rpm"
RPM_HASH = "4f22ff94c197ef723cadeec35902032aa9b1e668c3e107f0a4f78e5d9ee9f78b6afc1faf518108fa41eef61d68542b2a760e103d57fdb7072932f9eafeeed198"

RPROVIDES:${PN} += "cross-hppa-gcc16-bootstrap"

RDEPENDS:${PN} += "cross-hppa-binutils \
libc.so.6"

inherit rpm
