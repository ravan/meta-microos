SUMMARY = "Plexus I18N Component"
DESCRIPTION = "Plexus contains end-to-end developer tools for writing applications. \
At the core is the container, which can be embedded or for an \
application server. There are many reusable components for hibernate, \
form processing, jndi, i18n, velocity, etc. Plexus also includes an \
application server which is like a J2EE application server."
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "plexus-i18n-1.0.0-1.5.noarch.rpm"
RPM_HASH = "3a0d7058be469db171dc6032bc53111a263fa867d32efd075a843156f1c2f8311bcccfa312c42abf6eac459a6307bc4e0be0223c8c878cd3c0836dd01aab2a5f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.codehaus.plexus-plexus-i18n \
mvn-org.codehaus.plexus-plexus-i18n-pom- \
plexus-i18n"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-javax.inject-javax.inject \
mvn-org.slf4j-slf4j-api"

inherit rpm
