SUMMARY = "Javadoc for slf4j"
DESCRIPTION = "API documentation for slf4j."
LICENSE = "Apache-2.0 & MIT"

PV = "2.0.18"

RPM_NAME = "slf4j-javadoc-2.0.18-1.2.noarch.rpm"
RPM_HASH = "f08dc3ad1c9ade0debdcc25cb55dbf17e5b398ff584b1fb1c0a1281d8b470a03c26b35f9b6918144d9f8f90613fc88e8e6b1efd8cfab403a24add273a9c732b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "slf4j-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
