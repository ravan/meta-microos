SUMMARY = "Apache Velocity Tools - Generic tools"
DESCRIPTION = " \
VelocityTools is an integrated collection of Velocity subprojects \
with the common goal of creating tools and infrastructure to speed \
and ease development of both web and non-web applications using the \
Velocity template engine. \
 \
Generic tools that can be used in any context."
LICENSE = "Apache-2.0"

PV = "3.2"

RPM_NAME = "velocity-tools-generic-3.2-1.5.noarch.rpm"
RPM_HASH = "5e7ce72f9c951b0d7fb93dd7e244a61702a5d1a89d40c91e52da95b7af00d5519abe2e4e9f9f4e5ee14988010f53041b9b67684ee7a2b5bdafd355b882a31db7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.apache.velocity.tools-velocity-tools-generic \
mvn-org.apache.velocity.tools-velocity-tools-generic-pom- \
velocity-tools-generic"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.github.cliftonlabs-json-simple \
mvn-commons-beanutils-commons-beanutils \
mvn-org.apache.commons-commons-digester3 \
mvn-org.apache.commons-commons-lang3 \
mvn-org.apache.velocity-velocity-engine-core \
mvn-org.slf4j-slf4j-api"

inherit rpm
