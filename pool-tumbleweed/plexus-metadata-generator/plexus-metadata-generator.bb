SUMMARY = "Component metadata from plexus-containers"
DESCRIPTION = "Plexus contains end-to-end developer tools for writing applications. \
At the core is the container, which can be embedded or for an \
application server. There are many reusable components for hibernate, \
form processing, jndi, i18n, velocity, etc. Plexus also includes an \
application server which is like a J2EE application server."
LICENSE = "Apache-2.0 & MIT & xpp"

PV = "2.2.0"

RPM_NAME = "plexus-metadata-generator-2.2.0-3.1.noarch.rpm"
RPM_HASH = "04cc147d0b96e5ed98674e6d920bd34d644856e2774a5524065fef53e3d22f426090522ca70d63f99ce03a6f99235255f30e10f4a73acd8c6b2db0120e4ac3f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.codehaus.plexus-plexus-metadata-generator \
mvn-org.codehaus.plexus-plexus-metadata-generator-pom- \
plexus-metadata-generator"

RDEPENDS:${PN} += "/usr/bin/bash \
apache-commons-cli \
atinject \
google-guice \
guava \
jakarta-inject \
java-headless \
javapackages-filesystem \
jdom2 \
mvn-com.thoughtworks.qdox-qdox \
mvn-org.codehaus.plexus-plexus-component-annotations \
mvn-org.codehaus.plexus-plexus-utils \
mvn-org.codehaus.plexus-plexus-xml \
mvn-org.jdom-jdom2 \
mvn-org.ow2.asm-asm \
objectweb-asm \
plexus-cli \
plexus-containers-component-annotations \
plexus-utils \
plexus-xml \
qdox \
sisu-inject \
sisu-plexus \
xbean"

inherit rpm
