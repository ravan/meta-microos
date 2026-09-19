SUMMARY = "Jakarta Server Pages"
DESCRIPTION = "Jakarta Pages defines a template engine for web applications."
LICENSE = "Apache-2.0 & (EPL-2.0 | GPL-2.0-only-with-Classpath-exception-2.0)"

PV = "4.0.0"

RPM_NAME = "jakarta-pages-4.0.0-3.4.noarch.rpm"
RPM_HASH = "e81a596a409df19c23acbe8f8d247edb2de996caa1103cdb4d3b536a0b0236b18cb9d77231df8a10f9549a9f5e5ef8c8a65e2f909f6b62ef84c37b1b61f79029"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jakarta-pages \
mvn-jakarta.servlet.jsp-jakarta.servlet.jsp-api \
mvn-jakarta.servlet.jsp-jakarta.servlet.jsp-api-pom- \
osgi-jakarta.servlet.jsp-api"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm
