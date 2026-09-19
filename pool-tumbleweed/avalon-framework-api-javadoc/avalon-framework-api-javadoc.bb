SUMMARY = "Javadoc for avalon-framework-api"
DESCRIPTION = "API documentation for avalon-framework-api."
LICENSE = "Apache-2.0"

PV = "4.3"

RPM_NAME = "avalon-framework-api-javadoc-4.3-8.3.noarch.rpm"
RPM_HASH = "9a6bcd8bcbe6da73881779d52cc5d893605ae5f19a95ba1445db6988358385617cf4e49855cfae14b52afe28bd440ae1581215a18416ea7d0f475a65b1e6afa0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "avalon-framework-api-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
