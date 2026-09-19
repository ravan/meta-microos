SUMMARY = "API documentation for glassfish-jsp-api"
DESCRIPTION = "API documentation for glassfish-jsp-api."
LICENSE = "Apache-2.0 & (CDDL-1.1 | GPL-2.0-only-with-Classpath-exception-2.0)"

PV = "2.3.3"

RPM_NAME = "glassfish-jsp-api-javadoc-2.3.3-6.8.noarch.rpm"
RPM_HASH = "e53c09e5cfd6b8a955a37cd2690ca489ff68b9c4f026a3a8cea6d47dc1d8ce3444c92cb08c983d542c684e816b88c5e191eb84f6140baa3c97a498ce9abedf1e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-jsp-api-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
