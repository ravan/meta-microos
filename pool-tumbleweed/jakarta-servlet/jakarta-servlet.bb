SUMMARY = "Server-side API for handling HTTP requests and responses"
DESCRIPTION = "Jakarta Servlet defines a server-side API for handling HTTP requests \
and responses."
LICENSE = "Apache-2.0 & (EPL-2.0 | GPL-2.0-only-with-Classpath-exception-2.0)"

PV = "6.1.0"

RPM_NAME = "jakarta-servlet-6.1.0-1.8.noarch.rpm"
RPM_HASH = "cd038c090efa373d8211eb4b5ad604340e4b340f49cd36b7b123609ad79e405377a6b5833204f38c7e5a3b7016745d8cdef8f28cb374c19ba337064cb9b76223"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jakarta-servlet \
mvn-jakarta.servlet-jakarta.servlet-api \
mvn-jakarta.servlet-jakarta.servlet-api-pom- \
osgi-jakarta.servlet-api"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
