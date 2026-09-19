SUMMARY = "Javadoc for apache-log4j-extras"
DESCRIPTION = "This package contains the API documentation for apache-log4j-extras."
LICENSE = "Apache-2.0"

PV = "1.2.17.1"

RPM_NAME = "apache-log4j-extras-javadoc-1.2.17.1-4.11.noarch.rpm"
RPM_HASH = "c707b09467566395743070e1923f961d9aeaa002fb51292ebfe799870e676222bf5a11dab7e3c4ec8f0bc22c4335381c795184bf1e4f5bb4a9f47be65e34fa23"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-log4j-extras-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
