SUMMARY = "Javadoc for reload4j"
DESCRIPTION = "This package contains the API documentation for reload4j."
LICENSE = "Apache-2.0"

PV = "1.2.25"

RPM_NAME = "reload4j-javadoc-1.2.25-2.9.noarch.rpm"
RPM_HASH = "f48b03c92b49654ab5c72276e6d5f2ec5114539bc06451b0bae90493891bcd7cf316c2a0d0741478d00d29c3964a7ba44cb4b9a16c10a95ae543eba93f87d6b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "log4j12-javadoc \
reload4j-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
