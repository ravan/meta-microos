SUMMARY = "Javadoc for string-template-maven-plugin"
DESCRIPTION = "API documentation for string-template-maven-plugin."
LICENSE = "MIT"

PV = "1.1"

RPM_NAME = "string-template-maven-plugin-javadoc-1.1-5.6.noarch.rpm"
RPM_HASH = "f47b27c5086c1e4a661c7860b8d1f8fce916ecd8e334a12aedfa0681c55cdd771f81d06aec1237f3e7fdddf562277ad6aea49ea78fd946ac46da8d0bde7e52e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "string-template-maven-plugin-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
