SUMMARY = "RPM file correctness checker"
DESCRIPTION = "rpmlint is a tool to check common errors on RPM packages. Binary and \
source packages can be checked."
LICENSE = "GPL-2.0-or-later"

PV = "2.10.0+git20260911.f4f012f3"

RPM_NAME = "rpmlint-strict-2.10.0+git20260911.f4f012f3-1.1.noarch.rpm"
RPM_HASH = "78bb1a94e3d616eccd93831b24210da618480b7f22217137efc45a86605fb5f8218db8e3dddc9a48a053e1aea5e62a41e2141b8107a1798c0dffb393b2b7c865"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-rpmlint-strict \
rpmlint-strict"

RDEPENDS:${PN} += ""

inherit rpm
