SUMMARY = "The GNU Compiler Collection targeting x86_64"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting x86_64. \
 \
This is a package that is necessary for bootstrapping another package \
only, it is not intended for any other use."
LICENSE = "GPL-3.0-or-later"

PV = "16.2.0+git9497"

RPM_NAME = "cross-x86_64-gcc16-bootstrap-16.2.0+git9497-3.1.aarch64.rpm"
RPM_HASH = "c19b89333a58885ae29ba7da1513df779c7bb17bae77eda52fd7d2000cb91f4f3d9a84e22b8ba7ef558c32672b8f3e566efe9ba457832680bf815a1d554507b9"

RPROVIDES:${PN} += "cross-x86-64-gcc16-bootstrap"

RDEPENDS:${PN} += "cross-x86-64-binutils \
libc.so.6"

inherit rpm
