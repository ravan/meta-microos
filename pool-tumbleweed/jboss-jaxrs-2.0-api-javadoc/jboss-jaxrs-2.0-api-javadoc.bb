SUMMARY = "Javadoc for jboss-jaxrs-2.0-api"
DESCRIPTION = "This package contains the API documentation for jboss-jaxrs-2.0-api."
LICENSE = "Apache-2.0 & (CDDL-1.0 | GPL-2.0-only)"

PV = "1.0.1"

RPM_NAME = "jboss-jaxrs-2.0-api-javadoc-1.0.1-5.17.noarch.rpm"
RPM_HASH = "2d6972f388c30f2e2a71cfc1b66e7f9b28426ea08f9d49a30e4209451327d984cec3ba50eda59b16f04fd1d83b77ab1f1b052b63e8ecb36240bb185f47d396e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jboss-jaxrs-2.0-api-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
