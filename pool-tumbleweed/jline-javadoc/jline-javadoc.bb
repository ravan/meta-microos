SUMMARY = "Javadocs for jline"
DESCRIPTION = "This package contains the API documentation for jline."
LICENSE = "BSD-3-Clause"

PV = "2.14.6"

RPM_NAME = "jline-javadoc-2.14.6-7.8.noarch.rpm"
RPM_HASH = "3dcea1d2e2e0604823a119a9e3b842da4aa8fd765ff987cb51fb02ede1236f517a4c65a199cc691bdeaafe76a818ff544ec6cfc389baee6a5dd7cf4441839a8c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jline-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
