SUMMARY = "Plexus Resource Manager"
DESCRIPTION = "Plexus contains end-to-end developer tools for writing applications. \
At the core is the container, which can be embedded or for an \
application server. There are many reusable components for hibernate, \
form processing, jndi, i18n, velocity, etc. Plexus also includes an \
application server which is like a J2EE application server."
LICENSE = "MIT"

PV = "1.3.1"

RPM_NAME = "plexus-resources-1.3.1-1.5.noarch.rpm"
RPM_HASH = "b8a276f7852bb64926c117a00852cba26e1417829423f1ed443782863bbad55dbb787c732f6fa5b94c344837c686b86c3d6869d0c5b971f5fce053cabc2756db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.codehaus.plexus-plexus-resources \
mvn-org.codehaus.plexus-plexus-resources-pom- \
plexus-resources"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-javax.inject-javax.inject \
mvn-org.codehaus.plexus-plexus-utils \
mvn-org.codehaus.plexus-plexus-xml \
mvn-org.slf4j-slf4j-api"

inherit rpm
