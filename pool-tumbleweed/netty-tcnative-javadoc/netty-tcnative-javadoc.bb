SUMMARY = "API documentation for netty-tcnative"
DESCRIPTION = "API documentation for netty-tcnative."
LICENSE = "Apache-2.0"

PV = "2.0.80"

RPM_NAME = "netty-tcnative-javadoc-2.0.80-1.1.noarch.rpm"
RPM_HASH = "26fe09e8af175deeaf74242bd7592b73f8ce119e5e0160e3b31d5ffdc0687a7e8cab07c6edfd99de2d06330d7d94bbe6f79b15dbd1939e7571612ccf22634d39"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "netty-tcnative-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
