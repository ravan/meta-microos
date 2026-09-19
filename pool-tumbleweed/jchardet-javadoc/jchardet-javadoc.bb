SUMMARY = "API documentation for jchardet"
DESCRIPTION = "API documentation for jchardet."
LICENSE = "GPL-2.0-or-later | MPL-1.1 | LGPL-2.1-or-later"

PV = "1.1"

RPM_NAME = "jchardet-javadoc-1.1-3.8.noarch.rpm"
RPM_HASH = "a4fc8f45c0dbfc7b0dd8f33f3d36b23bd132d82eda91313620e28067f3c6d75ee871290bdb14460ca1d881c6b960c3d2ba77bc9dd8570d44462db067e07cb3da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jchardet-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
