SUMMARY = "Javadocs for xml-maven-plugin"
DESCRIPTION = "This package contains the API documentation for xml-maven-plugin."
LICENSE = "Apache-2.0"

PV = "1.0.2"

RPM_NAME = "xml-maven-plugin-javadoc-1.0.2-2.23.noarch.rpm"
RPM_HASH = "0f99d8cd5ab867c83062fea0e06fdc66304c16985788177ba0e175509de6c0710840a894fdc7b896b411f83ff39ec45466d142e0d022e1e9c4344b61bbec3abe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xml-maven-plugin-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
