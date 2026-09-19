SUMMARY = "Javadoc for maven-deploy-plugin"
DESCRIPTION = "API documentation for maven-deploy-plugin."
LICENSE = "Apache-2.0"

PV = "3.1.4"

RPM_NAME = "maven-deploy-plugin-javadoc-3.1.4-2.1.noarch.rpm"
RPM_HASH = "370fe8d620123487129b6a2fed6458aa7ac42e5aaee39a133dfeb5ac2309b38b44dcb6ca9675e7a023a8b7d2af5ece959820ce2a5be4434e712ea5014034c22e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-deploy-plugin-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
